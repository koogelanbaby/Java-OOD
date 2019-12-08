
package overloading;

class OverLoading1 {
    public void display (int x, int y){
        System.out.println(x+y);
    }
    public void display(double v ,double z){
        System.out.println(v*z);
    }
    
}
public class Sampel3 {
    public static void main(String[] args) {
       OverLoading1 obj = new OverLoading1 ();
       obj.display(100,100);
       obj.display(10.10,20.20);
    } 
}
