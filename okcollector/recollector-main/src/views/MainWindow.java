/*
 * File: MainWindow.java
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
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class MainWindow extends JFrame {

    public JLabel appLabel;
    public JTextField urlField;

    public JPanel collectorPanel;
    public JButton addTemptToList;
    public JButton StartB;
    public JButton infoB;
    public JButton exitB;


    public JPanel listWordPanel;
    public JLabel isWords;

    public DefaultListModel<String> wordsModel;
    public JList<String> wordsList;
    public JScrollPane wordsScrollPane;

    public JButton deleteB;
    public JButton lowercaseB;
    public JButton filterB;
    public JButton saveB;

    public JPanel listBPanel;

    public JPanel bottomP;
    public WriteAllBar statusBar;

    public MainWindow() {
        appLabel = new JLabel("Szógyűjtő");
        urlField = new JTextField();        

        collectorPanel = new JPanel();
        collectorPanel.setLayout(new BoxLayout(collectorPanel, BoxLayout.LINE_AXIS));
        addTemptToList = new JButton("Beillesztés");
        StartB = new JButton("Start");
        infoB = new JButton("Névjegy");
        exitB = new JButton("Kilépés");

        this.collectorPanel.add(addTemptToList);
        this.collectorPanel.add(StartB);
        this.collectorPanel.add(infoB);
        this.collectorPanel.add(exitB);


        listWordPanel = new JPanel();
        listWordPanel.setLayout(new BoxLayout(listWordPanel, BoxLayout.PAGE_AXIS));
        isWords = new JLabel("Talált szavak");

        wordsModel = new DefaultListModel<>();
        wordsList = new JList<>(wordsModel);
        wordsScrollPane = new JScrollPane(wordsList);
        listWordPanel.add(isWords);
        listWordPanel.add(wordsScrollPane);

        deleteB = new JButton("Törlés");
        deleteB.setMinimumSize(new Dimension(110, 25));
        deleteB.setMaximumSize(new Dimension(110, 25));
        deleteB.setPreferredSize(new Dimension(110, 25));
        deleteB.setMargin(new Insets(20, 20, 20, 20));

        lowercaseB = new JButton("Kisbetű");
        lowercaseB.setMinimumSize(new Dimension(110, 25));
        lowercaseB.setMaximumSize(new Dimension(110, 25));
        lowercaseB.setPreferredSize(new Dimension(110, 25));
        
        filterB = new JButton("Szűrés");
        filterB.setMinimumSize(new Dimension(110, 25));
        filterB.setMaximumSize(new Dimension(110, 25));
        filterB.setPreferredSize(new Dimension(110, 25));

        saveB = new JButton("Mentés");
        saveB.setMinimumSize(new Dimension(110, 25));
        saveB.setMaximumSize(new Dimension(110, 25));
        saveB.setPreferredSize(new Dimension(110, 25));
        


        listBPanel = new JPanel();
        listBPanel.setLayout(new BoxLayout(listBPanel, BoxLayout.PAGE_AXIS));
        listBPanel.add(Box.createVerticalGlue());
        listBPanel.add(Box.createVerticalGlue());
        listBPanel.add(deleteB);
        listBPanel.add(Box.createVerticalGlue());
        listBPanel.add(lowercaseB);
        listBPanel.add(Box.createVerticalGlue());
        listBPanel.add(filterB);
        listBPanel.add(Box.createVerticalGlue());
        listBPanel.add(saveB);
        listBPanel.add(Box.createVerticalGlue());
        listBPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        bottomP = new JPanel();
        bottomP.setLayout(new BoxLayout(bottomP, BoxLayout.LINE_AXIS));
        bottomP.add(listWordPanel);
        bottomP.add(listBPanel);
        


        this.setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));

        this.add(appLabel);
        this.add(urlField);
        this.add(collectorPanel);
        this.add(bottomP);
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // this.setSize(300, 250);
        this.pack();
        /**
         * A pack() után kell szerepeljen, mert az ablak mérete
         * csak az után van meg.
         */
        statusBar = new WriteAllBar(this.getWidth());
        this.add(statusBar);

    }
    
}
