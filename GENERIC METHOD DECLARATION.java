public class Ex
{
    public <E>void printArray(E []s){
        for(E x: s)
        System.out.println(x);
    }
	public static void main(String[] args) {
	    Ex ex = new Ex();
	    String s1[]=new String[]{"cat" ,"dog","cow"};
		ex.<String>printArray(s1);
		Integer i[] = {1,2,3,4,5};
		ex.<Integer>printArray(i);
	}
}
