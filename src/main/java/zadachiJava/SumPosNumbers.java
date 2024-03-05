package zadachiJava;
//Задача 13
//Найти сумму положительных нечетных чисел, меньших 50. Написать на это код
public class SumPosNumbers {
        public static void main(String[] args) {
            int sum = 0;
            for (int i = 1; i < 50; i += 2) {
                sum += i;
            }

            System.out.println("Сумма положительных нечетных чисел, меньших 50: " + sum);
        }
    }

