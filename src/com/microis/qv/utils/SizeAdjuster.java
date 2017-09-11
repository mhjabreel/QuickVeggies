/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microis.qv.utils;

import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Mohammed Jabreel
 */
public class SizeAdjuster {
    
    public static void setMargin(Node node, double marginValue) {
        AnchorPane.setTopAnchor(node, marginValue);
        AnchorPane.setRightAnchor(node, marginValue);
        AnchorPane.setBottomAnchor(node, marginValue);
        AnchorPane.setLeftAnchor(node, marginValue);
    }    
}
