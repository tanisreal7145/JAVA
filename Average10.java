import java.util.Scanner;

class Average10 {
    public static void main(String[] args) {
        double kilo, min, sec, time, speed;
        kilo = 14;
        min = 45;
        sec = 30;
        time = (min / 60) + (sec / 3600);
        speed = (kilo / time) / 1.6;
        System.out.println(speed + "miles/hr");
    }
}