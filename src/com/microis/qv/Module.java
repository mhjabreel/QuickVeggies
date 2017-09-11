/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microis.qv;

import com.microis.qv.utils.SizeAdjuster;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Mohammed Jabreel
 */
public class Module {
    
    
    public static void showPage(String name, AnchorPane mainContainer) {
        try {
            AnchorPane pane =  FXMLLoader.load(App.class.getResource(String.format("views/%s.fxml", name)));
            mainContainer.getChildren().clear();
            mainContainer.getChildren().add(pane);
            SizeAdjuster.setMargin(pane, 0);           
        } catch (IOException ex) {
            Logger.getLogger(Module.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
