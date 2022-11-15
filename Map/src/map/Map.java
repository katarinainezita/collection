/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package map;

import java.util.*;
/**
 *
 * @author Inezita
 */
public class Map {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    HashMap<Integer, String> mapHttpErrors = new HashMap<Integer, String>();
    mapHttpErrors.put(400, "Bad Request");
    mapHttpErrors.put(304, "Not Modified");
    mapHttpErrors.put(200, "OK");
    mapHttpErrors.put(301, "Moved Permanently");
    mapHttpErrors.put(500, "Internal Server Error");
    
    String status301 = mapHttpErrors.get(301);
    System.out.println("301: " + status301);
    
    if (mapHttpErrors.containsKey("200")) {
    System.out.println("Http status 200");
    
    if (mapHttpErrors.containsValue("OK")) {
    System.out.println("Found status OK");
}
    
    }
    
    }
    
}
