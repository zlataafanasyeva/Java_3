/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mirea.kt.home2;
import java.util.Scanner;
/**
 *
 * @author afana
 */
public class Home2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Работу выполнила Афанасьева Злата Романовна, РИБО-01-21, вариант 2");
        System.out.println("Введите 0 для стационарного телефона и 1 для мобильного: ");
        int i = scan.nextInt();
            if (i==0){
                System.out.println("Цвет... ");
                String colour = scan.next();
                System.out.println("Стоимость телефона... ");
                int price = scan.nextInt();
                System.out.println("Вес аппарата... ");
                double weight = scan.nextDouble();
                System.out.println("Срок гарантии... ");
                int guaranty = scan.nextInt();
                System.out.println("Введите производителя телефона... ");
                String brend = scan.next();
                Phone phone1 = new Phone(brend, colour, price, weight, guaranty);
                Prodaves prodaves1 = new Prodaves();
                prodaves1.modify(phone1);
                System.out.println("Тип кабеля для подключения... ");
                String cabel = scan.next();
                System.out.println("Номер телефона... ");
                String number = scan.next();
                LandlinePhone phone2 = new LandlinePhone(cabel, number, phone1.toString(), colour, price, weight, guaranty);
                System.out.println(phone2.toString());
            } else{
                System.out.println("Цвет... ");
                String colour = scan.next();
                System.out.println("Стоимость телефона... ");
                int price = scan.nextInt();
                System.out.println("Вес аппарата... ");
                double weight = scan.nextDouble();
                System.out.println("Срок гарантии... ");
                int guaranty = scan.nextInt();
                System.out.println("Введите производителя телефона... ");
                String brend = scan.next();
                Phone phone1 = new Phone(brend, colour, price, weight, guaranty);
                Prodaves prodaves1 = new Prodaves();
                prodaves1.modify(phone1);
                System.out.println("Оператор мобильной связи... ");
                String sim = scan.next();
                System.out.println("Память в ГБ... ");
                int memory = scan.nextInt();
                MobilePhone phone3 = new MobilePhone(sim, memory, phone1.toString(), colour, price, weight, guaranty);
                System.out.println(phone3.toString());
            }
    }
}

