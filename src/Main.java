public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bodyMass  = 70;             //вес в килограммах
        float bodyHeight = 1.80F;       //рост в метрах
        float bodyMassIndex = service.calculate(bodyMass,bodyHeight);
        System.out.printf("%.1f%n",bodyMassIndex);
    }
}
