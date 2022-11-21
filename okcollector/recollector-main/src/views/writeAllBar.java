/*
 * File: writeAllBar.java
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

package views;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class writeAllBar extends JPanel {
    /**
     * A Java Swing és AWT csomag nem tartalmaz Status sávot. 
     * Minden programozói könyvtár, amely felhasználói felület
     * létrehozására képes, általában tartalmaz stuszsáv
     * megvalósítására alkalmas osztályt, vagy valamilyen
     * eszközt. A Java elég elterjedt, ennek ellenére nem
     * tette bele statuszsáv megvalósítására alkalmas 
     * osztály. 
     */
    // Ezen lesz a státuszsáv
    JLabel writeLabel;

    // Ez az osztály konstruktora
    public writeAllBar(int width) {        
        setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        setSize(width, 25);
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        writeLabel = new JLabel("Kész");
        this.setmessage("Kész");
        this.add(writeLabel);
    } // A writeAllBar konstruktor vége
    
    //Ez állítja be a méretét státuszsornak
    public void setSize(int x, int y) {
        // A setMaximumSize() függvény csak Demension osztály képes fogadni
        // Nem tudtak jobbat?
        setMaximumSize(new Dimension(x, y));
        setMinimumSize(new Dimension(x, y));
        setPreferredSize(new Dimension(x, y));
    } //A setSize függvény vége

    //A státuszsor tartalmát állítjuk be
    public void setmessage(String message) {
        // A statusz üzenetnek külön függvényt csináltunk.
        this.writeLabel.setText(message);
    } // a setMessage() függvény vége
}
