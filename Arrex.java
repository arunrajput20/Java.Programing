//write a program initialise and print the array
import java.util.*;
public class Arrex{
    public static void main(String[]args)
    {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        size = sc.nextInt();
        int a[] = new int[size];
        for(int i= 0;i<size;i++)
        {
            a[i]=i;
            System.out.println(a[i]);
    }
}
}