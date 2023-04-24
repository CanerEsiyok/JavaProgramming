package review02;

import day09_IfStatements.test;

import java.util.*;

 class test1 {
     protected void method(){
         System.out.println("a");
     }
     private void method(int a){
         System.out.println("b");
     }

 }
 public class test2 extends test1{
     public void method(int a){
         System.out.println("c");
     }

     public static void main(String[] args) {
         test2 obj=new test2();
         obj.method();

     }
 }



