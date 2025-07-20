import java.util.*;
public class VMS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        int N = sc.nextInt();
        int K = sc.nextInt();
        int M = sc.nextInt();
        
       Set<Integer> setk = new HashSet<>();
       Set<Integer> setm = new HashSet<>();
        
        for(int i=0;i<K;i++){
            setk.add(sc.nextInt());
        }
        for(int i=0;i<M;i++){
            setm.add(sc.nextInt());
        }
        for(int i=0;i<K;i++){
                if(setk.contains(setm))
                {
                    count++;
                }

        }
        System.out.println(count);



    }
}
