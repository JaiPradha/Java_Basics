import java.util.*;
public class LinkedList_Example {
    public static void main(String ars[]){
        LinkedList<String> ex = new LinkedList<>();
        ex.add("Apple");
        ex.add("Banana");
        ex.add("Mango");
        ex.add("Mango");
        System.out.println(ex.get(3));
        System.out.println(ex);
        ex.set(3, "Orange");
        System.out.println("Fruits:"+ex);
        ex.remove(1);
        System.out.println("Fruits:"+ex);
        ex.addFirst("Tomato");
          System.out.println("Fruits:"+ex);
    }
}
