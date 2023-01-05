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
        Integer data[]={2,3,5,11,2,5,6,7,32,-4,3,5,6,1,2,3,2,5};
        
        
        Histogram histo=new Histogram(data);
        Map<Integer, Integer> histogram=histo.getHistogram();
        
        
     
        
        for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
            System.out.println(entry.getKey() + "==>" + entry.getValue());
        }

    }
}
