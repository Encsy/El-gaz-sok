/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package elagazas;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Elagazas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int szam = 5;
       
       // Elágazások if-else
       if(szam >=0){
           System.out.println("A szám pozitív.");
       }
       else{
           System.out.println("A szám negatív.");
       }
       boolean feltetel = (szam >=0);
       // Ha igaz
       // feltetel = true
       // !feltetel = false
       if(feltetel){
           System.out.println("A szám pozitív");
       }
       //Különben
       else{
           System.out.println("A szám pozitív");
       }
       
       //Összehasonlító műveletek
       /*
       Egyenlőség: ==
       Tagadás: !
       Nem egyenlő: !=
       Kisebb: a < b
       Nagyobb vagy egyenlő: a <= b
       Nagyobb: a > b
       Nagyobb vagy egyenlő: a >= b
       */
       
       //Kérjünk be két számot, írjuk ki a nagyobbat
       System.out.println("Kérek egy számot:");
       Scanner be = new Scanner(System.in); //Adatbekérés
       int a = be.nextInt(); // be.nextInt() számot vár a felhasználótól
       System.out.println ("Kérek egy másik számot:");
       int b = be.nextInt();
       // Döntsük el, hogy melyik nagyobb
       if (a < b){
           System.out.printf("A %d nagyobb, mint %d", b, a);
       }
       else{
           System.out.printf("A %d nagyobb, mint %d", a, b);
       }
       
       // Logikai műveletek
       /*
       !: tagadás, nem
       &&: Logikai ÉS
       ||: Logikai VAGY
       */
       
       // (2 > 3) && (3 > 2) => HAMIS
       // (3 > 2) || (2 > 3) => IGAZ
       
       int egesz = 30;
       if (egesz % 10 == 0 && egesz % 3 == 0){
           System.out.println("A 30 osztható 10-zel és 3-mal maradék nélkül");
       }
       else{
           System.out.println("A 30 nem osztható maradék nélkül 10-zel és 3-mal");
       }
       
       egesz = 27;
       if(egesz % 10 == 0 || egesz % 3 == 0){
           System.out.println("A 27 osztható 10-zel vagy 3-mal maradék nélkül.");
       }
       else{
           System.out.println("A 27 nem osztható maradék nélkül 10-zel és 3-mal sem.");
       }
       
       /*
       if(){
       
       }
       else{
            if()
            {
       
            }
       }
    }
       */
       
       // Célszerű -if -else if - else
       double szazalek = 60.0;
       // 0-39 elégtelen
       // 40-49 elégséges
       // 50-59 közepes
       // 60-79 jó
       // 80-100 jeles
       
       if(szazalek >= 80){
           System.out.println("Jeles");
       }
       else if(szazalek >= 60 && szazalek < 80){
           System.out.println("Jó");
       }
       else if(szazalek >=50 && szazalek <60){
           System.out.println("Közepes");
       }
       else if(szazalek >=40 && szazalek <50){
           System.out.println("Elégséges");
       }
       else{
           System.out.println("Elégtelen");
       }
    }
    
}
