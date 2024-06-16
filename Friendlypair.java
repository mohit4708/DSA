public class Friendlypair {
    public static void main(String[] args)
    {
        Friendlypair fp=new Friendlypair();
        int a=6,b=12;
        int suma=fp.sumoffactors(a);
        int sumb=fp.sumoffactors(b);
        if(suma/a==sumb/b)
        {
            System.out.println("The given pair is a friendly pair");
        }
        else{
            System.out.println("The given pair is not a friendly pair");
        }
    }

    public int sumoffactors(int a)
    {
        int sum=0;
        for(int i=1;i<Math.sqrt(a);i++)
        // This method uses the square root approach
        // we iterate up-to the square root of the number to optimize the code & TC = O(sqrt(N))
        // using this approach we can find al the factors of the number excluding the number itself

        {
            if(a%i==0) {
                if (i == 1) {
                    sum = sum + i;
                } else if (i == a / i)// helpd to avoid adding of duplicate factors as it is applicable for factors that are
                //squares of the number
                {
                    sum = sum + i;
                } else {
                    sum = sum + i + a / i;
                }
            }
        }
        return sum;
    }
}

