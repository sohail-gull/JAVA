import java.util.Arrays;

public class bianry2D {
    public static void main(String args[]){
         int arr[][]={
            {10, 20, 30, 40},
            {12, 22, 33, 44},
            {15, 25, 35, 48}
         };
        
         int target=49;
        System.out.println(Arrays.toString(search2D(arr, target)));
    }
    static int[] search2D(int arr[][],int target){
          int row=0;
          int col=arr.length-1;
          while(row<arr.length && col>=0){
            if(arr[row][col]== target){
                return new int[]{row,col};
            }
            else if(arr[row][col]<target){
                row++;
            }
            else{
                col--;
            }
          }
          return new int[]{-1,-1};
    }
    
}
