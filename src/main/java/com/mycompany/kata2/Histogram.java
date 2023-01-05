/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kata2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Minerva
 */
public class Histogram {
    
    private final int data[];

    public Histogram(int data[]) {
        this.data = data;
    }

    public int[] getData() {
        return data;
    }
    
    public Map<Integer, Integer> getHistogram(){
        Map<Integer, Integer> histogram = new HashMap<>();  
        for (int i = 0; i < data.length; i++) {
             histogram.put(data[i],histogram.keySet().contains(data[i]) ?  histogram.get(data[i]) +1 : 1);             

        }
        return histogram;        
    }
    
    
}
