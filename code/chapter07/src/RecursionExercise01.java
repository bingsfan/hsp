/**
 * ClassName: RecursionExercise01
 * Package: PACKAGE_NAME
 * Description:
 *猴子吃桃子问题：有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！
 * 		以后每天猴子都吃其中的一半，然后再多吃一个。当到第10天时，
 * 		想再吃时（即还没吃），发现只有1个桃子了。问题：最初共多少个桃子？
 * @Author mh sun
 * @Create 2024/3/7 10:30
 * @Version 1.0
 */
public class RecursionExercise01 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.peach(1));
    }
}
class Solution{
    public int peach(int day){
        if(day==10){
            return 1;
        }else if(day>=1&&day<=9){
            return 2*(peach(day+1)+1);
        }else{
            return -1;
        }
    }
}
