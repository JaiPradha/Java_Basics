import java.util.*;
public class Arraylist_Example {
    public static void main(String ars[]){
        ArrayList<String> ex = new ArrayList<>();
        ex.add("Apple");
        ex.add("Banana");
        ex.add("Mango");
        ex.add("Mango");
        System.out.println(ex.get(3));
        System.out.println(ex);
        ex.set(3, "Orange");
        System.out.println("Fruits:"+ex);
    }
}
