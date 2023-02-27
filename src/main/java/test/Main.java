package test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Diamond diamond = new Diamond();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите высоту от 1 до 80");
        diamond.setHeight(scanner.nextInt());
        System.out.println("Введите ширину от 1 до 80");
        diamond.setWidth(scanner.nextInt());
        diamond.print(diamond.getHeight(), diamond.getWidth());
    }
}

