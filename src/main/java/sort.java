import java.util.Arrays;
    import java.util.Random;

    public class sort {

        static void insertionSort(int[] arr) {
            for (int i = 1; i < arr.length; i++) {
                int key = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = key;
            }
        }

        static int[] randomArray(int n) {
            Random rand = new Random();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = rand.nextInt(n);
            }
            return arr;
        }

        static int[] orderedArray(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = i;
            }
            return arr;
        }

        static int[] partiallyOrderedArray(int n) {
            Random rand = new Random();
            int[] arr = new int[n];
            for (int i = 0; i < n / 2; i++) {
                arr[i] = i;
            }
            for (int i = n / 2; i < n; i++) {
                arr[i] = rand.nextInt(n);
            }
            return arr;
        }

        static int[] reverseOrderedArray(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = n - i - 1;
            }
            return arr;
        }

        public static void main(String[] args) {
            int[] nValues = {10, 20, 40, 80, 160,320,640,1280,2560,5120};
            for (int n : nValues) {
                int[] randomArr = randomArray(n);
                int[] orderedArr = orderedArray(n);
                int[] partiallyOrderedArr = partiallyOrderedArray(n);
                int[] reverseOrderedArr = reverseOrderedArray(n);

                long startTime = System.nanoTime();
                insertionSort(randomArr);
                //Arrays.sort(randomArr);
                long endTime = System.nanoTime();
                System.out.println("Random array of size " + n + " took " + (endTime - startTime) + " nanoseconds to sort.");

                startTime = System.nanoTime();
                insertionSort(orderedArr);
                //Arrays.sort(orderedArr);
                endTime = System.nanoTime();
                System.out.println("Ordered array of size " + n + " took " + (endTime - startTime) + " nanoseconds to sort.");

                startTime = System.nanoTime();
                insertionSort(partiallyOrderedArr);
                //Arrays.sort(partiallyOrderedArr);
                endTime = System.nanoTime();
                System.out.println("Partially ordered array of size " + n + " took " + (endTime - startTime) + " nanoseconds to sort.");

                startTime = System.nanoTime();
                insertionSort(reverseOrderedArr);
                //Arrays.sort(reverseOrderedArr);
                endTime = System.nanoTime();
                System.out.println("Reverse ordered array of size " + n + " took " + (endTime - startTime) + " nanoseconds to sort.");
            }
        }
    }


