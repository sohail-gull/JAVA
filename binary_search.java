public class binary_search {
    
    public static void main(String args[]){
      int arr[]={1,3,4,5,6,33,44,55,66};
      int target=5;
      int ans=binary(arr,target);
      System.out.println(ans);
     }
     static int binary(int[] arr ,int target){
     int start=0;
     int end= arr.length-1;
         while(start<=end){
           int mid= (start+end) / 2;
            if(target<arr[mid]){
               end = mid-1;
             }
                  else if (target>arr[mid])
              {
                 start=mid+1;

                }
             else{
               return mid;
                }
     }           
    return -1;    
    }
}
