public class BmiService {
    public int calculate(int massKg, double heightMeter) {
        double index = massKg / (heightMeter * heightMeter);

        return (int) index;

    }
}
