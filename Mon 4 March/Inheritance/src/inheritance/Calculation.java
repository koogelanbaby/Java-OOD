
package inheritance;
class Father {
    void Mark (){
        System.out.println("Mark is 60");
    }
}


class Mother extends Father{
    void Score(){
        System.out.println("What is your Mark");
    }
}

public class Calculation {
    
    
public static void main(String[] args){
  Mother d = new Mother();
  d.Score();
  d.Mark();
    } 
}
