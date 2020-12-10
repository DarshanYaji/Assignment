import java.util.*;

public class UserInputCheck
{
    public static void main(String args[])
    {

        Scanner in = new Scanner(System.in);

        //Creating arraylist
        ArrayList<String> input=new ArrayList<String>();


            input.add(in.next());
            boolean check = input.contains("Darshan");
            if (check)
                System.out.println("The list contains Darshan");
            else
                System.out.println("The list does not contains Darshan");



        //1

    }
}
