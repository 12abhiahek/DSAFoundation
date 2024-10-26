import java.util.Scanner;

public class ReverseArray {
    public static void Reverse(int []arr){
        for(int i= 0;i< arr.length/2;i++){
            int temp=arr[i];
            temp=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }

    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Reverse(arr);
        for(int val:arr){
            System.out.println(val);
        }

    }
}
