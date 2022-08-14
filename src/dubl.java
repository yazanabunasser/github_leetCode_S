public class dubl {
    static int containsDuplicate(int[] a) {
        int size = a.length;
        int maxSoFar = Integer.MIN_VALUE, max_ending_here = 0;
        System.out.println(maxSoFar);

        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a[i];
            if (maxSoFar < max_ending_here)
                maxSoFar = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return maxSoFar;
    }
}
