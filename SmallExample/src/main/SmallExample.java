/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import view.MainView;

/**
 *
 * @author castuardo
 */
public class SmallExample {
    
    // Cesar: This is the main function. For this
    // types of apps, it only performs duties like
    // opening the main view
    public static void main(String... args){
         /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }
    
}
