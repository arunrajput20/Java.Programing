 class Data
{
    private String name;
    public void setter(String s){
        name = s;
    }
    public String getter ()
    {
        System.out.println(name);
        String s = name;
        return s;
    }
}
public class Main{
	public static void main(String[] args) {
	    Data d= new Data();
	    d.setter("java");
	    System.out.println(d.getter());
	}
}
