public class NumberToWords {
    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Value");
        }
        int myNum = reverse(number);
        int myCount = getDigitCount(number);

        int tot = 0;
        int rem = 0;
        while (myNum != 0) {
            rem = myNum % 10;
            switch (rem) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;

            }
            myNum /= 10;
            tot += 1;
        }
        if (tot < myCount){
            int quantity = myCount - tot;
            while (quantity != 0){
                System.out.println("Zero");
                quantity -= 1;
            }
        }
        }

    public static int reverse(int num){

        int reversed = 0;
        int digit = 0;
        while (num != 0){
            digit = num % 10;
            reversed = (reversed * 10) + digit;
            num /= 10;
        }
        return reversed;
    }
    public static int getDigitCount(int number){

        if (number < 0) {
            return -1;
        }
        int counter = 0;
        do{
            counter++;
            number /= 10;
        } while (number > 0);
        return counter;
    }
}
