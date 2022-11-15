/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queue;

import java.util.*;
/**
 *
 * @author Inezita
 */
public class Queue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    PriorityQueue<String> queue=new PriorityQueue<String>();
    
    queue.add("Amit Sharma");  
    queue.add("Vijay Raj");  
    queue.add("JaiShankar");  
    queue.add("Raj");  
    
    Iterator itr=queue.iterator();  
    while(itr.hasNext()){  
    System.out.println(itr.next());
    }
    
    System.out.println("");
    
    queue.remove();  
    queue.poll();  
    System.out.println("after removing two elements:");  
    Iterator<String> itr2=queue.iterator();  
    while(itr2.hasNext()){  
    System.out.println(itr2.next());  
    }      
    
    
    }
    
}
