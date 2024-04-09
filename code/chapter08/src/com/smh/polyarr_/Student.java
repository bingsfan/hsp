package com.smh.polyarr_;

/**
 * ClassName: Student
 * Package: com.smh.polyarr_
 * Description:
 *
 * @Author mh sun
 * @Create 2024/3/12 11:32
 * @Version 1.0
 */
public class Student extends Person{
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String say() {
        return "学生 "+super.say()+ " score="+score;
    }
}
