/*
* File: App.java
* Author: BarabasMaximilian
* Copyright: 2022.10.27
* Group: Szoft II N
* Date: 2022.10.27
* Github: https://github.com/maximilianbarabas/maximilianbarabas
* Licenc: GNU GPL
*/

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Barabas Maximilian, Szoft II N, 2022.10.27");
        getNames getNames = new getNames();
        ArrayList<String> nameList = getNames.getNames();
        for (String name: nameList) {
            System.out.println(name);
        }
    }
}
