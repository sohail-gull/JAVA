import java.util.*;
public class cyclic_sort {
    public static void main(String args[]){
       int arr[]={3,5,2,1,4};
       sort(arr);
       System.out.print(Arrays.toString(arr));
     }
     static void sort(int arr[]){
   int i=0;
   while(i<arr.length){
    int element=arr[i]-1;
    if(arr[i]!=arr[element]){
        int temp=arr[element];
        arr[element]=arr[i];
        arr[i]=temp;

    }
    else{
        i++;
    }
   }
    }
}
