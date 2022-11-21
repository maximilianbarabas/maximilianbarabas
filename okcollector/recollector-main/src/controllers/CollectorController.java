/*
 * File: CollectorController.java
 * Created Date: 2021-11-21 10:42:41
 * Author: Barabás Maximilián 
 * Github: https://github.com/maximilianbarabas
 * -----
 * Last Modified: 2021-11-21
 * Modified By: Barabás Maximilián 
 * -----
 * Copyright (c) 2021 Barabás Maximilián 
 * 
 * GNU GPL v2
 */

package controllers;

import java.util.ArrayList;

import models.Temp;
import views.MainWindow;

/**********************KEZDÉS************************************* */

/* 
    FIXME Az öröklés felesleges. 
    Ha megszüntetjük szükség lesz egy mainWindow adattagra. 
*/

// A CollectorController osztály
public class CollectorController extends MainController {
    //A CollectorController osztály konstruktora    
    public CollectorController(MainWindow mainWindow) {
        super(mainWindow);
        //A vágólap tartalmát beillesztjük


        /**************** pasteButton ****************************/

        mainWindow.addTemptToList.addActionListener(event -> {
            System.out.println("beillesztés");
            mainWindow.urlField.paste();
        }); // A pasteButton eseménykezelő vége


        /**************** startButton ****************************/


        //Indul a szógyűjtés
        mainWindow.StartB.addActionListener(event -> {
            // URL
            String utvonal = mainWindow.urlField.getText();
            if (utvonal.isEmpty()) {
                utvonal = "https://index.hu";
            }
            //Egy weblap
            Temp page = new Temp();
            page.setupUrl(utvonal);
            //Gyűjtött szavak ide kerülnek:
            ArrayList<String> w = page.getContent();

            for(String word : w) {
                if (mainWindow.wordsModel.indexOf(word)<0) {
                    mainWindow.wordsModel.addElement(word);
                }                
            } // for ciklus vége
            Integer wordCount = mainWindow.wordsModel.getSize();
            mainWindow.statusBar.setmessage("Szavak: " + wordCount.toString());
        }); //A start eseménykezelő vége

         /**************** VÉGE ****************************/


    }   
}
