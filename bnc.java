
// Decimal Converter
class DecimalConverter {
    // 10 -> 2
    public String DecimalToBinary(int decimalNumber) {
        String binaryNumber ="";

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binaryNumber = remainder + binaryNumber;  
            decimalNumber /= 2;
        }
        return binaryNumber;
    }

    // 10 -> 16
    public String DecimalToHexadecimal(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0";
        }

        String hexadecimalNumber ="";

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 16;
            hexadecimalNumber = getHexDigit(remainder) + hexadecimalNumber;
            decimalNumber /= 16;
        }

        return hexadecimalNumber;
    }
    
    private char getHexDigit(int value) {
        if (value >= 0 && value <= 9) {
            return (char) ('0' + value);
        } else {
            return (char) ('A' + (value - 10));
        }
    }
}

// Binary Converter
class BinaryConverter {
    // 2 -> 10
    public int BinaryToDecimal(String binaryNumber) {
        int decimalNumber = 0;
        int power = 0;

        for (int i = binaryNumber.length() - 1; i >= 0; i--) {
            char digit = binaryNumber.charAt(i);

            if (digit == '1') {
                decimalNumber += Math.pow(2,power);
                
            }

            power++;
        }

        return decimalNumber;
    }

    // 2 -> 16
    public String BinaryToHexadecimal(String binaryNumber){
        while (binaryNumber.length() % 4 != 0) {
            binaryNumber = "0" + binaryNumber;
        }
        
        String hexadecimalNumber = "";

        for (int i = 0; i < binaryNumber.length(); i += 4) {
            String nibble = binaryNumber.substring(i, i+4);
            int decimalValue = Integer.parseInt(nibble,2);
            hexadecimalNumber += getHexDigit(decimalValue);
        }

        return hexadecimalNumber;
    }

    private char getHexDigit(int value) {
        if (value >= 0 && value <= 9) {
            return (char) ('0' + value);
        } else {
            return (char) ('A' + (value - 10));
        }
    }
}

// Hexadecimal Converter
class HexadecimalConverter{
    // 16 -> 2
    public String HexadecimalToBinary(String hexadecimalNumber) {
        String binaryNumber = "";

        for (int i = 0; i < hexadecimalNumber.length(); i++) {
            char hexaDigit = hexadecimalNumber.charAt(i);
            int decimalValue = getDecimalValue(hexaDigit);
            String binaryDigit = padBinary(Integer.toBinaryString(decimalValue));
            
            binaryNumber += binaryDigit;
        }

        return binaryNumber;
    }

    // 16 -> 10
    public int HexadecimalToDecimal(String hexadecimalNumber){
        int decimalNumber = 0;

        for (int i= hexadecimalNumber.length() - 1; i >= 0; i--){
            char hexaDigit = hexadecimalNumber.charAt(i);

            int decimalValue = getDecimalValue(hexaDigit);
            decimalNumber += decimalValue * Math.pow(16, hexadecimalNumber.length() - 1 - i);
        }

        return decimalNumber;
    }
    
    private int getDecimalValue(char hexDigit) {
        if (hexDigit >= '0' && hexDigit <= '9') {
            return hexDigit - '0';
        } else if (hexDigit >= 'A' && hexDigit <= 'F') {
            return hexDigit - 'A' + 10;
        } else if (hexDigit >= 'a' && hexDigit <= 'f') {
            return hexDigit - 'a' + 10;
        } else {
            throw new IllegalArgumentException("Invalid hex digit: " + hexDigit);
        }
    }

    private String padBinary(String binaryDigit) {
        while (binaryDigit.length() < 4) {
            binaryDigit = "0" + binaryDigit;
        }
        return binaryDigit;
    }

}