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
public class Square extends Shape{
    double sideLength;
    @Override
    double getArea() {
        return calArea();
    }

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }
    
    public double calArea(){
        return Math.pow(sideLength, 2);
    }
}
