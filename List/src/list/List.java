/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package list;

import java.util.*;
/**
 *
 * @author Inezita
 */
public class List {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ArrayList<String> listStrings = new ArrayList<String>();  
    //Adding elements in the List  
    listStrings.add("One");  
    listStrings.add("Two");  
    listStrings.add("Three");    
    
    //Iterating the List element using for-each loop  
    for(String number:listStrings)  
    System.out.println(number);
    System.out.println("");
    
    listStrings.add(1, "Four");
    
    for(String number:listStrings)  
    System.out.println(number);
    System.out.println("");
    listStrings.remove("Two");
    
    for(String number:listStrings)  
    System.out.println(number);
    System.out.println("");
    }
    
}
