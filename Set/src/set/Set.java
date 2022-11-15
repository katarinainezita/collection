/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package set;

import java.util.*;
/**
 *
 * @author Inezita
 */
public class Set {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Tom");
        names.add("Mary");
        
    
        if (names.isEmpty()) {
            System.out.println("The set is empty");
        } else {
            System.out.println("The set is not empty");
        }
        
        Iterator<String> iterator = names.iterator();
 
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
