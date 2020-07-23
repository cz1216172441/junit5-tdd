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
     * then Fizz
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
     * then Buzz
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
     * then FizzBuzz
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
     * then Whizz
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

    /**
     * given 21
     * when count off
     * then FizzWhizz
     */
    @Test
    void should_return_fizzwhizz_when_count_off_given_21() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 21;
        // when
        String actual = fizzBuzz.play(inputNumber);
        // then
        assertEquals("FizzWhizz", actual);
    }

    /**
     * given 35
     * when count off
     * then BuzzWhizz
     */
    @Test
    void should_return_buzzwhizz_when_count_off_given_35() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 35;
        // when
        String actual = fizzBuzz.play(inputNumber);
        // then
        assertEquals("BuzzWhizz", actual);
    }

    /**
     * given 105
     * when count off
     * then FizzBuzzWhizz
     */
    @Test
    void should_return_fizzbuzzwhizz_when_count_off_given_105() {
        // given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 105;
        // when
        String actual = fizzBuzz.play(inputNumber);
        // then
        assertEquals("FizzBuzzWhizz", actual);
    }
}