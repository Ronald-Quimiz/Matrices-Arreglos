/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6_llenadomatriz;

import java.util.Scanner;

/**
 *
 * @author Ronald Sebastian Quimiz San Martin
 */
public class Ejercicio6_LlenadoMatriz {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
  int[][] m=new int[3][4];
  for(int f=0;f<3;f++)
      for(int c=0;c<4;c++)
      {System.out.print("Valor fila "+f+", columna "+c+": ");m[f][c]=sc.nextInt();}
for(int f=0;f<3;f++)
{for(int c=0;c<4;c++)
    System.out.print(m[f][c]+"\t");System.out.println();}
    }
}
