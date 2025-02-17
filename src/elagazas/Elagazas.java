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
       
       
    }
    
}
