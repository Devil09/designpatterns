package com.company;

class GFG
{
    static String swap(String str, int i, int j)
    {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, str.charAt(i));
        return sb.toString();
    }
     
    // Function to return the string after
    // reversing the individual words
    static String reverseWords(String str)
    {
     
        // Pointer to the first character
        // of the first word
        int start = 0;
        for (int i = 0; i < str.length(); i++)
        {
     
            // If the current word has ended
            if (str.charAt(i) == ' ' ||
                    i == str.length()-1 )
            {
     
                // Pointer to the last character
                // of the current word
                int end;
                if (i == str.length()-1)
                    end = i ;
                else
                    end = i - 1 ;
                     
                // Reverse the current word
                while (start < end)
                {
                    str = swap(str,start,end) ;
                    start++;
                    end--;
                }
     
                // Pointer to the first character
                // of the next word
                start = i + 1;
            }
        }
     
        return str ;
    }
     
    // Driver code
    public static void main(String args[])
    {
        String str = "Geeks for Geeks";
     
        System.out.println(reverseWords(str));
    }
}
 