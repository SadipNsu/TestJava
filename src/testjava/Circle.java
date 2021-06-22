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
public class Circle extends Shape{

    public Circle(double redius) {
        this.redius = redius;
    }
    
    double redius;
    
    @Override
    double getArea() {
        double PI = Math.acos(-1);
        return PI*Math.pow(redius, 2);
    }
}
