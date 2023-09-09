class linear{
    public static void main(String args[]){
      int arr[]={1,2,3,44,5,6,7,2};
    int target=7;
    int a=linearr(arr,target);System.out.println(a);

      
    }
    public static int linearr(int arr[],int t){
        for(int i=0;i<arr.length;i++){
            if(t==arr[i]){
                  return i;
            }
        }
        return 0;
    }

}