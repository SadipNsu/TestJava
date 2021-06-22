/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjava;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class ArrayListProcessing {
    public void clear(ArrayList<String>list){
        for(String name: list){
            System.out.println("Name: "+name);
        }
//        for(int i=0;i<list.size();i++){
//            System.out.println("Name: "+list.get(i));
//        }
        list.clear();
    }
    
    public ArrayList<String> getData(int n){
        ArrayList<String>list = new ArrayList<>();
        
        int val = 101111;
        
        for(int i=0;i<n;i++){
            list.add(String.valueOf(val));
            val += 1111;
        }
        return list;
    }
}
