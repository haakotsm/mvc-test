/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Håkon
 */
public class JavaFXApplication4 extends Application {

    @Override
    public void start(Stage primaryStage) {
       NewClass c =  new NewClass(primaryStage);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
