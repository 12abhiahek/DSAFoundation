import java.util.Scanner;

public class CheckSortedElement {
    public static boolean CheckSortedArray(int []arr){
        boolean issorted=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]<arr[i]){
                issorted=false;
            }
        }
        return issorted;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr=new int[size];
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        boolean s=CheckSortedArray(arr);
        System.out.println(s);

    }
}
