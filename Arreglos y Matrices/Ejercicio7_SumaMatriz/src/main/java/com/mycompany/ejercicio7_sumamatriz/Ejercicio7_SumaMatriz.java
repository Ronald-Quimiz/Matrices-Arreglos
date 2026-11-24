/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio7_sumamatriz;

import java.util.Scanner;

/**
 *
 * @author Ronald Sebastian Quimiz San Martin
 */
public class Ejercicio7_SumaMatriz {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
  int[][] m=new int[4][4];
  int s=0;
  for(int f=0;f<4;f++)
      for(int c=0;c<4;c++)
      {System.out.print("Valor fila "+f+", columna "+c+": ");
      m[f][c]=sc.nextInt();s+=m[f][c];}
        System.out.println("Suma total: "+s);
    }
}
