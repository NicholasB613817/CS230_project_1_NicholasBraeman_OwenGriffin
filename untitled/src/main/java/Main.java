import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter in hex digits or hexadecimals on the line below to see their binary code!");
        Scanner scan = new Scanner(System.in);
        Assembler.assembler(scan.nextLine());
    }
}
