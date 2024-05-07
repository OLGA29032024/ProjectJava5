public class BmiService {

    public int calculate(double heightM, int weightKg) {
        int bmi = (int) (weightKg / (heightM * heightM));
        return bmi;
    }
}
