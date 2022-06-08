/*
* File: MainController.java
* Author: Barabas Maximilian
* Copyright: 2022, Barabas Maximilian
* Group: Szoft I N 
* Date: 2022-05-31
* Github: https://github.com/maximilianbarabas
* Licenc: GNU GPL
*/

package controllers;

import models.MainModel;
import views.MainFrame;

public class MainController {
    MainFrame mainFrame;
    MainModel mainModel;
    public MainController() {
        this.mainFrame = new MainFrame();
        this.mainModel = new MainModel();
        this.mainFrame.groupModel.addElement("Válasszon munkabeosztást!");
        this.mainModel.groupList.forEach(group ->{
            this.mainFrame.groupModel.addElement(group.name);
        });
        this.setEvents();

    }
    private void setEvents(){
        this.mainFrame.groupCombo.addActionListener(e -> onActionGroupCombo());

    }
    private void onActionGroupCombo(){
        int index = this.mainFrame.groupCombo.getSelectedIndex();
        int selectedgroupId = index;
        this.mainFrame.workerModel.clear();
        this.mainModel.workerList.forEach(worker -> {
            if(selectedgroupId == worker.groupId){
            this.mainFrame.workerModel.addElement(worker.name);


            }

        });
    }
    
}
