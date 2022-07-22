import java.util.Scanner;

class Average11 {
    public static void main(String[] args) {
        double kilo, min, sec, time, speed;
        kilo = 24;
        min = 40;
        sec = 35;
        time = (min / 60) + (sec / 3600) + 1;
        speed = (kilo / time) * 1.6;
        System.out.println(speed + "km/h");
    }
}