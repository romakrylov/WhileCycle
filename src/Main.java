import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* ������� ���
        int secretPinCode = 7567;
        int pinCode = -1;

        Scanner scanner = new Scanner(System.in);
        while (pinCode != secretPinCode) {
            if (pinCode == -1) {
                System.out.println("������� ������:");
            } else {
                System.out.println("������ ����� �������. ������� ������ ������:");
            }
            pinCode = scanner.nextInt();
        }

        System.out.println("������ ����� �����!!!");
    }
}

         */

/*����������� ����
        while (true) {
            System.out.println("����� ����� ����������� ���������");
        }
    }
}

 */
        /*�������� �����, ���� �� ����� ������� ����� 0
        int sum = 0;

        int value = -1;
        while (value != 0) {
            value = new Scanner(System.in).nextInt();
            sum = sum + value;
        }

        System.out.println("����� ��������� ����� " + sum);
    }
}


         */

//������� 1. ��� � ������ while

        int sum = 0;

        System.out.println("������� ����� � ������� <Enter>:");

        while (true) {
            int value = new Scanner(System.in).nextInt();

            if (value > 0) {
                sum = sum + value;
                System.out.println("�����: " + sum);
                System.out.println("������� ��� ���� ����� ��� 0 ��� ������ �����:");
            }

            else if (value == 0) {
                sum = 0;
                System.out.println("����� ��������. ������� ����� �����:");
            }

            else {
                System.out.println("������� ������������� �����. ������� �������������-1 �����:");
            }
        }
    }
}
