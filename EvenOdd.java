import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int a:arr)
        {
            if(a%2!=0)
            {
                System.out.print(a+" ");
            }
        }
        System.out.println();
        for(int b:arr)
        {
            if(b%2==0)
            {
                System.out.print(b+" ");
            }
        }
    }
}
