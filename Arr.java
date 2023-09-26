//wap to create an integer array
import java.util.*;
public class Arr{
    public static void main(String[]args){
        int num[]=new int[]{10,9,8,7,6,5,4,3,2,1};
        int sum =0;
        double avg=0;
        for(int a : num)
        {
            sum += a;
        }
        System.out.println(sum);
        avg = (double)sum;
    }
}