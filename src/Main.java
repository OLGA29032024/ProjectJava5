//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        BmiService service = new BmiService();
        int heightM;
        int weightKg;
        int calculate = service.calculate(1.87, 98);
        System.out.println(calculate);

        int heightM1;
        int weightKg1;
        int calculate1 = service.calculate(1.65, 98);
        System.out.println(calculate1);

        int heightM2;
        int weightKg2;
        int calculate2 = service.calculate(1.75, 75);
        System.out.println(calculate2);

        int heightM3;
        int weightKg3;
        int calculate3 = service.calculate(1.58, 66);
        System.out.println(calculate3);
    }
}