package ru.netology;

public class Main {
    public static void main(String[] args) {
        try {
            for (int r : new Randoms(90, 10)) {
                System.out.println("Случайное число: " + r);
                if (r == 100) {
                    System.out.println("Выпало число 100, давайте на этом закончим");
                    break;
                }
            }
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
    }
}