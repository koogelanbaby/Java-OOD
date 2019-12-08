
package overloading;

class OverLoading{
    public void display(char x){
        System.out.println("The character is " + x);
    }
    public void display (int x ){
        System.out.println("The number is "+x);
    }
}
public class Sampel2 {
   public static void main(String[] args) {
       OverLoading obj = new OverLoading ();
       obj.display('A');
       obj.display(100);
    } 
}
