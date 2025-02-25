import java.util.Scanner;
class SumByte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print 1 byte number: ");
        byte num1 = scanner.nextByte();
        System.out.print("Print 2 byte number: ");
        byte num2 = scanner.nextByte();
        int result = num1 + num2;
        if (result < 127 && result > -128) {
            System.out.println("Sum 2 byte numbers: " + result);
            }
        else {
            System.out.println("Error");
            }
        }
    }
