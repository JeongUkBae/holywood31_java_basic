import java.util.Scanner;
class WhatName{
     public static void main(String[] args){
          System.out.print("몇살?");
          Scanner scan = new Scanner(System.in);
          String name = scan.next();
          System.out.println();
          System.out.print(name+"이다");
     }
}