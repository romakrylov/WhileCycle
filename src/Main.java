import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* введите пин
        int secretPinCode = 7567;
        int pinCode = -1;

        Scanner scanner = new Scanner(System.in);
        while (pinCode != secretPinCode) {
            if (pinCode == -1) {
                System.out.println("Введите пароль:");
            } else {
                System.out.println("Пароль введён неверно. Введите верный пароль:");
            }
            pinCode = scanner.nextInt();
        }

        System.out.println("Пароль введён верно!!!");
    }
}

         */

/*бесконечный цикл
        while (true) {
            System.out.println("Текст будет повторяться постоянно");
        }
    }
}

 */
        /*сложение чисел, пока не будет введено число 0
        int sum = 0;

        int value = -1;
        while (value != 0) {
            value = new Scanner(System.in).nextInt();
            sum = sum + value;
        }

        System.out.println("Сумма введенных чисел " + sum);
    }
}


         */

//Задание 1. Код с циклом while

        int sum = 0;

        System.out.println("Введите число и нажмите <Enter>:");

        while (true) {
            int value = new Scanner(System.in).nextInt();

            if (value > 0) {
                sum = sum + value;
                System.out.println("Сумма: " + sum);
                System.out.println("Введите ещё одно число или 0 для сброса суммы:");
            }

            else if (value == 0) {
                sum = 0;
                System.out.println("Сумма сброшена. Введите новое число:");
            }

            else {
                System.out.println("Введено отрицательное цисло. Введите положительное-1 число:");
            }
        }
    }
}
