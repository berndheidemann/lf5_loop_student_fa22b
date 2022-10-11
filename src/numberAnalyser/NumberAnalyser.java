package numberAnalyser;

public class NumberAnalyser {

    public int getGGT(int number1, int number2) {
        while (number2 != 0) {
            if (number1 > number2) {
                number1 = number1 - number2;
            } else {
                number2 = number2 - number1;
            }
        }
        return number1;
    }

    public boolean isPrimeNumber(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public String getPrimeNumbers(int start, int end) {
        String result = "";
        for (; start <= end; start++) {
            if (isPrimeNumber(start)) {
                result += start + " ";
            }
        }
        result = result.substring(0, result.length() - 1);
        return result;
    }

    public int getChecksum(int number) {
        int sum = 0, digit;
        do {
            digit = number % 10;
            number = number / 10;
            sum += digit;
        } while (number > 0);
        return sum;
    }

    public boolean isHappyNumber(int number) {
        int sum, digit;
        do {
            sum = 0;
            do {
                digit = number % 10;
                number = number / 10;
                sum = sum + digit * digit;
            } while (number > 0);
            number = sum;
        } while (sum != 1 && sum != 4);

        if (sum == 1)
            return true;
        else
            return false;
    }

    public boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                sum += i;
        }
        if (number == sum)
            return true;
        else
            return false;
    }
}
