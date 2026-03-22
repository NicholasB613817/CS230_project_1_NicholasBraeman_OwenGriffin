import java.util.Scanner;
public class Assembler_and_Compiler {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    public static void Assembler() {
        Scanner user_Input = new Scanner(System.in);
        user_Input.nextLine();
        //if/then statements for 0 - F binary values
        if (user_Input.nextInt() == 0) {
            System.out.println("0000");
        } else if (user_Input.nextInt() == 1) {
            System.out.println("0001");
        }else if (user_Input.nextInt() == 2) {
            System.out.println("0010");
        }else if (user_Input.nextInt() == 3) {
            System.out.println("0011");
        }else if (user_Input.nextInt() == 4) {
            System.out.println("0100");
        }else if (user_Input.nextInt() == 5) {
            System.out.println("0101");
        }else if (user_Input.nextInt() == 6) {
            System.out.println("0110");
        }else if (user_Input.nextInt() == 7) {
            System.out.println("0111");
        }else if (user_Input.nextInt() == 8) {
            System.out.println("1000");
        }else if (user_Input.nextInt() == 9) {
            System.out.println("1001");
        }else if (user_Input.nextLine() == "A") {
            System.out.println("1010");
        }else if (user_Input.nextLine() == "B") {
            System.out.println("1011");
        }else if (user_Input.nextLine() == "C") {
            System.out.println("1100");
        }else if (user_Input.nextLine() == "D") {
            System.out.println("1101");
        }else if (user_Input.nextLine() == "E") {
            System.out.println("1110");
        }else if (user_Input.nextLine() == "F") {
            System.out.println("1111");
        }
        //if/then statements for A - Z hexadecimal values
        if (user_Input.nextLine().equals("A")) {
            System.out.println(6 + 5);
        }
    }
    public static void compiler() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x == 9) {
            System.out.println("True");
        }else {
            System.out.println("False");
        }
        /* next statement */
    }
}









        /*Scanner user_Input = new Scanner(System.in);
        user_Input.nextLine();
        if (0){
            System.out.println(0000);
        }else if (Boolean.parseBoolean("1")) {
            System.out.println(0001);
        }else if (Boolean.parseBoolean("2")) {
            System.out.println(0010);
        }else if (Boolean.parseBoolean("3")) {
            System.out.println(0011);
        }else if (Boolean.parseBoolean("4")) {
            System.out.println(0100);
        }else if (Boolean.parseBoolean("5")) {
            System.out.println(0101);
        }else if (Boolean.parseBoolean("6")) {
            System.out.println(0110);
        }else if (Boolean.parseBoolean("7")) {
            System.out.println(0111);
        }else if (Boolean.parseBoolean("8")) {
            System.out.println(1000);
        }else if (Boolean.parseBoolean("9")) {
            System.out.println(1001);
        }else if (Boolean.parseBoolean("A")) {
            System.out.println(1010);
        }else if (Boolean.parseBoolean("B")) {
            System.out.println(1011);
        }else if (Boolean.parseBoolean("C")) {
            System.out.println(1100);
        }else if (Boolean.parseBoolean("D")) {
            System.out.println(1101);
        }else if (Boolean.parseBoolean("E")) {
            System.out.println(1110);
        }else if (Boolean.parseBoolean("F")) {
            System.out.println(1111);
        }

        if*/








/*public static void hex_Instructions(String D00048, String F1FC16, String D00060, String Zero) {

        D00048 = " " + "\n D0 00 48"; //Load ' ' into accumulator
        F1FC16 = "1111 0001 1111 1100 0001 0110 \n F1 FC 16"; //Store byte from accumulator to output device
        D00060 = "1101 0000 0000 0000 0110 1001 \n D0 00 60"; //Load i into the accumulator
        Zero = "00"+"\n0000 0000"; //Stop
    }
    public static void assembler(String D00048, String F1FC16, String D00060, String Zero) {
        Scanner scan = new Scanner(System.in); //creating scanner
        D00048 = scan.nextLine();//gathering user input to load into the accumulator
    }
    public static void compiler(String D00048, String F1FC16, String D00060, String Zero) {
        System.out.println("Binary Instructions" + "\n" + "Hex Instructions");
        System.out.println(D00048 + F1FC16 + D00060 + Zero);
    }
     */