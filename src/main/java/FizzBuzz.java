public class FizzBuzz {

    public String printFizzBuzz(int i) {
        if (i >= 1 && i <= 100) {
             if (i % 3 == 0 && i % 5 == 0){
                 return "FizzBuzz";
             }if(i % 5 == 0){
                 return "Buzz";
             }if (i % 3 == 0){
                return "Fizz";
             }
            return String.valueOf(i);
        }  return "Out of range";
    }
}
