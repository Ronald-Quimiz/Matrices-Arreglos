/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1_ingresovisualizacion;

import java.util.Scanner;

/**
 *
 * @author Ronald Sebastian Quimiz San Martin
 */
public class Ejercicio1_IngresoVisualizacion {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int[] a=new int[10]; for(int i=0;i<10;i++)
         {System.out.print("Ingrese numero "+i+": ");a[i]=sc.nextInt();}
         for(int i=0;i<10;i++)System.out.println("Posicion "+i+": "+a[i]);
    }
}
