package HashmapSuperb;

import java.util.*;
public class Qn3 {
    public static void main(String[] args) {
        Map<String,String> obj = new HashMap<>();
        System.out.println(" Map Size = " + obj.size());
        obj.put("Myname","Madhu");
        obj.put("Native","Mysore");
        obj.put("Branch","ISE");
        obj.put("Company","HPS");
        obj.put("Designation","Trainee");
        System.out.println(obj);
        System.out.println(obj.get("place"));
        //clone hash map
        System.out.println("The cloned map look like this: " + ((HashMap<String, String>) obj).clone());
        //contains
        if(obj.containsValue("ISE")){
            System.out.println("The Hashtable contains value ISE");
        } else {
            System.out.println("The Hashtable does not contains value Maruti800");
        }
        System.out.println(obj.isEmpty());
        System.out.println("Is Map Empty? => " + obj.isEmpty());
        System.out.println("Adding a new Entry to Map.");
        obj.put("Deepak Malik", "Deeps");
        System.out.println("Is Map Empty? => " + obj.isEmpty());
        System.out.println("Size of Map => " + obj.size());
        System.out.println("Does Map contains Key (Madhu)? => " + obj.containsKey("Madhu"));
        System.out.println("Does Map contains Key (Deepak)? => " + obj.containsKey("Deepak"));
        System.out.println("Does Map contains Value (Deeps)? => " + obj.containsValue("Deeps"));
        System.out.println("Get the value associated with Key (Deepak Malik)? => " + obj.get("Deepak Malik"));
        //System.out.println("Capacity of Map => " + ((HashMap<String, String>) obj).capacity());
        System.out.println("Clearing the Map.");
        obj.clear();
        System.out.println("Size of the Map after clearing. => " + obj.size());
        //obj.rehash();
        //System.out.println("obj.size(): " + obj.size());
        Set<String> keys = obj.keySet(); //method called as keyset, it gives u set of key's
        for(String key : keys) //DOUBT
        {
            System.out.println(obj.get(key));
        }
    }
}
