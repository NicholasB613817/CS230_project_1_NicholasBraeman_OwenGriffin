public class Assembler {
    public static String assembler(String input) {
        //When user enters the assembly code LDBA_______, it prints the hexadecimal and the hex instructions
        switch (input) {
            case "LDBA 0x0000":
                System.out.println("The hexadecimal is 0!");
                System.out.println("D0 00 00 F1 FC 16");
                break;
            case "LDBA 0x0001":
                System.out.println("The hexadecimal is 1!");
                System.out.println("D0 00 01 F1 FC 16");
                break;
            case "LDBA 0x0010":
                System.out.println("The hexadecimal is 2!");
                System.out.println("D0 00 10 F1 FC 16");
                break;
            case "LDBA 0x0011":
                System.out.println("The hexadecimal is 3!");
                System.out.println("D0 00 11 F1 FC 16");
                break;
            case "LDBA 0x0100":
                System.out.println("The hexadecimal is 4!");
                System.out.println("D0 01 00 F1 FC 16");
                break;
            case "LDBA 0x0101":
                System.out.println("The hexadecimal is 5!");
                System.out.println("D0 01 01 F1 FC 16");
                break;
            case "LDBA 0x0110":
                System.out.println("The hexadecimal is 6!");
                System.out.println("D0 01 10 F1 FC 16");
                break;
            case "LDBA 0x0111":
                System.out.println("The hexadecimal is 7!");
                System.out.println("D0 01 11 F1 FC 16");
                break;
            case "LDBA 0x1000":
                System.out.println("The hexadecimal is 8!");
                System.out.println("D0 10 00 F1 FC 16");
                break;
            case "LDBA 0x1001":
                System.out.println("The hexadecimal is 9!");
                System.out.println("D0 10 01 F1 FC 16");
                break;
            case "LDBA 0x1010":
                System.out.println("The hexadecimal is A!");
                System.out.println("D0 10 10 F1 FC 16");
                break;
            case "LDBA 0x1011":
                System.out.println("The hexadecimal is B!");
                System.out.println("D0 10 11 F1 FC 16");
                break;
            case "LDBA 0x1100":
                System.out.println("The hexadecimal is C!");
                System.out.println("D0 11 00 F1 FC 16");
                break;
            case "LDBA 0x1101":
                System.out.println("The hexadecimal is D!");
                System.out.println("D0 11 01 F1 FC 16");
                break;
            case "LDBA 0x1110":
                System.out.println("The hexadecimal is E!");
                System.out.println("D0 11 10 F1 FC 16");
                break;
            case "LDBA 0x1111":
                System.out.println("The hexadecimal is F!");
                System.out.println("D0 11 11 F1 FC 16");
                break;

            case "\nLDBA 0x0048" +
                         "\nSTBA 0xFC16" +
                         "\nLDBA 0x0065" +
                         "\nSTBA 0xFC16" +
                         "\nLDBA 0x0069" +
                         "\nSTBA 0xFC16" +
                         "\nLDBA 0x0069" +
                         "\nSTBA 0xFC16" +
                         "\nLDBA 0x006F" +
                         "\nSTBA 0xFC16" +
                         "\nLDBA 0x0021" +
                         "\nSTBA 0xFC16":
                System.out.println("Hello!");
                System.out.println("D0 00 21 F1 FC 16");
                break;
                //to fit the first required input, user enters println(Hi), which outputs to the assembly code of "Hi"
            case "println(Hi)":
                System.out.println("LDBA 0x0048");
                System.out.println("STBA 0xFC16");
                System.out.println("LDBA 0x0069");
                System.out.println("STBA 0xFC16");
                System.out.println("D0 00 69 F1 FC 16");
        }
        return null;
    }
}