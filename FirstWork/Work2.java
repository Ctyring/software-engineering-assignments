public class Work2 {
    public static void main(String[] args) {
        int sum = 0;
        int max = 0;
        int[] array = { -1, 2, -3, 12, -5, -1, 9, -2 };
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (sum < 0) {
                sum = 0;
            }
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println("最大子数组为:" + max);
    }
    }
