import java.util.Scanner;

public class MenuCacLoaiHinh {
    public static void main(String[] args) {

        System.out.println("----- Menu Cac Loai Hinh Hoc -----");

        Scanner sc = new Scanner(System.in);
        int choice = 1;
        while (choice > 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle top-left");
            System.out.println("3. Print the square triangle bottom-left");
            System.out.println("4. Print the square triangle top-right");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Rectangle");
                    System.out.println("Enter Height: ");
                    int height = sc.nextInt();
                    System.out.println("Enter width :");
                    int width = sc.nextInt();
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Triangle top-left");
                    System.out.println("Enter height : ");
                    height = sc.nextInt();
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < height - i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Triangle bottom-left");
                    System.out.println("Enter height : ");
                    height = sc.nextInt();
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < i + 1; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Triangle top-right");
                    System.out.println("Enter height");
                    height = sc.nextInt();
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < height; j++) {
                            if (j >= i) {
                                System.out.print("* ");
                            } else
                                System.out.print("  ");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice");
            }
        }
    }
}
