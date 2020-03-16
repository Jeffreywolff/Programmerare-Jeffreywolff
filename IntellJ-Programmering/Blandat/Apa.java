import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

import static sun.plugin.javascript.navig.JSType.Image;

public class Apa extends Application implements EventHandler<ActionEvent> {

    //Button
    HBox _buttonBox = new HBox();
    Button _sweKey;
    Button _jamKey;

    //Define all main GUI elements
    Stage _window;
    HBox _root = new HBox(buttons());
    // Spacing

    VBox spacingVBox = new VBox();
    


    //
    StackPane _flagScene = new StackPane(jamaica());
    VBox _placementVbox = new VBox(_root,spacingVBox, _flagScene);
    // BorderPane _border = new BorderPane(_buttonBox);

    @Override
    public void start(Stage window) {

        _window = window;


        //Scene Settings:
        _window.setFullScreen(true);
        _window.setTitle("RED-BOX Games");

        Scene _mainScene = new Scene(_placementVbox, 1500, 1000);
        _window.setScene(_mainScene);
        _window.show();

    }




    private HBox buttons(){


        _sweKey = new Button("Sweden");
        _sweKey.setOnAction(this);

        _jamKey = new Button("Jamaica");
        _jamKey.setOnAction(this);

        _buttonBox.getChildren().addAll(_sweKey);
        _buttonBox.getChildren().addAll(_jamKey);




        return _buttonBox;
    }

    private StackPane jamaica() {
        // Flag Objects
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle();
        Rectangle backgroundBlack = new Rectangle();
        Polygon triangle0 = new Polygon();
        Polygon triangle1 = new Polygon();

        // PLacement
        VBox flagOfJamaicaV1 = new VBox(triangle0);
        VBox flagOfJamaicaV2 = new VBox(triangle1);

        VBox flagOfJamaica1 = new VBox(flagOfJamaicaV1, flagOfJamaicaV2);
        StackPane flagOfJamaica0 = new StackPane(backgroundBlack, flagOfJamaica1);

        //Objects code
        //Rectangle_0
        rectangle.setHeight(150);
        rectangle.setWidth(2500);
        rectangle.setFill(Color.YELLOW);
        rectangle.setX(-800);
        rectangle.setY(890);
        rectangle.getTransforms().add(new Rotate(-29));
        //Rectangle_1
        rectangle1.setHeight(150);
        rectangle1.setWidth(2500);
        rectangle1.setFill(Color.YELLOW);
        rectangle1.setX(0);
        rectangle1.setY(-40);
        rectangle1.getTransforms().add(new Rotate(29));

        //Triangle_0
        triangle0.getPoints().addAll(new Double[]{
                0.0, 0.0,
                1920.0, 0.0,
                960.0, 489.0 });
        triangle0.setFill(Color.GREEN);

        //Triangle_1
        triangle1.getPoints().addAll(new Double[]{
                0.0, 0.0,
                1920.0, 0.0,
                960.0, 489.0 });
        triangle1.setFill(Color.GREEN);
        triangle1.setRotate(180);

        // BackgoundBlack
        backgroundBlack.setFill(Color.BLACK);


        return flagOfJamaica0;
    }

    private StackPane sweden() {
        Rectangle bgColor = new Rectangle(300, 200);
        Rectangle horizontalLine = new Rectangle( 50, 200, Color.YELLOW);
        Rectangle verticalLine = new Rectangle( 300, 50, Color.YELLOW);

        StackPane flagOfSweden = new StackPane();

        flagOfSweden.getChildren().addAll(bgColor, horizontalLine, verticalLine);
        return flagOfSweden;
    }

    @Override
    public void handle(ActionEvent actionEvent) {

        if(actionEvent.getSource() == _sweKey){
            if(_root.getChildren().size() == 1){
                _root.getChildren().add(sweden());
                return;
            }
            _root.getChildren().remove(1);
            _root.getChildren().add(sweden());

        }
        else if(actionEvent.getSource() == _jamKey){
            if(_root.getChildren().size() == 1){
                _root.getChildren().add(jamaica());
                return;
            }
            _root.getChildren().remove(1);
            _root.getChildren().add(jamaica());
        }

    }
    public static void main(String[] args) {
        launch(args);
    }
}
