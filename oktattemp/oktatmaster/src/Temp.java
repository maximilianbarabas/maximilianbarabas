/*
 * Nagy János, 2022-11-14
 * Copyright (c) 2022, Maximilian Barabas
 * Licenc: MIT
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Temp {
    ArrayList<Double> tempList;

    public Temp() {
        Double[] tempArray = { 2.5, 2.8, 1.2, 0.5, -1.1 };
        this.tempList = new ArrayList<>(Arrays.asList(tempArray));        
    }

    public void InputTemps () {
        String tempStr = "";
        while(!tempStr.equals("vege")) {
            tempStr = inputTemp();
            checkEnd(tempStr);
        }
    }

    public String inputTemp() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hőmérséklet: ");
        String tempStr = scanner.nextLine();
        scanner.close();
        return tempStr;
    }
    
    public void checkEnd(String tempStr) {
        if (!tempStr.equals("vege")) {
            addTempToList(tempStr);
        }else {
            writeAll();
        }
    }    

    public void addTempToList(String tempStr) {
        if (isNumber(tempStr)) {
            double temp = Double.parseDouble(tempStr);
            tempList.add(temp);
        }else {
            System.err.println("Hiba! Számot kell beírni!");
        }
    }
    
    public boolean isNumber(String tempStr) {
        if (tempStr.matches("[0-9.]+")) {
            return true;
        }else {
            return false;
        }
    }

    public void writeAll() {
        for (double temp : this.tempList) {
            System.out.print(temp + " ");
        }
        System.out.println();
    }
}
