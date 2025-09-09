public class StringCon 
{
    public static boolean rotated(String s1, String s2)
    {
        if(s1.length()!=s2.length())
        return false;
        String comb=s1+s2;
        return comb.contains(s2);
    }
    public static void main(String args[])
    {
        String s1="hello";
        String s2="lohel";
        System.out.println(rotated(s1,s2));
    }
    
}