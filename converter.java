import java.util.*;

public class project {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 3) {
            System.out.println(
                    "************************************");
            System.out.println(" Choices---->\n1.Conversions\n2.Binary Operation. \n3.Exit \n");
            System.out.println("Enter your choice");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    conversion c = new conversion();

                    int choice1 = 0;
                    while (choice1 != 8) {
                        System.out.println(
                                "************************************");
                        System.out.println(
                                " choices---->\n1.Decimal to Binary. \n2.Decimal to Hexadecimal. \n3.Decimal to Octal. \n4.Binary to Decimal. \n5.Hexadecimal to Decimal. \n6.Octal to Decimal. \n7.Hexadecimal to Binary. \n8.Exit \n");

                        System.out.println("Enter the choice");
                        choice1 = sc.nextInt();

                        switch (choice1) {
                            case 1:
                                c.DtoB();
                                break;

                            case 2:
                                c.DtoH();
                                break;

                            case 3:
                                c.DtoO();
                                break;

                            case 4:
                                c.BtoD();
                                break;

                            case 5:
                                c.HtoD();
                                break;

                            case 6:
                                c.OtoD();
                                break;

                            case 7:
                                c.HtoB();
                                break;

                            case 8:
                                System.out.println("Exit");
                                break;

                            default:
                                System.out.println("Enter the correct choice!!!!!!");

                        }

                    }
                    break;

                case 2:
                    Binary_Operations b = new Binary_Operations();
                    int choice2 = 0;
                    while (choice2 != 8) {
                        System.out.println(
                                "************************************");
                        System.out.println(
                                "choices---->\n1.Addition. \n2.Substraction. \n3.Multiplication. \n4.Division. \n5.Excess3. \n6.Binary Coded Decimal Adder(BCD Adder). \n7.gray code \n8.Exit\n");

                        System.out.println("Enter the choice");
                        choice2 = sc.nextInt();

                        switch (choice2) {
                            case 1:
                                b.addition();
                                break;

                            case 2:
                                b.subtraction();
                                break;

                            case 3:
                                b.multiplication();
                                break;

                            case 4:
                                b.division();
                                break;

                            case 5:
                                b.excess3();
                                break;

                            case 6:
                                b.BCD();
                                break;

                            case 7:
                                b.toGray();
                                break;

                            case 8:
                                System.out.println("Exit");
                                break;

                            default:
                                System.out.println("Enter the correct choice!!!!!!");

                        }

                    }
                    break;

                case 3:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Enter correct choice!!!!!!!");

            }

        }

    }
}

class conversion {
    Scanner sc = new Scanner(System.in);

    public void DtoB() {
        System.out.println("enter Decimal number:");
        int a = sc.nextInt();
        String b = Integer.toBinaryString(a);
        System.out.println("Binary is-->" + b);
    }

    public void DtoH() {
        System.out.println("enter Decimal number:");
        int a = sc.nextInt();
        String str = Integer.toHexString(a);
        System.out.println("Hexadecimal is-->" + str);
    }

    public void DtoO() {
        System.out.println("enter Decimal number:");
        int a = sc.nextInt();
        String str1 = Integer.toOctalString(a);
        System.out.println("Octal is-->" + str1);
    }

    public void BtoD() {
        System.out.println("enter Binary number:");
        String a = sc.nextLine();
        int b = Integer.parseInt(a, 2);
        System.out.println("Decimal is-->" + b);
    }

    public void HtoD() {
        System.out.println("enter Hexadecimal number:");
        String a = sc.nextLine();
        int b = Integer.parseInt(a, 16);
        System.out.println("Decimal is-->" + b);
    }

    public void OtoD() {
        System.out.println("enter Octal number:");
        String a = sc.nextLine();
        int b = Integer.parseInt(a, 8);
        System.out.println("Decimal is-->" + b);
    }

    public void HtoB() {
        System.out.println("enter Hexadecimal number:");
        String a = sc.nextLine();
        int b = (Integer.parseInt(a, 16));
        String c = Integer.toBinaryString(b);
        System.out.println("Binary is-->" + c);
    }
}

class Binary_Operations {
    int sum;
    int number0;
    int number1;
    String Dsum;

    Scanner sc = new Scanner(System.in);

    public void INPUTS() {
        System.out.println("Enter first binary number:");
        String input0 = sc.nextLine();
        System.out.println("Enter second binary number:");
        String input1 = sc.nextLine();

        number0 = Integer.parseInt(input0, 2);
        number1 = Integer.parseInt(input1, 2);

    }

    public void addition() {
        INPUTS();
        sum = number0 + number1;
        Dsum = Integer.toBinaryString(sum);
        System.out.println("binary addition is-->" + Dsum);
    }

    public void subtraction() {
        INPUTS();
        int diff = number0 - number1;
        System.out.println("Your required subtraction is:" + Integer.toBinaryString(diff));
    }

    public void multiplication() {
        INPUTS();
        int mult = number0 * number1;
        System.out.println("Your required multiplication is:" + Integer.toBinaryString(mult));
    }

    public void division() {
        INPUTS();
        int div = number0 / number1;
        System.out.println("Your required division is:" + Integer.toBinaryString(div));
    }

    public void excess3() {
        System.out.println("Enter binary number:");
        String binary = sc.nextLine();
        int decimal = Integer.parseInt(binary, 2);
        int Excess3 = decimal + 3;
        System.out.println("Your EXCESS 3 is:" + Integer.toBinaryString(Excess3));

    }

    public void BCD() {
        int sum;
        int number0;
        int number1;
        String Dsum;

        System.out.println("Enter 4-bit first BCD number:");
        String input0 = sc.nextLine();
        System.out.println("Enter4-bit second BCD number:");
        String input1 = sc.nextLine();

        number0 = Integer.parseInt(input0, 2);
        number1 = Integer.parseInt(input1, 2);

        sum = number0 + number1;

        Dsum = Integer.toBinaryString(sum);

        if (sum <= 9) {
            System.out.println("BCD addition is: " + Dsum);

        } else if (sum > 9 && sum <= 15) {
            sum += 6;
            Dsum = Integer.toBinaryString(sum);
            System.out.println("BCD Addition is" + Dsum);
        } else if (sum > 15 && sum <= 19) {
            if (sum == 16) {
                System.out.println("BCD addition is: 10110 ");
            } else if (sum == 17) {
                System.out.println("BCD addition is: 10111 ");
            } else if (sum == 18) {
                System.out.println("BCD addition is: 11000 ");
            } else if (sum == 19) {
                System.out.println("BCD addition is: 11001 ");
            } else {
                System.out.println("sum exceeds 19");
            }
        }
    }

    public void toGray() {
        // a String variable to store the obtained gray
        // string.
        // the MSB of the gray code is the same as
        // the MSB of the binary string, i.e., binary[0]
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number:");
        String binary = sc.nextLine();
        String gray = new String();

        gray += binary.charAt(0);

        for (int i = 1; i < binary.length(); i++) {
            // perform XOR on the previous bit and the
            // current bit of the binary string
            gray += (Integer.parseInt(String.valueOf(
                    binary.charAt(i - 1)))
                    ^ Integer.parseInt(
                            String.valueOf(binary.charAt(i))));
        }

        System.out.println("The gray code of " + binary
                + " is : " + gray);
    }
}
