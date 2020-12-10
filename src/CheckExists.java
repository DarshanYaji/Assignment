import java.util.*;
public class CheckExists
{
    public static void main(String args[])
    {

        //Creating arraylist
        ArrayList<String> a=new ArrayList<String>();

        //Adding object in arraylist
        a.add("Darshan");
        a.add("Madhu");
        a.add("Monin");
        a.add("Krishna");

        //1
        boolean check = a.contains("Manoj");
        if (check)
            System.out.println("The list contains Manoj");
        else
            System.out.println("The list does not contains Manoj");

        //2
        check = a.contains("Darshan");
        if (check)
            System.out.println("The list contains Darshan");
        else
            System.out.println("The list does not contains Darshan");

    }
}
