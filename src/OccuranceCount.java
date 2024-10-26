import java.util.Scanner;

public class OccuranceCount {
    public static int CountOccuence(int [] arr,int targetNum){
        int count=0;
        for(int i=0;i< arr.length;i++){
            if(targetNum==arr[i]){
                count ++;
            }
        }
        return count;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        int [] arr=new int[size];
        for(int i=0;i< arr.length;i++){
             arr[i]= sc.nextInt();
        }
        System.out.println("target element");
        int targetNum=sc.nextInt();
        int c=CountOccuence(arr,targetNum);
        System.out.println("number of occurence:"+c);
    }
}
