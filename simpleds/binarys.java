import java.util.Arrays;

public class binarys {
    public static void main(String args[]){
        int arr[]={2,4,7,9,8,1};
        Arrays.sort(arr);
   for(int i:arr){
    System.out.println(i);

   }
        int target=1;
        int low=0;
        int t=0;
        int high=arr.length-1;
        while(low<=high){

        int mid=(high+low)/2;
        if(arr[mid]<target){
            low=mid+1;
        }
        else if(arr[mid]>target){
            high=high-1;
        }
        else if(arr[mid]==target){
            System.out.println(arr[mid]);
            t=1;
          break;
        
        }
        
    }
    if(t==0){
            System.out.println("element not found");
        
        }
    }
    
}
