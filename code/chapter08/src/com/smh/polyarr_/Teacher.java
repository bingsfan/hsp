package com.smh.polyarr_;

/**
 * ClassName: Teacher
 * Package: com.smh.polyarr_
 * Description:
 *
 * @Author mh sun
 * @Create 2024/3/12 11:36
 * @Version 1.0
 */
public class Teacher extends Person{
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String say() {
        return "老师 " + super.say() + " salary=" + salary;
    }
}
