/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2_sumapromedio;

import java.util.Scanner;

/**
 *
 * @author Ronald Sebastian Quimiz San Martin
 */
public class Ejercicio2_SumaPromedio {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
         double[] a=new double[10];double s=0;for(int i=0;i<10;i++){
         System.out.print("Ingrese numero real "+(i+1)+": ");a[i]=sc.nextDouble();s+=a[i];}
         System.out.println("Suma total: "+s);System.out.println("Promedio: "+(s/10));
    }
}
