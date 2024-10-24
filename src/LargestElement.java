import java.util.Scanner;

public class LargestElement {
    public static int LargestElement(int arr[]){
        int largerElement=arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]>largerElement){
                largerElement=arr[i];
            }

        }
        return largerElement;

    }
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
