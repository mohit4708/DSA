public class dectobin {
    public static void main(String[] args)
    {
        String N="7";
        toBinary(N);
    }
    public static void toBinary(String N)
    {
        // Code here
        int n=Integer.parseInt(N);
        String s="";
        while(n>0)
        {
            s=(n%2)+s;
            n=n/2;
        }

        System.out.print(s);
    }
}
