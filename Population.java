import java.util.Scanner;

class Population {
    public static void main(String[] args) {
        int sec, birth, death, immigrant, population, total;
        sec = 365 * 24 * 60 * 60 * 5;
        birth = sec / 7;
        death = sec / 13;
        immigrant = sec / 45;
        population = 312032486;
        total = population + birth - death + immigrant;
        System.out.println(total);
    }
}