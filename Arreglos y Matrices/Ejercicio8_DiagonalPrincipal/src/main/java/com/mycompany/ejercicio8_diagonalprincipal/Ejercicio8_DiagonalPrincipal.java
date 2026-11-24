/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio8_diagonalprincipal;

import java.util.Scanner;

/**
 *
 * @author Ronald Sebastian Quimiz San Martin
 */
public class Ejercicio8_DiagonalPrincipal {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
  int[][] m=new int[4][4];
  for(int f=0;f<4;f++)
      for(int c=0;c<4;c++)
      {System.out.print("Valor fila "+f+", columna "+c+": ");
      m[f][c]=sc.nextInt();}
int s=0;
System.out.println("Diagonal principal:");
for(int i=0;i<4;i++)
{System.out.println(m[i][i]);s+=m[i][i];}
 System.out.println("Suma diagonal: "+s);
    }
}
