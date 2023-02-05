public class Example1 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3};
        int a = sumAll(numbers);
        System.out.println(a);
    }

    public static int sumAll(int[] numbers) {
        int sumResult = 0;
        for (int i = 0; i < numbers.length; i++) {
           sumResult = sumResult + numbers[i];
        }
        return sumResult;
    }
}
