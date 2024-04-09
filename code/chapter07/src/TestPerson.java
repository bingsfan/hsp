/**
 * ClassName: TestPerson
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author mh sun
 * @Create 2024/3/7 13:15
 * @Version 1.0
 */
public class TestPerson {
}
class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public boolean compareTo(Person p){
        return (this.name.equals(p.name)&&this.age==p.age);
    }
}