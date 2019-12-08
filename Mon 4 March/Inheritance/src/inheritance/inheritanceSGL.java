
package inheritance;

import java.util.Scanner;

class GrandMother {
    //decalre the int
         int x = 40;
         int y = 50;  
    
}
public class inheritanceSGL extends GrandMother
{
    int total;
    public void calc(){
        total = x+y;
    }
   public static void main (String[] args){
    inheritanceSGL sample = new inheritanceSGL();
     Scanner input = new Scanner(System.in);
     System.out.println("Key in Your NUMBER");
     int z = input.nextInt();
   // the way of calculating the total in singel line
       sample.calc();
       System.out.println("The Answer is " +(sample.total+z)/3);
       
       
   }
        
    }



  
