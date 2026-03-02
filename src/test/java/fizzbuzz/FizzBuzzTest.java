
package fizzbuzz;

import org.example.FizzBuzz.FizzBuzz;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest{

//    @Test
//    public void check_1_1(){
//        assertEquals("1", new FizzBuzz().convert(1));
//    }
//
//    @Test
//    public void check_2_2(){
//        assertEquals("2", new FizzBuzz().convert(2));
//    }

    @ParameterizedTest
    @CsvSource({
            "1, '1'",
            "2, '2'",
            "4, '4'",
            "7, '7'",
            "8, '8'"
    })
    void check_number_to_string(int input, String expectedOutput){
        assertEquals(expectedOutput, new FizzBuzz().convert(input));
    }

//    @Test
//    public void check_6_to_Fizz(){
//        assertEquals("Fizz", new FizzBuzz().convert(6));
//    }

    @ParameterizedTest
    @CsvSource({
            "3, Fizz",
            "6, Fizz",
            "12, Fizz"
    })
    void check_number_to_Fizz(int input, String expectedOutput){
        assertEquals(expectedOutput, new FizzBuzz().convert(input));
    }

    @ParameterizedTest
    @CsvSource({
            "5, Buzz",
            "10, Buzz",
            "25, Buzz"
    })
    public void check_number_to_buzz(int input, String expectedOutput){
        assertEquals(expectedOutput, new FizzBuzz().convert(input));
    }

    @ParameterizedTest
    @CsvSource({
            "15, FizzBuzz",
            "75, FizzBuzz"
    })
    public void check_number_to_fizzbuzz(int input, String expectedOutput){
        assertEquals(expectedOutput, new FizzBuzz().convert(input));
    }
}