import java.util.*;
public class Motorcycle extends Vehicle{
 int helmet;
 public Motorcycle(int w,int s, int h){
  super(w,s);
  //super(s);
  helmet = h;
 }
 public double getHelmet(){
    return helmet;
  }
 
}