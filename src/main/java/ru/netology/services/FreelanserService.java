package ru.netology.services;

public class FreelanserService {
    public int calculate(int income, int expenses, int threshold) {

       int counter = 0;
       int wallet = 0;
        for (int i = 0; i < 12; i++) {
            if (wallet >= threshold) {
                // отдыхаем
                wallet -= expenses;
                wallet /= 3;
                counter++;
            } else {
                // работаем
                //wallet = wallet + income; //1 вариант увеличение значения
                wallet += income; //2 вариант увеличение значения
                wallet -= expenses;
            }
        }
        return counter;
    }
}
