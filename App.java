/*-- File Buttonpanel.java 
     Author: Barabás Maximilián 
     Copyright : Barabas Maximilian 
     Osztály : Szoft I N 
     Date : 2022-02-22
     https://github.com/maximilianbarabas/maximilianbarabas
     Licenc GNU GPL
*/


import java.util.Scanner;


public class App {
	
	public static void main (String[] args) {
		System.out.println("Barabas Maximilian, 2022-02-16");
        System.out.println("Feladat felhasználás büntetést von maga után");
        System.out.println("Lépések commitolva vannak");

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Szam1: ");
		int szam1 = sc.nextInt();
		System.out.print("Szam2: ");
		int szam2 = sc.nextInt();
    
		
		if(szam1>szam2) {
			System.out.println("Az elso szam nagyobb");
		} else if (szam1<szam2) {
			System.out.println("A masodik szam nagyobb");
		}
	}
}



