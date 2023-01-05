/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.kata2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Minerva
 */
public class Kata2 {

    public static void main(String[] args) {
        String[] data={"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};
        
        
        Histogram histo=new Histogram(data);
        Map<String, Integer> histogram=histo.getHistogram();
        
        
     
        
        for (Map.Entry<String, Integer> entry : histogram.entrySet()) {
            System.out.println(entry.getKey() + "==>" + entry.getValue());
        }

    }
}
