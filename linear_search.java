public class linear_search {
    public static void main(String args[]){
     int arr[]={3,2,1,5,6,8,9};
     int key=6;
     System.out.println(key+" is found at index: "+search(arr, key));

    }
    static int search(int arr[],int key)
    {
        for(int i=0;i<arr.length;i++){
        if(key== arr[i]){
            return i;
            }
        }
           return -1;
    }

}
    

