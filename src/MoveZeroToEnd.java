import java.util.Scanner;

public class MoveZeroToEnd {
    public static int MoveZeroElementToEnd(int [] arr,int element){
        int index=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==element){
                index=arr[i];
                index++;
            }
        }
        return index;
    }
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        int [] arr=new int[size];
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("element are");
        int element= sc.nextInt();
    }
}
