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
public class CountThread extends Thread {
    private int a;
    private int b;
    private LinkedList range = new LinkedList();

    public CountThread(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void run() {
        for(int i = this.a; i<= this.b;i++){
            System.out.println(i);
        }
    }
    public LinkedList getRange() {
        return range;
    }
    
}
