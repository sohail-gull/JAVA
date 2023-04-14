//package array;

public class array_largest {
public static void main(String args[]){
    int  largest=Integer.MIN_VALUE;
    int arr[]={3,4,5,2,7};
     for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            largest=arr[i];
           // System.out.print("largest nno. is \n:"+largest);
        }
     }
     System.out.print("largest no. is :"+largest);

}
    
}
