/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microis.qv;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Mohammed Jabreel
 */
public class App extends Application {
    
    private static Stage currStage;
    private static Scene currScene;
    
    private static AnchorPane currPage;
    
    
    @Override
    public void start(Stage primaryStage) {
        
        try {
            currStage = primaryStage;
            currPage = FXMLLoader.load(App.class.getResource("views/app/app.fxml"));
            currScene = new Scene(currPage);
            
            primaryStage.initStyle(StageStyle.UNDECORATED);
            
            Rectangle2D window = Screen.getPrimary().getVisualBounds();
            
            primaryStage.setX(0);
            primaryStage.setY(0);
            primaryStage.setWidth(window.getWidth());
            primaryStage.setHeight(window.getHeight());
            
            primaryStage.setScene(currScene);
            primaryStage.show();
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
