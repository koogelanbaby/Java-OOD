
package overloading;
import java.util.Scanner;

class OverloadingTutorial{
  
  public void Output(String name1,String name2){
      System.out.println("Full name is :"+name1+" "+name2);
  }
}

public class Tutorial {
    
    
     public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
         System.out.println("PLEASE KEY IN YOUR FIRST NAME:");
         String Fname=input.nextLine();
        
         System.out.println("ENTER YOUR LAST NAME:");
         String Lname=input.nextLine();
         
         OverloadingTutorial obj = new OverloadingTutorial();
         
         obj.Output(Fname,Lname);
     }
       
}
