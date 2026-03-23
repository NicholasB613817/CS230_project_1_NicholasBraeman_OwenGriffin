public class Assembler {
    public static String assembler(String input) {
        switch (input) {
            case "0":
                System.out.println("The binary code is 0000!");
                System.out.println("D0 00 00 F1 FC 16");
                break;
            case "1":
                System.out.println("The binary code is 0001!");
                System.out.println("D0 00 01 F1 FC 16");
                break;
            case "2":
                System.out.println("The binary code is 0010!");
                System.out.println("D0 00 10 F1 FC 16");
                break;
            case "3":
                System.out.println("The binary code is 0011!");
                System.out.println("D0 00 11 F1 FC 16");
                break;
            case "4":
                System.out.println("The binary code is 0100!");
                System.out.println("D0 01 00 F1 FC 16");
                break;
            case "5":
                System.out.println("The binary code is 0101!");
                System.out.println("D0 01 01 F1 FC 16");
                break;
            case "6":
                System.out.println("The binary code is 0110!");
                System.out.println("D0 01 10 F1 FC 16");
                break;
            case "7":
                System.out.println("The binary code is 0111!");
                System.out.println("D0 01 11 F1 FC 16");
                break;
            case "8":
                System.out.println("The binary code is 1000!");
                System.out.println("D0 10 00 F1 FC 16");
                break;
            case "9":
                System.out.println("The binary code is 1001!");
                System.out.println("D0 10 01 F1 FC 16");
                break;
            case "A":
                System.out.println("The binary code is 1010!");
                System.out.println("D0 10 10 F1 FC 16");
                break;
            case "B":
                System.out.println("The binary code is 1011!");
                System.out.println("D0 10 11 F1 FC 16");
                break;
            case "C":
                System.out.println("The binary code is 1100!");
                System.out.println("D0 11 00 F1 FC 16");
                break;
            case "D":
                System.out.println("The binary code is 1101!");
                System.out.println("D0 11 01 F1 FC 16");
                break;
            case "E":
                System.out.println("The binary code is 1110!");
                System.out.println("D0 11 10 F1 FC 16");
                break;
            case "F":
                System.out.println("The binary code is 1111!");
                System.out.println("D0 11 11 F1 FC 16");
                break;
        }
        return null;
    }
}