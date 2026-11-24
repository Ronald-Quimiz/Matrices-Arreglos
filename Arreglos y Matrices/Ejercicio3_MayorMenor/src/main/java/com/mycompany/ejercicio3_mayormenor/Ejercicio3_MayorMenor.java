/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3_mayormenor;

import java.util.Scanner;

/**
 *
 * @author Ronald Sebastian Quimiz San Martin
 */
public class Ejercicio3_MayorMenor {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
  int[] a=new int[15];for(int i=0;i<15;i++)
  {System.out.print("Ingrese numero "+(i+1)+": ");a[i]=sc.nextInt();}
    int ma=a[0],mi=a[0],pma=0,pmi=0;
    for(int i=1;i<15;i++)
    {if(a[i]>ma)
    {ma=a[i];pma=i;}
    if(a[i]<mi)
    {mi=a[i];pmi=i;}
    }
     System.out.println("Mayor: "+ma+" posicion: "+pma);
     System.out.println("Menor: "+mi+" posicion: "+pmi);
    }
}
