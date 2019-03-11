package methodcalled;
import java.util.Scanner;

public class Switchcase {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String name=input.next();
        System.out.println("Welcome"+" "+name);
        System.out.println("Enter your Marks : ");
        int marks = input.nextInt();
        
        switch(myMethod(marks)){
            case 1: System.out.println("Your Grade is : F " + " " + name);
            break;
            case 2:System.out.println("Your Grade is : E"+ " " + name);
            break;
             case 3:System.out.println("Your Grade is : D"+ " " + name);
            break;
             case 4:System.out.println("Your Grade is : C"+ " " + name);
            break;
             case 5:System.out.println("Your Grade is : B"+ " " + name);
            break;
             case 6:System.out.println("Your Grade is : A"+ " " + name);
             System.out.println(" Good Job" +" "+name);
            break;
             default :System.out.println("Please Enter Correct value");
        }
          System.out.println("Thank you for your Time" +" "+name);
    }
    public static int myMethod(int marks){
        if ((marks >= 0 && marks <39)){
            return(1);
        }
        else if ((marks >= 40 && marks <49)){
            return(2);
        }
         else if ((marks >= 50 && marks <59)){
            return(3);
         }
         else if ((marks >= 60 && marks <69)){
            return(4);
         }
         else if ((marks >= 70 && marks <79)){
            return(5);
         }
         else if ((marks >= 80 && marks <=100)){
            return(6);
            
         }
        return marks;
    }
    
}
        

