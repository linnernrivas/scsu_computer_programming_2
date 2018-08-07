/*Write a subclass Motorcycle which has the following-- 
 * Attributes: (1) helmet (number of helmet)  
 * Constructor: which sets the value of helmet, wheel and seat.
 * Methods: (1) getHelmet()�returns the number of helmet
 * (2) Implementation of the printDetails() method.
 */
//Created: 11-9-2015
//Author:Linner Rivas

import java.util.*;

public class Motorcycle extends Vehicle{
  int helmet;
  public Motorcycle(int w,int s, int h){
    super(w,s);
    helmet = h;
  }
  public int getHelmet(){
    return helmet;
  }
   public void printDetails(){
  System.out.println( "The Seat numbers: " + getSeat() + "," + "Number of Wheels: " + getWheel() +" ,"+ "Number of Helmets: " + helmet);
  }
}