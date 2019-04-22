
import javax.swing.JFrame;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;


public class Main extends Application {
  @Override
  public void start(Stage primaryStage) {
    try {  
      Scene scene = new Scene(getSaveMenu(), 500, 500);
      scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
      primaryStage.setScene(scene);
      primaryStage.setTitle("Quiz Generator");
      primaryStage.show();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  private BorderPane getMainMenu() {

    Label label = new Label("Main Menu");
    Label numQuestions = new Label("X Questions available");
    
    ObservableList<String> topics =
        FXCollections.observableArrayList("Linux", "ADTs", "Search Trees");
    ComboBox<String> topicBox = new ComboBox<>(topics);
    
    BorderPane root = new BorderPane();
    
    Button load = new Button("  Load Questions ");
    Button add = new Button("   Add Questions ");
    Button save = new Button("  Save Questions ");
    Button next = new Button("START");
    
    Image one = new Image("100x100blank.png");
    Image two = new Image("150x150blank.png");
    Image three = new Image("100x300blank.png");
    ImageView img1 = new ImageView(two);
    ImageView img2 = new ImageView(three);
    ImageView img3 = new ImageView(one);
    
    VBox leftVBox = new VBox(label, img1);
    VBox rightVBox = new VBox(numQuestions, img2, next);
    VBox centerVBox = new VBox(img3, load, add, save, topicBox);
    root.setCenter(centerVBox);
    root.setLeft(leftVBox);
    root.setRight(rightVBox);
    
    return root;
  }

  private BorderPane getSaveMenu() {
    Label label = new Label("Save Menu");
    Label numQuestions = new Label("X Questions available");
    
    BorderPane root = new BorderPane();
    
    Label jsonLabel = new Label("Save as JSON:");
    TextField jsonName = new TextField("Enter JSON File here");
    
    Button next = new Button("SAVE");
    Button back = new Button("BACK");
    
    Image two = new Image("150x150blank.png");
    Image three = new Image("100x300blank.png");
    ImageView img2 = new ImageView(two);
    ImageView img3 = new ImageView(three);
    ImageView img4 = new ImageView(three);
    
    VBox leftVBox = new VBox(label, img4, back);
    VBox rightVBox = new VBox(numQuestions, img3, next);
    VBox centerVBox = new VBox(img2, jsonLabel, jsonName);
    root.setCenter(centerVBox);
    root.setLeft(leftVBox);
    root.setRight(rightVBox);
    
    return root;
  }

  //TODO
  private BorderPane getLoadMenu() {
    BorderPane root = new BorderPane();
    return root;
  }

  //TODO
  private BorderPane getAddMenu() {
    BorderPane root = new BorderPane();
    return root;
  }

	public static void main(String[] args) {
		launch(args);
	}
}

