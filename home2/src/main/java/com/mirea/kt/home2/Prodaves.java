/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mirea.kt.home2;

/**
 *
 * @author afana
 */
public class Prodaves {
    
    public void modify(Phone phone1){
        String newbrend = phone1.getbrend();
        newbrend = newbrend.replaceAll("o", "a");
        newbrend = newbrend.replaceAll("O", "A");
        switch (newbrend.charAt(0)) {
            case 'N':
                {
                    newbrend = newbrend.replaceAll("O", "A");
                    break;
                }
            case 'n':
                {
                    newbrend = newbrend.replaceAll("O", "A");
                    break;
                }
            default:
                {
                    newbrend = newbrend.toLowerCase();
                    break;
                }
        }
        phone1.setbrend(newbrend);
    }
}
