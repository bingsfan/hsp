/**
 * ClassName: HouseService
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author mh sun
 * @Create 2024/3/12 22:52
 * @Version 1.0
 */
public class HouseService {
    private House[] houses;
    private int houseNums = 1;//记录当前有多少个房屋
    private int idCounter = 1;
    public HouseService(int size){
        houses = new House[size];
        houses[0]= new House(1,"jack","112","海淀区",2000,"未出租");
    }
    public House[] list(){
        return houses;
    }
    public boolean add(House newHouse){
//        判断是否还能添加？先不考虑数组扩容
        if(houseNums==houses.length){
            System.out.println("数组已满，不能添加");
            return false;
        }
        houses[houseNums++]=newHouse;
        newHouse.setId(++idCounter);
        return true;
    }
    public boolean del(int delId){
        int index = -1;
        for (int i =0;i<houseNums;i++){
            if(delId==houses[i].getId()){
                index=i;
            }
        }
        if(index==-1){//说明delId在数组中不存在
            return false;
        }
        for (int i=index;i<houseNums-1;i++){
            houses[i]=houses[i+1];
        }
        houses[houseNums-1]=null;
        houseNums--;
        return true;
    }
    public House find(int findId){
        for(int i=0;i<houseNums;i++){
            if(findId==houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }
}
