import java.util.Scanner;

public class SumOfElement {
    public static int SumOfArrays(int[]arr){
        int sum=0;
        for(int i=0;i< arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int s=SumOfArrays(arr);
        System.out.println("Sum  is::"+s);
    }
}
