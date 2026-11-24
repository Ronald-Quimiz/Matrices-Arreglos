/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio10_matriztareas;

import java.util.Scanner;

/**
 *
 * @author Ronald Sebastian Quimiz San Martin
 */
public class Ejercicio10_MatrizTareas {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
  int[][] m=new int[3][5];
  for(int f=0;f<3;f++)
      for(int c=0;c<5;c++)
      {System.out.print("Valor fila "+f+", columna "+c+": ");
      int x=sc.nextInt();
      m[f][c]=x+(f*c);}
     for(int f=0;f<3;f++)
     {for(int c=0;c<5;c++)
    System.out.print(m[f][c]+"\t");System.out.println();}
    }
}
