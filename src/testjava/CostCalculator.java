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
public class CostCalculator {
    public double calculateCost(ArrayList<Shape>shapeList, double unitPrice){
        double totalCost = 0;

        for(Shape item: shapeList){
            double area = item.getArea();
            double cost = area * unitPrice + Math.ceil(area/100) * unitPrice;
            totalCost += cost;
        }
        return totalCost;
    }
}
