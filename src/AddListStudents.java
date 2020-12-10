import java.util.*;

public class AddListStudents
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

        //changing the element
        a.set(2,"Dates");

        //Traversing list through for-each loop
        for(String sname:a)
            System.out.println(sname);

    }
}
