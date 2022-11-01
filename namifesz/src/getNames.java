/*
* File: getNames.java
* Author: BarabasMaximilian
* Copyright: 2022.10.27
* Group: Szoft II N
* Date: 2022.10.27
* Github: https://github.com/maximilianbarabas/maximilianbarabas
* Licenc: GNU GPL
*/

import java.util.ArrayList;
import java.util.Arrays;

public class getNames implements Name{

    @Override
    public ArrayList<String> getNames() {
        String[] names = {"Béla", "Géza"};
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));
        return nameList;
    }
    
}
