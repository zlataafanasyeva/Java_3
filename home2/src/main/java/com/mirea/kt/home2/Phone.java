/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mirea.kt.home2;

/**
 *
 * @author afana
 */
public class Phone {
    private String brend;
    private String colour;
    private int price;
    private double  weight;
    private int guaranty;

    public Phone(String brend, String colour, int price, double weight, int guaranty) {
        this.brend = brend;
        this.colour = colour;
        this.price = price;
        this.weight = weight;
        this.guaranty = guaranty;
    }
    
    public void call (){
        System.out.println("calling...");
    }
    
    public void connect (){
        System.out.println("connecting...");
    }
    
    public void relax (){
        System.out.println("relaxing...");
    }

    public String getbrend() {
        return brend;
    }

    public String getcolour() {
        return colour;
    }
    
    public int getprice() {
        return price;
    }

    public double getweight() {
        return weight;
    }

    public double getguaranty() {
        return guaranty;
    }

    public void setbrend(String brend) {
        this.brend = brend;
    }
    
    @Override
    public String toString(){
        return brend;
    }
}
