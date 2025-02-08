package advance_sorting;

public class merge_two_sorted_Array {
    public static void print(int []arr){
        for(int ele : arr){
            System.out.print(ele +" ");
        }
        System.out.println();
    }

    public static void mergearray(int []a,int []b,int[]c){
       int i=0,j=0,k=0;

        while(i<a.length && j<b.length){
            if (a[i]<=b[j]) {
                c[k]=a[i];
                i++;k++;
            } else {
            c[k]= b[j];
            k++;
            j++;}
        }
        while(i<a.length) {c[k]=a[i]; i++; k++;}
        while(j<b.length) {c[k]=b[j]; k++; j++;}

    }
    public static void main(String[] args) {
        int [] a={1,5,6,7,9};
        int [] b={9,10,12,13};
        print(a);
        print(b);
        int []c= new int[a.length+b.length];
        mergearray(a,b,c);
        print(c);

    }
}
