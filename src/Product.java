import java.util.*;
public class Product {
    public static void main(String[] args) {
        Map<String, String> obj = new HashMap<>();
        obj.put("P001", "Maruti800");
        obj.put("P002", "MarutiZen");
        obj.put("P003", "MarutiEsteem");


        System.out.println(obj);
        //System.out.println(obj.get("lo"));
        if (obj.containsValue("Maruti800")) {
            System.out.println("The Hashtable contains value Maruti800");
            String removed_product_name = (String) obj.remove("P001");
            System.out.println("Removed product name from the Hash Table is " + removed_product_name);
        } else {
            System.out.println("The Hashtable does not contains value Maruti800");
        }

    }
}