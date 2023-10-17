// finally block
class Main{
    public static void main(String[]args){
        try{
            int d = 5/0;
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException=>" + e.getMessage());
        }
        finally{
            System.out.println("This is the finally block");
        }
    }
}