public class FizzBuzz {
    public String fizzBuzz(int number){
        if(number%3 == 0 && number%5 ==0){
            String f = "FizzBuzz";
            return f;
        }else if(number%3 == 0){
            String f = "Fizz";
            return f; }
            else if(number%5 ==0){
            String f = "Buzz";
            return f;
        }else if(number%2 == 0){
                String f = "2";
                return f;
        }
        String f = "None";
        return f;
    }
}
