class reversearray{
    public static void reverse(int[] arr){
     int left=0;
     int right=arr.length-1;
     while(left<right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;
     }
    }
    public static void main(String[] args){
    int[] a={10,4,6,3,9,52};
    reverse(a);
    for(int i=0 ;i<a.length;i++){
        System.out.print(a[i]+" ");
    }
    }
}