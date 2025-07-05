import java.util.Scanner;
public class Upper_and_Lower_sealevel {
    public static void main(String ara[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();
        int level = 1;
        int num=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i).equals("D"))
            {
                level--;
            }
            else{
                level++
            }
        }
    


    }
    
}
