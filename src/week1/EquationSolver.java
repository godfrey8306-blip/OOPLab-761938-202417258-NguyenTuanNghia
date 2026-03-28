import java.util.Scanner;

public class EquationSolver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- MENU GIẢI PHƯƠNG TRÌNH ---");
            System.out.println("1. Phương trình bậc nhất một ẩn (ax + b = 0)");
            System.out.println("2. Hệ phương trình bậc nhất hai ẩn");
            System.out.println("3. Phương trình bậc hai một ẩn (ax^2 + bx + c = 0)");
            System.out.println("0. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    solveLinearEquation(scanner);
                    break;
                case 2:
                    solveLinearSystem(scanner);
                    break;
                case 3:
                    solveQuadraticEquation(scanner);
                    break;
                case 0:
                    System.out.println("Tạm biệt!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 0);

        scanner.close();
    }

    // 1. Giải phương trình bậc nhất: ax + b = 0
    // Nếu a = 0, b = 0: Vô số nghiệm. Nếu a = 0, b != 0: Vô nghiệm.
    public static void solveLinearEquation(Scanner sc) {
        System.out.print("Nhập a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập b: ");
        double b = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiệm của phương trình là x = " + x);
        }
    }

    // 2. Giải hệ phương trình bậc nhất hai ẩn dùng định thức (Cramer)
    public static void solveLinearSystem(Scanner sc) {
        System.out.println("Nhập hệ: a11*x1 + a12*x2 = b1");
        System.out.println("        a21*x1 + a22*x2 = b2");
        System.out.print("a11: "); double a11 = sc.nextDouble();
        System.out.print("a12: "); double a12 = sc.nextDouble();
        System.out.print("b1: ");  double b1 = sc.nextDouble();
        System.out.print("a21: "); double a21 = sc.nextDouble();
        System.out.print("a22: "); double a22 = sc.nextDouble();
        System.out.print("b2: ");  double b2 = sc.nextDouble();

        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D != 0) {
            System.out.println("Hệ có nghiệm duy nhất: x1 = " + (D1 / D) + ", x2 = " + (D2 / D));
        } else {
            if (D1 == 0 && D2 == 0) {
                System.out.println("Hệ có vô số nghiệm.");
            } else {
                System.out.println("Hệ vô nghiệm.");
            }
        }
    }

    // 3. Giải phương trình bậc hai: ax^2 + bx + c = 0
    public static void solveQuadraticEquation(Scanner sc) {
        System.out.print("Nhập a: "); double a = sc.nextDouble();
        System.out.print("Nhập b: "); double b = sc.nextDouble();
        System.out.print("Nhập c: "); double c = sc.nextDouble();

        if (a == 0) {
            // Trở về bài toán bậc nhất
            if (b == 0) {
                System.out.println(c == 0 ? "Vô số nghiệm." : "Vô nghiệm.");
            } else {
                System.out.println("Nghiệm x = " + (-c / b));
            }
            return;
        }

        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm (thực).");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có 2 nghiệm phân biệt: x1 = " + x1 + ", x2 = " + x2);
        }
    }
}