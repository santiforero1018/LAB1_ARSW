/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

import java.util.LinkedList;

/**
 *
 * @author hcadavid
 */
public class CountThreadsMain {

    public static void main(String a[]) {
        CountThread thread1 = new CountThread(0, 99);
        CountThread thread2 = new CountThread(99, 199);
        CountThread thread3 = new CountThread(200, 299);
        thread1.run();
        thread2.run();
        thread3.run();
        LinkedList range1 = thread1.getRange();
        LinkedList range2 = thread2.getRange();
        LinkedList range3 = thread3.getRange();
        //System.out.println("-------------------- VALORES DEL THREAD 1----------------------");
        //range1.forEach(Integer -> System.out.println(Integer));
        /*System.out.println("-------------------- VALORES DEL THREAD 2----------------------");
        range2.forEach(Integer -> System.out.println(Integer));
        System.out.println("-------------------- VALORES DEL THREAD 3----------------------");
        range3.forEach(Integer -> System.out.println(Integer));*/
    }

}
