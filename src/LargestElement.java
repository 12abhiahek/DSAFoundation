import java.util.Scanner;

public class LargestElement {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        //Access array
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}