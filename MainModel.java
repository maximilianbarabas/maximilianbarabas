/*
* File: MainController.java
* Author: Barabas Maximilian
* Copyright: 2022, Barabas Maximilian
* Group: Szoft I N 
* Date: 2022-05-31
* Github: https://github.com/maximilianbarabas
* Licenc: GNU GPL
*/

package models;

import java.util.Arrays;
import java.util.Vector;

public class MainModel {
    Beo[] groupArray = {
        new Neon(1, "Doktor"),
        new Neon(2, "Zenész"),
        new Neon(3, "Vegyész"),
        new Neon(4, "Gépészmérnők"),
        new Neon(5, "Biztonságiőr"),
        new Neon(6, "Szerelő"),
        new Neon(7, "Értékesítő"),
        new Neon(8, "Építész"),
        new Neon(9, "Kereskedő"),
        new Neon(10, "Programozó"),

    };
    public Vector<Beo> groupList = new Vector<>(Arrays.asList(groupArray));
    Worker[]workerArray={//lista készítés, érték hozzáadás
        new Worker(1, "Bíbor Anita", 5),
        new Worker(2, "Munkács Miklós", 4),
        new Worker(3, "Hilbert Ákos", 5),
        new Worker(4, "Török Ferenc", 6),
        new Worker(5, "Síklósi Éva", 9),
        new Worker(6, "Tóth Miklós", 3),
        new Worker(7, "Lázár Tamás", 3),
        new Worker(8, "Nagy Ferenc", 4),
        new Worker(9, "Kiss Ferenc", 10),
        new Worker(10, "Bognár Éva", 6),


    };
    public Vector<Worker>workerList = new Vector<>(Arrays.asList(workerArray));
    
}

