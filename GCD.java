public class GCD {
    public static void main(String[] args)
    {
        int great=0;
        int l=Math.max(4,8);
        int s=Math.min(4,8);
        if(l%s==0)
        {
            great=s;
        }
        else {
            for (int i = 1; i <= s/2; i++) {
                if (s% i == 0 && l % i == 0) {
                    great = i;
                }
            }
        }
        System.out.println(great);
    }
}
