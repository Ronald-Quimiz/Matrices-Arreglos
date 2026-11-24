/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio9_mayormenormatriz;

import java.util.Scanner;

/**
 *
 * @author Ronald Sebastian Quimiz San Martin
 */
public class Ejercicio9_MayorMenorMatriz {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
  int[][] m=new int[5][5];
  for(int f=0;f<5;f++)
      for(int c=0;c<5;c++)
      {System.out.print("Valor fila "+f+", columna "+c+": ");
      m[f][c]=sc.nextInt();
      }
     int ma=m[0][0],mi=m[0][0];
   for(int f=0;f<5;f++)
    for(int c=0;c<5;c++)
    {
        if(m[f][c]>ma)ma=m[f][c];
        if(m[f][c]<mi)mi=m[f][c];
    }
     System.out.println("Mayor: "+ma);
     System.out.println("Menor: "+mi);
    }
}
