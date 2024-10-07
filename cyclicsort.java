
class cyclicsort{
    public static void main(String[] args){
     int[] a ={1,4,3,2,5};
         int n =a.length;
         int i=0;
         while(i<n){
            int correct=a[i]-1;
            if(a[i]<n && a[i]!=a[correct]){
               int temp=a[i];
               a[i]=a[correct];
               a[correct]=temp;
            }
            else{
                i++;
            }
         }
         for(int b:a){
            System.out.print(b+" ");
         }
    }
}