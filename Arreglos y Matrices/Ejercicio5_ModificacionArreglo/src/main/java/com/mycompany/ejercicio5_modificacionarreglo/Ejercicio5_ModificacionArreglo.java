/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5_modificacionarreglo;

import java.util.Scanner;

/**
 *
 * @author Ronald Sebastian Quimiz San Martin
 */
public class Ejercicio5_ModificacionArreglo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
  int[] a=new int[12];
  for(int i=0;i<12;i++)
  {int x;
  do{System.out.print("Ingrese positivo para posicion "+i+": ");
  x=sc.nextInt();
  }while(x<=0);
  a[i]=x+i;
  }
  for(int i=0;i<12;i++)
    System.out.println("Posicion "+i+": "+a[i]);
    }
}
