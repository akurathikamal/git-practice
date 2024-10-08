import java.util.Arrays;

public class mergearray {
    public static void main(String[] args){
        int[] a={10,6,3,5,2,67,34,23};
      
        a=sort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    static int[] sort(int[] arr){
      if(arr.length<2){
        return arr;
      }
      int mid=arr.length/2;
      int[] left=sort(Arrays.copyOfRange(arr, 0, mid));
      int[] right=sort(Arrays.copyOfRange(arr, mid, arr.length));

      return merge(left,right);
    }
    static int[] merge(int[] first,int[] second){
        int i=0,j=0,k=0;
        int[] mix =new int[first.length+second.length];
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                  mix[k]=first[i];
                  i++;
            }
            else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        while(i<first.length){
            mix[k]=first[i];
            k++;
            i++;
        }
        while(j<second.length){
            mix[k]=second[j];
            k++;
            j++;
        }
        return mix;
    }
}
