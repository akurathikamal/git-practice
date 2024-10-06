class bubblesort{
    public static void main(String[] args){
        int [] a={10,7,82,4,67,54};
        int n =a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp =a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}