package enum_;

/**
 * ClassName: EnumExercise02
 * Package: com.smh.enum_
 * Description:
 *声明 Week 枚举类，其中包含星期一至星期日的定义； MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
 * SATURDAY, SUNDAY;
 * 使用 values 返回所有的枚举数组, 并遍历 , 输出左图效果
 * @Author mh sun
 * @Create 2024/3/22 19:30
 * @Version 1.0
 */
public class EnumExercise02 {
    public static void main(String[] args) {
        Week weeks[] = Week.values();
        for(Week week:weeks){
            System.out.println(week);
        }
    }
}
enum Week{
    MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三"), THURSDAY("星期四"), FRIDAY("星期五"),
    SATURDAY("星期六"), SUNDAY("星期天");
    private String name;
    Week(){};
    Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Week{" +
                "name='" + name + '\'' +
                '}';
    }
}