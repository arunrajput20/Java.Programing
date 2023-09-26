//demonstration of inbuilt array class and two string method and method overloading
import java.util.Arrays;
public class A
{
    public static void main(String[]args)
    {
        int a[]={2000,1979,1980,2002};
        String[]s={"joy","ram","shyam"};
        System.out.println("Integer array is" + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("sorted Int arr" + Arrays.toString(a));
        System.out.println("String array is" + Arrays.toString(s));
    }
    
}
    
        