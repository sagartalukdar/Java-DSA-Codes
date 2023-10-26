public class BinarySearch {
    public static int lo(int[]arr,int x) {
        int start = 0, end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == x) {
                ans = mid;
                start = mid + 1;
            } else if (arr[mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]arr={1,2,4,5,2,5,74,1,21};
        System.out.println(lo(arr,5));

    }
    }