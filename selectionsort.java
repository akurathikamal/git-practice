class selectionsort{
    public static void main(String[] args){
        int [] a={10,5,27,24,89,67};
        int n =a.length;
        for(int i=0;i<n;i++){
            int last =n-1-i;
            int max=0;
            for(int j=0;j<n-i;j++){
                if(a[j]>a[max]){
                    max=j;
                }
            }
            int temp =a[max];
            a[max]=a[last];
            a[last]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}