import java.util.Scanner;

/**
 * ClassName: Input
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author mh sun
 * @Create 2024/3/6 12:01
 * @Version 1.0
 */
public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入名字");
        String name = scanner.next();
        System.out.println(name);
        System.out.println("输入年龄");
        int age = scanner.nextInt();
        System.out.println(age);
    }
}
