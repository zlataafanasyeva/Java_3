/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mirea.kt.home2;

/**
 *
 * @author afana
 */
public class MobilePhone extends Phone {
    private String sim;
    private int memory;

    public MobilePhone(String sim, int memory, String brend, String colour, int price, double weight, int guaranty) {
        super(brend, colour, price, weight, guaranty);
        this.sim = sim;
        this.memory = memory;
    }
    
    public void location (){
        System.out.println("i know? where are u...");
    }
    
    public void music (){
        System.out.println("time for dancing...");
    }
    
    public void radio (){
        System.out.println("ded-version.");
    }  
    
    @Override
    public String toString() {
        return "MobilePhone (" + "brend = " + getbrend() + ", colour = " + getcolour() + ", price = " + getprice() + ", weight = " + getweight() + ", quaranty = " + getguaranty() + ", sim = "+ sim + ", memory = " + memory + ')';
    }
}

