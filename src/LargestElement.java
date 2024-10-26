import java.util.Scanner;

public class LargestElement {
    public static int largestElement(int [] arr){
        int largestElement=arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]>largestElement){
                largestElement=arr[i];
            }
        }
        return largestElement;

    }

    public static void main(String [] args){
        System.out.println("largest number");
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
//        System.out.println(size);
        int [] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
     //Access Data
        for(int i=0;i< arr.length;i++){
            System.out.println("index are"+i+"::"+arr[i]);
        }

        int s=largestElement(arr);
        System.out.println("largestElement::"+s);


    }
}
