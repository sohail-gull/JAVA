import java.util.*;
public class linear_search_userinput {
    public static void main(String args[]){
        int size;
         int key;
        
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size\n");
         size=sc.nextInt();
         int arr[]=new int[size];
        System.out.print("\nenter array elements\n");
        for(int i=0;i<size;i++){
           arr[i]=sc.nextInt();

        }
        System.out.println("Enter value to find");  
        key = sc.nextInt(); 
        for (int i=0;i<size;i++)  
        {  
          if (arr[i] ==key)     
          {  
             System.out.println(key + " is present at location " + i +".");  
              break;  
            }  
            else{ 
              System.out.println(key + " isn't present in array.");   
              break;         
            }
        }
          
    }
}
