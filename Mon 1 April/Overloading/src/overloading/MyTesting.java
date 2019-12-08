
package overloading;


public class MyTesting {
    public static void main(String[] args) {
        System.out.println(Add(15,15));
        System.out.println(Add(15.55,15.33));
        System.out.println(Add("Hello ","World"));
    } 
    
    public static int Add (int a, int b){
        return (a+b);
    }
    public static double Add (double a,double b){
        return(a+b);
    }
    public static String Add (String a,String b){
        return(a+b);
    }
}
