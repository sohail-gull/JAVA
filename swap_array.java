import java.util.Arrays;
public class swap_array {
    public static void main(String args[])
    {
        int[] arr={1,4,3,5,6,8};
        swap(arr,3,5);
       // System.out.println(Arrays.toString(arr));
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
       }
      
    }
    static void swap(int[] arr, int index1 , int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
