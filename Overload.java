public class Overload {
    public String func(int a , String b){
        return ("GeeksFG");
    }

    public String func(String b, int a){
        return ("GFG");
    }

    public static void main(String[] args)
    {
        Overload o =new Overload();
        System.out.println(o.func(4,"GFG"));
    }
}
