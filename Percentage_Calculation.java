import java.util.*;

abstract class Marks {
    abstract void getPercentage();  
}

class A extends Marks {
    void getPercentage() {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        System.out.println( ((a1 + a2 + a3) / 3.0));
    }
}

class B extends Marks {
    void getPercentage() {
        Scanner sc = new Scanner(System.in);
        
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int a4 = sc.nextInt();
        System.out.println( ((a1 + a2 + a3 + a4) / 4.0));
    }
}

class Percentage_Calculation {
    public static void main(String[] args) { 
        A obj = new A();
        obj.getPercentage(); 

        B ob = new B();
        ob.getPercentage(); 
    }
}
