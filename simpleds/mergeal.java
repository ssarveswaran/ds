public class mergeal {
    public static void main(String args[])
{
    int arr[]={3,2,4,5,6,7,8};
    int low=0;
    int high=arr.length-1;
    merge(arr,low,high);
    for(int i:arr){
        System.out.println(i);
    }
    
}   
public static void merge(int arr[],int low,int high) {
    
    if(low<high){
    int mid=(low+high)/2;
    merge(arr,low,mid);
    merge(arr,mid+1,high);
    merge(arr,low,mid,high);
    
      
}}
public static void merge(int arr[],int low,int mid,int high){
    int i=low;
    int j=mid+1;
    int k=low;
    int arr1[]=new int[arr.length];
    while(i<=mid&&j<=high){
        if(arr[i]<=arr[j]){
            arr1[k]=arr[i];
            i++;
        }
        else{
            arr1[k]=arr[j];
            j++;
        }
        k++;
    }
    if(i>mid){
        while(j<=high){
            arr1[k]=arr[j];
            k++;
             j++;
        }
    }
    else{
        while(i<=mid){
            arr1[k]=arr[i];
            k++;
            i++;
        }
    }
    for (k = low; k <= high; k++) {
        arr[k] = arr1[k];
    }
   
    
}

}
