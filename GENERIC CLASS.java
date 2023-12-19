//use of generic class //
 class MyData<E>{
     E i;
     public void set(E i1)
     {
         i = i1;
     }
     public E get(){
         return i;
     }}
     public class ExampleMyData{
         public static void main(String []args)
         {
             MyData<Integer> m=new MyData<Integer>();
             MyData<String> m1=new MyData<String>();
             Integer k = new Integer(5);
             m.set(k);
             System.out.println(m.get());
             m1.set("rohit");
             System.out.println(m1.get());
         }
     }
 