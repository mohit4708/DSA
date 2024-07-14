public class Sol {

        public static boolean isPanagram(String str)
        {
            // Check if given string is panagram
            str=str.toLowerCase();
            int[] ch=new int[26];

            if(str.length()<26)
            {
                return false;
            }

            for(int i=0;i<str.length();i++)
            {
                ch[str.charAt(i)-'a']++;
            }

            for(int i=0;i<ch.length;i++)
            {
                if(ch[i]==0)
                {
                    return false;
                }
            }

            return true;


        }
        
    }
