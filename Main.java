//try catch block

public class Main{
    public static void main(String[]args){
        try{
            int d= 5/0;
            System.out.println("Rest of code in try block");
        }
        catch(ArithmeticException e){
             System.out.println("ArithmeticException=>" + e.getMessage());
        }
    }
}