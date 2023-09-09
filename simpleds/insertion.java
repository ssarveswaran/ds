class insertion {
    public static void main(String args[]){
        int arrr[]={4,2,6};  
        for(int i=1;i<arrr.length;i++){
            int t=arrr[i];
            int j=i-1;
            while(j>=0&&arrr[j]>t){
                arrr[j+1]=arrr[j];
                j--;
            }

            arrr[j+1]=t;
            
            
        }
    for(int k:arrr){
        System.out.println(k);
    }
    }
    
}
