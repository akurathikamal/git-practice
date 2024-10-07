class insertionsort{
    public static void main(String[] args){
        int [] a={10,5,27,24,89,67};
        int n =a.length;
        for(int i=0;i<n-1;i++){
             for(int j=i+1;j>0;j--){
                if(a[j]<a[j-1]){
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
                else{
                    break;
                }
             }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}