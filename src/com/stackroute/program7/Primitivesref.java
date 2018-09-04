package com.stackroute.program7;

public class Primitivesref{
public static void main(String argv[]){
                Primitivesref p = new Primitivesref();
                p.amethod();
        }

        public void amethod(){
              int i=10;
              System.out.println("Before another i= " +i);
              another(i);
              System.out.println("After another i= " + i);
        }

        public void another(int i){
              i+=10;
              System.out.println("In another i= " + i);
        }

}