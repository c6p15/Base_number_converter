import java.util.Scanner;

public class runner {
    public static void main(String[] args) {
        
        System.out.println("------ Select the base number to convert -----");
        System.out.println("1 : 10 -> 2 (Decimal to Binary)");
        System.out.println("2 : 10 -> 16 (Decimal to Hexadecimal)");
        System.out.println("3 : 2 -> 10 (Binary to Decimal)");
        System.out.println("4 : 2 -> 16 (Binary to Hexadecimal)");
        System.out.println("5 : 16 -> 2 (Hexadecimal to Binary)");
        System.out.println("6 : 16 -> 10 (Hexadecimal to Decimal)");

        int select ;
        System.out.print(": ");
        Scanner kbd = new Scanner(System.in);
        select = kbd.nextInt();
        DecimalConverter decimalConverter = new DecimalConverter();
        BinaryConverter binaryConverter = new BinaryConverter();
        HexadecimalConverter hexadecimalConverter = new HexadecimalConverter();
        
        
        switch (select) {
            case 1:
                // 10 -> 2
                System.out.println("10 -> 2");
                System.out.print("Enter the decimal: ");
                int decimalNumber1 = kbd.nextInt();

                String TentoTwoResult = decimalConverter.DecimalToBinary(decimalNumber1);

                System.out.println("binary: " + TentoTwoResult);
                break;

            case 2:
                // 10 -> 16
                System.out.println("10 -> 16");
                System.out.print("Enter the decimal: ");
                int decimalNumber2 = kbd.nextInt();
                
                String TentoSixteenResult = decimalConverter.DecimalToHexadecimal(decimalNumber2);

                System.out.println("hexadecimal: " + TentoSixteenResult);
                break;

            case 3:
                // 2 -> 10
                kbd.nextLine();
                System.out.println("2 -> 10");
                System.out.print("Enter the binary: ");
                String binaryNumber1 = kbd.nextLine();

                int TwotoTenResult = binaryConverter.BinaryToDecimal(binaryNumber1);

                System.out.println("decimal: " + TwotoTenResult);
                break;

            case 4:
                // 2 -> 16
                kbd.nextLine();
                System.out.println("2 -> 16");
                System.out.print("Enter the binary: ");
                String binaryNumber2 = kbd.nextLine();

                String TwotoSixteenResult = binaryConverter.BinaryToHexadecimal(binaryNumber2);

                System.out.println("hexadecimal: " + TwotoSixteenResult);
                break;

            case 5:
                // 16 -> 2
                kbd.nextLine();
                System.out.println("16 -> 2");
                System.out.print("Enter the hexadecimal: ");
                String hexadecimalNumber1 = kbd.nextLine();

                String SixteentoTwoResult = hexadecimalConverter.HexadecimalToBinary(hexadecimalNumber1);

                System.out.println("binary: " + SixteentoTwoResult);
                break;

            case 6: 
                // 16 -> 10
                kbd.nextLine();
                System.out.println("16 -> 10");
                System.out.print("Enter the hexadecimal: ");
                String hexadecimalNumber2 = kbd.nextLine();

                int SixteentoTenResult = hexadecimalConverter.HexadecimalToDecimal(hexadecimalNumber2);

                System.out.println("decimal: " + SixteentoTenResult);
                break;
                
            default:
                System.out.println("Input Error...");
                break;
                
        }

        System.out.println("----- End Program -----");
        kbd.close();
    }
}
