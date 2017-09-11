/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microis.qv.controllers;

import com.microis.qv.Module;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Mohammed Jabreel
 */
public class AppController implements Initializable {

    private static AppController instance;
    
    @FXML
    private AnchorPane mainContainer;
    
    @FXML
    void btnSearchClicked(ActionEvent evt) {
        Module.showPage("search", mainContainer);
    }
    
    @FXML
    void btnAddBuyerClicked(ActionEvent evt) {
        Module.showPage("buyer/add_buyer", mainContainer);
    }    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
