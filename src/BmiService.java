public class BmiService {
    public double bmi(double m, double h) {
        double imt = m / h * 1 / h;
        return imt;
    }
}
