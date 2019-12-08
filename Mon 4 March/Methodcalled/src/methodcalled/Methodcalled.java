
package methodcalled;
import java.util.Scanner;

public class Methodcalled {

    
    public static void main(String[] args) {
        
        System.out.println ("PLEASE KEY IN YOUR MARK : ");
        Scanner input = new Scanner (System.in);
        int grade=input.nextInt();
        myGrade(grade);    
       }
    public static void myGrade (int grade){
           
            if (grade < 39)
        {
        System.out.println ("Your grade is F ");
        }
        
         else if(grade>=40 && grade <=49)
         {
         System.out.println ("Your grade is E ");
         }
        else if(grade >=50 && grade <=59)
         {
         System.out.println ("Your grade is D ");
         }
        else if(grade>=60 && grade <=69)
         {
         System.out.println ("Your grade is C ");
         }
        else if(grade>=70 && grade <=79)
         {
         System.out.println ("Your grade is B ");
         }
        else if(grade>=80 && grade <=100)
         {
         System.out.println ("Your grade is A ");
         }
       }
}    
        
    
                 
        
    
    
    

