import java.util.*;

public class DiagnolElements {
    public static void main(String ars[]){
        Scanner sc = new Scanner(System.in);
        int d1=0,d2=0,d3=0,d4=0,d5=0,d6=0,d7=0,d8=0;
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
         for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" "); 
            }
                System.out.println();
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==j){
                System.out.print(arr[i][j]+" "); 
               
                 d1=d1+arr[i][j];
                 
                }
            }
                System.out.println();
            }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i+j== row-1){
                System.out.print(arr[i][j]+" "); 
               
                d2=d2+arr[i][j];
                
                }
            }
                System.out.println();
        }

        
            for(int i=0;i<row;i++){
            { 
                int j=0;
               
                d3=d3+arr[i][j];
                j++;
                d4=d4+arr[i][j];
                j++;
                d5=d5+arr[i][j];
                
            }
        }
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
}
}
