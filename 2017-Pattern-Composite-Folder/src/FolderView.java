import java.io.File;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

@FunctionalInterface
interface FileFilter{
	boolean filter(String fileName);
}

public class FolderView extends Application implements FileFilter{
	private Button selectBtn = new Button("폴더 선택");
	private TextArea infoboard = new TextArea();
	private BorderPane mainPane = null;
	private Stage mainStage = null;
	private TreeView<String> tree; 
	private FileFilter f;
	private String filenameExtension= ".jpg"; 
	// .cpp, html 등등 확장자가 들어가는 변수
	
	private NonLeaf constructFolderTree(File selectedDirectory){
		// 자식들이 있어야 하겠음, child로써 add하는식으로 
		// 반복자로 반복하면서
		// 일반파일들을 leaf로, 폴더들은 nonleaf, 폴더들에 대해서 recursive하게 더 들어가야 하겠음
		NonLeaf folder = new NonLeaf(selectedDirectory.getName());
		File[] list = selectedDirectory.listFiles();
		for(File file: list){
			if(file.isDirectory()){ // 디렉토리가 존재할 경우
				NonLeaf node = constructFolderTree(file); 
				// 안에서 recursive하게 하위에도 트리구조를 생성하면서 파일들이 들어가게끔
				folder.add(node);
				// 노드를 추가
			}
			else folder.add(new Leaf(file.getName()));
			// 리프를 추가, 폴더가 아닌 파일이 해당 폴더의 하위에 들어감
		}
		return folder;
	}
	
	private TreeItem<String> constructTreeItem(NonLeaf currentFolder){
		currentFolder = currentFolder.getRearranged();
		// 기존 내용의 노드를 바꾸지 않고, 안에있는 arrayList만 sorting해서 되게끔 하기
		// Tree view로 생성하게끔
		TreeItem<String> root = new TreeItem<>(currentFolder.getName());
		for(int i=0; i<currentFolder.numberOfChilds(); i++){
			TreeNode node = currentFolder.getChild(i);
			TreeItem<String> item = null;
			if(node instanceof NonLeaf){
				item = constructTreeItem((NonLeaf)node);
				// node가 nonleaf객체일 경우, 즉 폴더일 경우
				// 재귀적으로 item에 대해서 node를 호출
			}
			else item = new TreeItem<>(node.getName());
			root.getChildren().add(item);
		}
		// tree item들로 구성되어있음
		// 자식들을 추가할 수 있다고 함
		// tree item도 recursive하게 만들어 주기 none recursive하게 처리를 해 주어야 하겠음
		return root;
	}
	
	// 필터 기능을 생성하게끔
	public TreeItem<String> constructFilteredTreeItem(NonLeaf currentFolder, FileFilter filter) {
		currentFolder = currentFolder.getRearranged();
		// 루트노드 할당
		TreeItem<String> root = new TreeItem<>(currentFolder.getName());
		for(int i=0; i<currentFolder.numberOfChilds(); i++){
			TreeNode node = currentFolder.getChild(i);
			TreeItem<String> item = null;
			if(node instanceof NonLeaf){
				// 디렉토리를 만날 경우 재귀적인 호출
				item = constructFilteredTreeItem((NonLeaf)node, f);
				root.getChildren().add(item);
				// 디렉토리 노드를 추가
			}
			else {
				// 파일을 만날 경우
				item = new TreeItem<>(node.getName());
				if ( filter(node.getName()) ) {
					root.getChildren().add(item);
					// 자식 아이템(노드)을 추가하도록
				}
				// 파일을 만났는데 그 디렉토리 내에 파일들 중에 일치하는 확장자가 없을 경우
				else {
					root.getChildren().remove(item);
					// 그 자식을 삭제하여 안보이게 함
				}
				
			}
			// 트리에 노드를 추가할 때에 확장자가 .cpp인(문자열 변수 filenameExtension에 해당되는) 파일만 추가함
		}
		return root;
	}
	
	private void directoryList(){
		DirectoryChooser chooser = new DirectoryChooser();
		File selectedDirectory = chooser.showDialog(mainStage);
		if(selectedDirectory==null) return;
		
		NonLeaf currentFolder = constructFolderTree(selectedDirectory);
		// TreeItem<String> root = constructTreeItem(currentFolder);
		TreeItem<String> root = constructFilteredTreeItem(currentFolder, f);
		root.setExpanded(true); // 시작할 때 펼쳐져서 나타나게(true), 그렇지 않게 나타나게(false)
		tree = new TreeView<>(root);  
		mainPane.setCenter(tree);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		mainStage = primaryStage;
		mainPane = new BorderPane();
		
		HBox buttonPane = new HBox();
		buttonPane.setPadding(new Insets(10));
		buttonPane.setSpacing(10);
		buttonPane.setAlignment(Pos.CENTER);
		buttonPane.getChildren().add(selectBtn);
		selectBtn.setOnAction(e->directoryList());
		
		StackPane centerPane = new StackPane();
		centerPane.setPadding(new Insets(10));
		centerPane.getChildren().add(infoboard);
		infoboard.setEditable(false);
		
		mainPane.setCenter(centerPane);
		mainPane.setBottom(buttonPane);
		primaryStage.setTitle("폴더 내용 보여주기");
		primaryStage.setScene(new Scene(mainPane,400,200));
		primaryStage.show();
	}
	public static void main(String[] args){
		Application.launch(args);
	}

	
	// filter 인터페이스에 메소드를 구현
	// 특정 확장자의 파일을 만날 경우 참(true)을 반환하는 메소드
	@Override
	public boolean filter(String fileName) {
		if ( fileName.indexOf(filenameExtension)
				> fileName.length() - (filenameExtension.length()+1) ) {
			return true;
		
			// 확장자의 위치는 항상 파일이름의 끝에 위치함
			// 그래서 그냥 파일이름의 마지막에서 몇 번째의 위치에 길이로 확장자가 들어있는 지 판단하도록 함
			// 달리말해서 파일이름의 마지막에 있는  (.cpp이면 파일이름 뒤에서 4+1번째부터 .cpp가 있는지 확인해보게끔)
			// 확장자의 인덱스를 보고 찾으려는 확장자 비교
		}
		else
			return false;
	}
}
