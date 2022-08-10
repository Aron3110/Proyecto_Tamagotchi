/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ultis;

import java.util.Random;



/**
 *
 * @author HP
 */
public class Utils {
    public static int azar(int max,int min){
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
    public static int azar(int max){
        return azar(max,0);
    }
}
