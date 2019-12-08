
package overloading;
 class ClassOverloading{
        public void display (char x){
            System.out.println(x);
        }
        public void display (char x, int num1){
            System.out.println(x+" "+num1 );
        }
 }
public class Overloading {

    public static void main(String[] args) {
       ClassOverloading obj = new ClassOverloading ();
       obj.display('A');
       obj.display('A',100);
    }
    
}
