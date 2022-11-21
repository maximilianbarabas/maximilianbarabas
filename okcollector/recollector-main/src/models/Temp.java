/*
 * File: Temp.java
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

package models;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import org.Jsoup.Connection;
import org.Jsoup.Jsoup;
import org.Jsoup.nodes.Document;

public class Temp {
    public String url;
    public ArrayList<String> getContent() {
        String result = "semmi";
        ArrayList<String> wordList = new ArrayList<>();
        if (!url.isEmpty()) {
            try {
                Connection conn = Jsoup.connect(this.url);
                Document doc = conn.get();
                result = doc.body().text();
                
                } catch (IOException e) {
                    System.err.println("Hiba! A weblap nem olvasható");
                }
                result = result.replaceAll("\\p{Punct}", "");
                result = result.replaceAll("[©0-9]", "");
                result = result.trim().replaceAll(" +", "\n");
        
        }else {
            System.err.println("Hiba! Az url nincs beállítva!");
        }

        Scanner scanner = new Scanner(result);
        while(scanner.hasNextLine()) {
            wordList.add(scanner.nextLine());
        }
        scanner.close();
        Collections.sort(wordList);
        return wordList;
    }
    public void setupUrl(String url) {
        this.url = url;
    }
}
