package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
//        int count = 0;
//        for (int i = 10; i <= 99; i++) {
//            if (i * i >= 100 && i * i <= 400) {
//                count++;
//            }
//        }
//        System.out.println(count);
        SQRService service = new SQRService();
        System.out.println(service.calcAmountOfSqrtInRange(100 , 400));
    }
}