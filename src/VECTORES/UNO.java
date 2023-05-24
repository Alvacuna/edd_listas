/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VECTORES;

import java.util.Scanner;

/**
 *
 * @author aquis
 */
public class UNO {
  public static void main(String a[]){
      Scanner l = new Scanner(System.in);
      long t=70642123;
      do{
          System.out.println("num ");
        t=l.nextLong();  
      }while (!(t>=10000000 && t<=99999999));
      System.out.println("ok");
  }  
}
