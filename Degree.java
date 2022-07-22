import java.util.Scanner;

class Degree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double F = input.nextDouble();
        double C = ((F - 32) * 5 / 9);
        if (F >= 32 && F <= 4000) {
            System.out.format("%.4f\n", C);
        } else
            System.out.println(C);
        input.close();
    }
}