import java.util.Scanner;

public class SecondLargestElement {
    public static int secondLargestElement(int []arr){
        int largest=arr[0];
        int Slargest=arr[1];
        for(int i=0; i< arr.length;i++){
            if(arr[i]>largest){
                Slargest=largest;
                largest=arr[i];
            } else if(Slargest>arr[i] && arr[i]!=largest) {
                Slargest=arr[i];

            }
        }
        return Slargest;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr=new int[size];
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int s=secondLargestElement(arr);
        System.out.println("Second largest element are::"+s);
    }
}
