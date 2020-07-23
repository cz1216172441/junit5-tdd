package junit5.tdd;

public class FizzBuzz {

    public String play(int inputNumber) {
        if (inputNumber % 3 == 0) {
            if (inputNumber % 5 == 0) {
                if (inputNumber % 7 == 0) {
                    return "FizzBuzzWhizz";
                }
                return "FizzBuzz";
            }
            if (inputNumber % 7 == 0) {
                return "FizzWhizz";
            }
            return "Fizz";
        }
        if (inputNumber % 5 == 0) {
            if (inputNumber % 7 == 0) {
                return "BuzzWhizz";
            }
            return "Buzz";
        }
        if (inputNumber % 7 == 0) {
            return "Whizz";
        }
        return String.valueOf(inputNumber);
    }

}
