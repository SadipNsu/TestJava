/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ASUS
 */
public class TestJava {

    /**
     * @param args the command line arguments
     */
    
    public static void BookTest(){
        Book a = new Book("Tin Goinda", 100);
        a.print("A");
        Book b = a;
        b.print("B");
        b.setName("Bangla");
        
        a.print("A");

        Book c = new Book(a);
        c.setName("My Life");
        c.print("C");
        a.print("A");
    }
    
    public static void ArrayListTest(){
        ArrayListProcessing alp = new ArrayListProcessing();
        ArrayList<String> listA = alp.getData(5);
        ArrayList<String> listB = alp.getData(5);
        
        System.out.println("ListA Size: "+listA.size());
//        alp.clear(listA);
        alp.clear(new ArrayList<String>( listA));
        System.out.println("ListA Size: "+listA.size());
        
    }
    
    public static void AbstructTest(){
        ArrayList<Shape>shapeList = new ArrayList<>();
        
        shapeList.add(new Square(35));
        shapeList.add(new Circle(5.14));
        shapeList.add(new Circle(51));
        shapeList.add(new Circle(99.901));
        shapeList.add(new Square(205));
        
        CostCalculator cc = new CostCalculator();
        System.out.println("Total Cost: "+cc.calculateCost(shapeList, 5.5));        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
       //BookTest();
//       ArrayListTest();
        AbstructTest();
    }
    
}
