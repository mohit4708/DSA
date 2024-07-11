public class LCM {
    public static void main(String[] args){
        int least=0;
        for(int i=20;i<=20*10;i++)
        {
            if(i%15==0&&i%10==0)
            {
                least=i;
                break;
            }
        }
        System.out.println(least);
    }
}
