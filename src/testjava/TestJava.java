/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjava;

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
    public static void main(String[] args) {
        // TODO code application logic here
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
}
