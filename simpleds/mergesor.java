public class mergesor {
    public static void main(String args[]){
        int arr[]={1,4,2,5,3,6};
        
         merge(arr);
        for(int i:arr){
            System.out.println(i);
        }
       
    }
    private static void merge(int arr[]){
        int len=arr.length;
        int mid=len/2;
        if(len<=1) return;//base
        int leftarr[]=new int[mid];
        int righarr[]=new int[len-mid];
        int i=0;
        int j=0;
        for(;i<len;i++){
            if(i<mid){
                leftarr[i]=arr[i];
            }
            else{
                righarr[j]=arr[i];
                j++;


            }
            merge(leftarr);
            merge(righarr);
            merge(leftarr,righarr,arr);
        }}
        private static void merge(int left[],int right[],int arr[]){

            
        }
    
    
}
