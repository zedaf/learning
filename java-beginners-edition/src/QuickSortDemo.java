// Try this 6-3 - A simple version of quicksort
class Quicksort {
    // set up a call to the actual quicksort method
    static void qsort(char items[]) {
        qs(items, 0, items.length-1);
    }

    // a recursive version of quicksort for characters
    private static void qs(char items[], int left, int right) {
        int i, j;
        char x, y;

        i = left; j = right;
        x = items[(left + right) /2];

        do {
            while((items[i] < x) && (i < right)) i++;
            while((x < items[j]) && (j > left)) j--;

            if(i <= j) {
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++; j--;
            }
        }while(i <= j);

        if(left < j) qs(items, left, j);
        if(i < right) qs(items, i, right);
    }
}

class QuickSortDemo {
    public static void main(String args[]) {
        char a[] = {'d', 'x', 'a', 'r','p','j','i'};
        int i;

        System.out.print("Original Array: ");
        for(i=0; i < a.length; i++) {
            System.out.print(a[i]);
        }

        System.out.println();

        // sort the array
        Quicksort.qsort(a);

        System.out.print("Sorted Array: ");
        for(i=0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}