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
public class Book {

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }
    
    public Book(Book obj) {
        this.name = obj.name;
        this.price = obj.price;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void print(){
        System.out.println("Name: "+name+" Price: "+price);
    }
    
    public void print(String tag){
        System.out.println(tag+" => Name: "+name+" Price: "+price);
    }
    private String name;
    private int price;
    
}
