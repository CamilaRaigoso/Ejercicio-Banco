

//

//Inventario
package Ejercicio2;

import ch.aplu.turtle.Turtle;

public class Figuras {
    private  Turtle mai;
    private int largo;
    private int lados;
    private double figura; 
    
    
    public Figuras(int largo, int lados,Turtle mai){
        this.largo = largo;
        this.lados = lados;
        this.mai = mai;
                
    }
    
    public int getlargo (){
         return largo;
     }
    public int getlados (){
          return lados;
      }   
   int a=0;
   public void figura(){
      while (a < lados){ 
       mai.fd(largo); 
       mai.left(360/lados); 
       a=a+1;}
      mai.right(90);
      mai.penUp();
       mai.fd(80);
       mai.penDown();
      }
     }
  


   

     
  
    
   