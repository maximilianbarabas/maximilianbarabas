/*
 * File: Inputems.java
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

import views.MainWindow;

public class Inputems {
    MainWindow mainWindow;
    //Az osztály konstruktora
    public Inputems(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
        this.mainWindow.exitB.addActionListener(event ->{
            System.exit(0);
        });
    }
    
}

/**
 * 2021-11-21  Kezdés
 * 2021-11-21 Szemetelés
 */