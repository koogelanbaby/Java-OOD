
package overloading;

class OverLoading2 {
    public static void add (int x,int y){
        int sum = x+y;
        System.out.println(sum);
    }
    public static void add (String y,String x){
        String sums = y+x;
        System.out.println(sums);
    }
}
public class MyOverloading {
    
   public static void main(String[] args) {
       OverLoading2.add(100,200);
       OverLoading2.add("My Name is ","Koogelan");
   }  
}
