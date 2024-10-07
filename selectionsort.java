class selectionsort{
    public static void main(String[] args){
        int[] a={10,64,32,76,54,23};
        int n =a.length;
        for(int i=0;i<n;i++){
            int last=n-i-1;
            int max=0;
            for(int j=0;j<n-i;j++){
              if(a[j]>a[max]){
                max=j;
              }
            }
            int temp=a[last];
            a[last]=a[max];
            a[max]=temp;
        }
        for(int b:a){
            System.out.print(b+" ");
        }
    }
}