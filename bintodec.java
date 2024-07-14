public class bintodec {

        public static void main(String[] args)
        {
            String s="10001000";
            bintodec b=new bintodec();
            int dec=b.binary_to_decimal(s);
            System.out.println(dec);
        }
        public int binary_to_decimal(String str) {
            // Code here
            int m=0,k=1;
            for(int i=str.length()-1;i>=0;i--)
            {
                m=m+(str.charAt(i)-'0')*k;
                k=k*2;
            }
            return m;
        }

}
