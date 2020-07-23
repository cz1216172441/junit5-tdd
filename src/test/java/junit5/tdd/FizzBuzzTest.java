package junit5.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    /**
     * given 1
     * when count off
     * then 1
     */
    @Test
    void should_return_1_when_count_off_given_1() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 1;
        // when
        String actual = fizzBuzz.play(inputNumber);
        // then
        assertEquals("1", actual);
    }

    /**
     * given 3
     * when count off
     * then fizz
     */
    @Test
    void should_return_fizz_when_count_off_given_3() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 3;
        // when
        String actual = fizzBuzz.play(inputNumber);
        // then
        assertEquals("Fizz", actual);
    }

    /**
     * given 5
     * when count off
     * then buzz
     */
    @Test
    void should_return_buzz_when_count_off_given_5() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 5;
        // when
        String actual = fizzBuzz.play(inputNumber);
        // then
        assertEquals("Buzz", actual);
    }

    /**
     * given 15
     * when count off
     * then fizzbuzz
     */
    @Test
    void should_return_fizzbuzz_when_count_off_given_15() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 15;
        // when
        String actual = fizzBuzz.play(inputNumber);
        // then
        assertEquals("FizzBuzz", actual);
    }

    /**
     * given 7
     * when count off
     * then whizz
     */
    @Test
    void should_return_whizz_when_count_off_given_7() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 7;
        // when
        String actual = fizzBuzz.play(inputNumber);
        // then
        assertEquals("Whizz", actual);
    }
}