package Two_D_array;

public class spiral_printing_of_matrix {

    public static void main(String[] args) {
       int arr[][] = {{1, 2, 3 ,4, 5}, {6, 7, 8, 9,10},{11,12,13,14,15}};
        int minr= 0;
        int maxr= arr.length-1;
        int maxc = arr[0].length-1;
        int minc=0;

    while(minr<=maxr && minc<=maxc) {



                for (int j = minc; j <=maxc; j++) {
                    System.out.print(arr[minr][j] + " ");
                }

                minr++;

                if (minr>maxr || minc>maxc)break;

            for (int i = minr; i <= maxr; i++) {

                    System.out.print(arr[i][maxc] + " ");
                }
                maxc--;

                if (minr>maxr || minc>maxc)break;


                for (int j = maxc; j >=minc; j--) {
                    System.out.print(arr[maxr][j] + " ");
                }
                maxr--;

             if (minr>maxr ||minc>maxc)break;

            for (int i = maxr; i >= minr; i--) {

                    System.out.println(arr[i][minc] + " ");
                }
                minc++;


        }
    }}


