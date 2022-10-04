package numberListGenerator;

public class Programm {
    public static void main(String[] args) {
        Generator gen = new Generator();
        System.out.println(gen.generateNumbers(0, 15, 3, ','));
    }
}
