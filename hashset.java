import java.util.*;
class hashset
{
    public static void main(String args[])
    {
        LinkedList<String> a=new LinkedList<>();
        a.add("Akshaya");
        a.add("Ajay");
        a.add("sarada");
        a.add("chiranjeevi");
        a.add("kalpana");
        //Iterator
        for(String s:a)
        {
            System.out.println(s+" ");
        }
    }
}