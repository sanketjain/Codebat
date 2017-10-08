public class MergeSort {
     
    int[] arr;
    int[] temp;
    int length;
 
    public static void main(String a[]){
         
        int[] userInput = {3, 1, 4, 1, 5, 9, 2, 6, 5};
        MergeSort x = new MergeSort();
        x.sort(userInput);
        for(int p:userInput){
            System.out.print(p);
            System.out.print(" ");
        }
    }
     
    public void sort(int userInput[]) {
        this.arr = userInput;
        this.length = userInput.length;
        this.temp = new int[length];
        doMergeSort(0, length - 1);
    }
 
    void doMergeSort(int start, int end) {
         
        if (start < end) {
            int mid = start + (end - start) / 2;
            doMergeSort(start, mid);
            doMergeSort(mid + 1, end);
            doMerging(start, mid, end);
        }
    }
 
    public void doMerging(int start, int mid, int end) {
 
        for (int j = start; j <= end; j++) {
            temp[j] = arr[j];
        }

        int a = start;
        int b = mid + 1;
        int c = start;
        while (a <= mid && b <= end) {
            if (temp[a] <= temp[b]) {
                arr[c] = temp[a];
                a++;
            } else {
                arr[c] = temp[b];
                b++;
            }
            c++;
        }
        while (a <= mid) {
            arr[c] = temp[a];
            c++;
            a++;
        }
 
    }
}