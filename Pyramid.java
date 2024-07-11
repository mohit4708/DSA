public class Pyramid {
    public static void main(String[] args)
    {
        int count=0;
        for(int i=1;i<=5;i++)
        {
            count=i+(i-1);
            for(int j=5;j>=1;j--)
            {
                if(j>i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            for(int k=1;k<=count-i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
