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
        }
        return null;
    }
}