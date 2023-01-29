/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum2;

import java.util.*;
import java.math.*;

/**
 *
 * @author Asus
 */
public class soal6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String y = sc.nextLine();
        BigInteger bigX = new BigInteger(x);
        BigInteger bigY = new BigInteger(y);
        System.out.println(bigX.add(bigY));
        System.out.println(bigX.multiply(bigY));
    }
}
