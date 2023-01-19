public class BmiService {

    public double calculate(int weight, double height) {
        double bmi = weight / Math.pow(height, 2);
        return bmi;
    }

}
