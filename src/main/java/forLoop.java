import java.util.Scanner;

public class forLoop {
    /*
    Найдите сумму чисел, делящихся на 6, в заданной последовательности натуральных чисел.
    Первая строка ввода — это количество элементов в последовательности; следующие строки - это сами элементы.
    Гарантируется, что в последовательности всегда есть число, кратное 6.
     */
            public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int lengthOfInput = scanner.nextInt();
            int inputs = 0;
            int sum = 0;
            for (int i = 0; i < lengthOfInput; i++) {
                inputs = scanner.nextInt();
                if (inputs % 6 == 0) {
                    sum += inputs;
                }
            }
            System.out.println(sum);
        }
    }

