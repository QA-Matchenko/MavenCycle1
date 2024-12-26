package ru.netology.services;

public class FrelancerService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;
        for (int i = 0; i < 12; i++) {
            if (money <= threshold) {
                money += income;
                money -= expenses;
            } else {
                money -= expenses;
                money /= 3;
                count++;
            }

        }
        return count;
    }
}
