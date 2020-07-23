package junit5.tdd;

public class FizzBuzz {

    public String play(int inputNumber) {
        StringBuilder stringBuilder = new StringBuilder();
        if (inputNumber % 3 == 0) {
            stringBuilder.append("Fizz");
        }
        if (inputNumber % 5 == 0) {
            stringBuilder.append("Buzz");
        }
        if (inputNumber % 7 == 0) {
            stringBuilder.append("Whizz");
        }
        if (!stringBuilder.toString().isEmpty()) {
            return stringBuilder.toString();
        }
        return String.valueOf(inputNumber);
    }

}
