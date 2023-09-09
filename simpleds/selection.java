class selection {
    public static void main(String args[]){
 int arr[]={1,2,4,5,6,7,8,9,8};
 for(int i=0;i<arr.length-1;i++){
    int min=i;
    for(int j=i+1;j<arr.length;j++){
        if(arr[min]>arr[j]){
            min=j;
        }

    }
    int temp=arr[min];
    arr[min]=arr[i];
    arr[i]=temp;

 }
 for(int k:arr){
    System.out.println(k);
 }
    }
}

