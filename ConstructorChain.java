public class ConstructorChain{
    ConstructorChain()
    {
        this("hello");
        System.out.println("default constructor called");
            }
        ConstructorChain(String str)
        {
            System.out.println("paramaterized constructor called");
        }
        public static void main(String[]args){
        ConstructorChain cc= new ConstructorChain();
        }
}