/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitdemo;

/**
 *
 * @author ge291147
 */
//Ceci importe la classe Scanner du package java.util
import java.util.Scanner; 
//Ceci importe toutes les classes du package java.util
import java.util.*;
public class GitDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un nom :");
        String nom = sc.nextLine();
        Hello.hello(nom);
        
    }
    
}
