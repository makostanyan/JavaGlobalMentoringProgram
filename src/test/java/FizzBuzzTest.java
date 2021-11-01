import org.testng.Assert;
import org.testng.annotations.Test;

public class FizzBuzzTest {
    FizzBuzz test = new FizzBuzz();

    @Test
    public void fizzBuzzOneToHundredIsMultipleTree() {
    Assert.assertEquals(test.printFizzBuzz(3), "Fizz");
    }

    @Test
    public void fizzBuzzOneToHundredIsMultipleFive(){
        Assert.assertEquals(test.printFizzBuzz(5), "Buzz");
    }

    @Test
    public void fizzBuzzOneToHundredIsMultipleTreeAndFive(){
        Assert.assertEquals(test.printFizzBuzz(15), "FizzBuzz");
    }

    @Test
    public void fizzBuzzOneToHundredIsNotMultipleTreeAndFive(){
        Assert.assertEquals(test.printFizzBuzz(23), "23");
    }

    @Test
    public void fizzBuzzOneToHundredIsMultipleBigValue(){
        Assert.assertEquals(test.printFizzBuzz(150), "Out of range");
    }

}
