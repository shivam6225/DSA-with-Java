package shivam.Switch;

import java.util.Scanner;

public class NestedSwitch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int empId = input.nextInt();
        String department = input.next();

        switch (empId) {
            case 1 -> System.out.println("Shivam Pahariya");
            case 2 -> {
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "HR" -> System.out.println("HR Department");
                    default -> System.out.println("Please enter a valid department name");
                }
            }
        }
    }
}
