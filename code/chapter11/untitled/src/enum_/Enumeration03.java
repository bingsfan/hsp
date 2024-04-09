package enum_;

/**
 * ClassName: Enumeration03
 * Package: com.smh.enum_
 * Description:
 *
 * @Author mh sun
 * @Create 2024/3/22 19:00
 * @Version 1.0
 */
public class Enumeration03 {
    public static void main(String[] args) {
        System.out.println(Season.SUMMER);
        System.out.println(Season.AUTUMN);
        Season season = Season.WINTER;
        System.out.println(season.ordinal());
    }
}
enum Season{

    SPRING("春天","温暖"),
    SUMMER("夏天","炎热"),
    AUTUMN("秋天","凉爽"),
    WINTER("冬天","寒冷");
    private String name;
    private String desc;
    private Season(){

    }
    private Season(String name,String desc){
        this.name = name;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}