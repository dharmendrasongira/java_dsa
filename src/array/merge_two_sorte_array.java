package array;

public class merge_two_sorte_array { public static void main(String[] args) {

    int[] arr ={0,1,5,8,10,12,16};
    int []brr= {5, 6, 9, 10, 15, 17, 19};




    int n= arr.length+brr.length;
    int[] crr =new int[n];
  int i=0, j=0, k=0;
  while (i< arr.length && j< brr.length) {
      if (arr[i] <= brr[j]) {
          crr[k] = arr[i];
          i++;
          k++;
      } else {
          crr[k] = brr[j];
          j++;
          k++;

      }
      if (i == arr.length) {
          while (j < brr.length) {crr[k] = brr[j];
          j++;
          k++;}
      }
      if (j == brr.length){ while (i < arr.length){ crr[k] = arr[i];
      i++;
      k++;}}
  }


    for (k=0;k<n;k++){
        System.out.print(crr[k]+ " ");
    }
    }}
