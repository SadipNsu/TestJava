/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjava;

/**
 *
 * @author ASUS
 */
public abstract class Shape {
    abstract double getArea();
    
    public void printArea(){
        System.out.println("Area = "+getArea());
    }
}
