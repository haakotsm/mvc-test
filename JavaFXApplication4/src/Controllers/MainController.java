package Controllers;

import Core.Objekt;
import misc.About;
import Core.ObjektList;
import Core.Visual;
import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Slider;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    //objekter relatert til GUI
    @FXML
    Canvas canvas;
    @FXML
    Slider slider;

    //datafelt
    private GraphicsContext gc;
    private AnimationTimer animationTimer;
    private boolean isOn = false;

    //instansering av klasser / objekter
    Visual visual;
    ObjektList objektList;

    About alertClass;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        gc = canvas.getGraphicsContext2D();
        visual = new Visual(gc);
        objektList = new ObjektList();
        for(int i = 0; i < 10; i++) objektList.addObjekt(i*80, i*10);
        alertClass = new About();
        canvas.setFocusTraversable(true);

        animationTimer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                gc.setEffect(null);
                visual.setShapeSize((int) slider.getValue());
                visual.clearOld();
                for(int i = 0; i < objektList.getAmountObjekts(); i++){
                    visual.spawnShape(objektList.getObjekt(i).getX(), objektList.getObjekt(i).getY());
                }
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                }
            }
        };
        objektList.startObjekts();
        animationTimer.start();
    }

    public void onCloseClick(ActionEvent event) {
        objektList.killObjekts();
        System.exit(0);
    }

    public void onAboutClick(ActionEvent event) {
        alertClass.info();
    }

}
