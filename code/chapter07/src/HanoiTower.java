/**
 * ClassName: HanoiTower
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author mh sun
 * @Create 2024/3/7 12:30
 * @Version 1.0
 */
public class HanoiTower {
    public static void main(String[] args) {
        Tower tower = new Tower();
        tower.move(4,'a','b','c');
    }
}
class Tower{
    public void move(int num,char a,char b, char c){
        if(num==1){
            System.out.println(a+"->"+c);
        }else{
            move(num-1,a,c,b);
            System.out.println(a+"->"+c);
            move(num-1,b,a,c);
        }
    }
}
