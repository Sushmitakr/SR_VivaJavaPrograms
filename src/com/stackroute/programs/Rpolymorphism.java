package com.stackroute.programs;

class Bike{
   void run(){System.out.println("running");}
 }
 class Rpolymorphism extends Bike{
   void run(){System.out.println("running safely with 60km");}
 
   public static void main(String args[]){
     Bike b = new Rpolymorphism();//upcasting
     b.run();
   }
 }
