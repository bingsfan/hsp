/**
 * ClassName: Yanghui
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author mh sun
 * @Create 2024/3/6 15:49
 * @Version 1.0
 */
public class Yanghui {
    public static void main(String[] args) {
        int yanghui[][] = new int[12][];
        for(int i=0;i<yanghui.length;i++){
            yanghui[i]=new int[i+1];
            for(int j=0;j<yanghui[i].length;j++){
                if(j==0||j==yanghui[i].length-1){
                    yanghui[i][j]=1;
                }else{
                    yanghui[i][j]=yanghui[i-1][j]+yanghui[i-1][j-1];
                }
            }
        }
        for (int i=0;i<yanghui.length;i++){
            for (int j=0;j<yanghui[i].length;j++){
                System.out.print(yanghui[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
