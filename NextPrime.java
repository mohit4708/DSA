public class NextPrime {
    public static void main(String[] args){
        int p=15;
        System.out.println(nextPrime(p));
    }
    public static int nextPrime(int n){


        //code here to find next prime number
        //return next prime number
        for(int i=n+1;i<=500;i++)
        {
            if(prime(i))
            {
                return i;
            }
        }
        return 0;

    }

    public static boolean prime(int n){

        //Write your code here
        //returns a boolean value
        if(n==1)
        {
            return false;
        }
        else if(n==2||n==3){
            return true;
        }
        else if(n%2==0||n%3==0)
        {
            return false;
        }
        else{
            for(int i=5;i*i<=n;i=i+6)
            {
                if(n%i==0||n%(i+2)==0)
                {
                    return false;
                }

            }
        }
        return true;
    }
}
