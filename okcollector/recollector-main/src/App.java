/*
 * File: App.java
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

import controllers.CollectorController;
import controllers.MainController;
import controllers.Inputems;
import views.MainWindow;

public class App {
public static void main(String[] args) throws Exception {
MainWindow mainWindow = new MainWindow();
new MainController(mainWindow);
new CollectorController(mainWindow);
new Inputems(mainWindow);
mainWindow.setVisible(true);
}
}
