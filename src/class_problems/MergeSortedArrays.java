package class_problems;

public class MergeSortedArrays {
    public int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i = i + 1;
            } else {
                result[k] = arr2[j];
                j = j + 1;
            }
            k = k + 1;
        }

        while (i < arr1.length) {
            result[k] = arr1[i];
            i = i + 1;
            k = k + 1;
        }

        while (j < arr2.length) {
            result[k] = arr2[j];
            j = j + 1;
            k = k + 1;
        }

        return result;
    }

    public static void main(String[] args) {
        MergeSortedArrays solution = new MergeSortedArrays();
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        int[] result = solution.mergeSortedArrays(arr1, arr2);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}