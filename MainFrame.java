/*
* File: MainController.java
* Author: Barabas Maximilian
* Copyright: 2022, Barabas Maximilian
* Group: Szoft I N 
* Date: 2022-05-31
* Github: https://github.com/maximilianbarabas
* Licenc: GNU GPL
*/

package views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class MainFrame extends JFrame {
    JPanel mainPanel;
    public DefaultComboBoxModel<String> groupModel;
    public JComboBox<String> groupCombo;
    public DefaultListModel<String> workerModel;
    public JList<String> workerList;
    JScrollPane scrollPane;
    public MainFrame() {
        this.setMainComponent();
        this.setMainPanel();
        this.setMainFrame();
    }
    private void setMainComponent() {
        this.groupModel = new DefaultComboBoxModel<>();
        this.groupCombo = new JComboBox<>(this.groupModel);
        this.workerModel = new DefaultListModel<>();
        this.workerList = new JList<>(this.workerModel);
        this.scrollPane = new JScrollPane(this.workerList);
        this.scrollPane.setPreferredSize(new Dimension(200,200));
        
    }
    private void setMainPanel() {
        this.mainPanel = new JPanel();
        this.mainPanel.setLayout(new BorderLayout());
        this.mainPanel.add(this.groupCombo, BorderLayout.NORTH);
        this.mainPanel.add(this.scrollPane, BorderLayout.CENTER);
    }
    private void setMainFrame() {
        this.add(this.mainPanel);
        this.setLayout(new FlowLayout());
        this.setTitle("Barabas Maximilian 2022-05-31 Szoft I N ");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 400);
        this.setVisible(true);
    }
}
