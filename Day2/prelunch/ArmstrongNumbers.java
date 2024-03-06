public class ArmstrongNumbers {

    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 100 and 500:");

        for (int num = 100; num <= 500; num++) {
            int originalNumber = num;
            int sum = 0;
            while (originalNumber != 0) {
                int digit = originalNumber % 10;
                sum += digit * digit * digit;
                originalNumber /= 10;
            }
            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}
