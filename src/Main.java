public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mass = 60;
        double height = 1.6;
        double bodyMassIndex = service.bmi(mass, height);
        System.out.println("ИМТ = " + bodyMassIndex);
    }
}
