/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4_paresimpares;

import java.util.Scanner;

/**
 *
 * @author Ronald Sebastian Quimiz San Martin
 */
public class Ejercicio4_ParesImpares {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
  int cp=0,ci=0,sp=0,si=0;
  for(int i=0;i<20;i++)
  {System.out.print("Ingrese numero "+(i+1)+": ");
  int x=sc.nextInt();
  if(x%2==0){cp++;sp+=x;}
  else{ci++;si+=x;}
  }
System.out.println("Cantidad pares: "+cp);
System.out.println("Cantidad impares: "+ci);
System.out.println("Suma pares: "+sp);
System.out.println("Suma impares: "+si);
    }
}
