public class Pythagorean{
    public double calculateHypotenuse(double legA, double legB){
        double a = Math.pow(legA, 2);
        double b = Math.pow(legB, 2);
        double squareRoot = Math.sqrt(a+b);
        return squareRoot;

    }
}