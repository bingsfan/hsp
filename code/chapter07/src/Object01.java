/**
 * ClassName: Object01
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author mh sun
 * @Create 2024/3/7 9:42
 * @Version 1.0
 */
public class Object01 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        cat1.name = "小白";
        cat1.age = 3;
        cat1.color = "白色";
        cat2.name = "小花";
        cat2.age = 100;
        cat2.color = "花色";

    }
}
class Cat{
    String name;
    int age;
    String color;
}