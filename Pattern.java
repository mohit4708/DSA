public class Pattern {
    public static void main(String[] args)
    {
        for(int i=1;i<=9;i++)
        {
            if(i<9) {
                for (int j = 1; j <= i; j++) {
                    if (j == i) {
                        System.out.print("*");
                    }
                    else if(j==1){
                        System.out.print("*  ");
                    }
                    else {
                        System.out.print("  ");
                    }

                }
            }
            else{
                for (int j = 1; j <= i; j++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
