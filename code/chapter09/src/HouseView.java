import utils.Utility;

import javax.sound.sampled.ReverbType;

/**
 * ClassName: HouseView
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author mh sun
 * @Create 2024/3/12 22:52
 * @Version 1.0
 */
public class HouseView {
    private boolean loop = true;
    private char key = ' ';
    private HouseService houseService = new HouseService(10);
    public void mainMenu(){
        do {
            System.out.println("===========房屋出租系统菜单==========");
            System.out.println("\t\t\t1 新增房源");
            System.out.println("\t\t\t2 查找房屋");
            System.out.println("\t\t\t3 删除房屋信息");
            System.out.println("\t\t\t4 修改房屋信息");
            System.out.println("\t\t\t5 显示房屋信息");
            System.out.println("\t\t\t6 退出");
            System.out.print("请输入你的选择(1-6): ");
            key = Utility.readChar();
            switch (key){
                case '1':
                    addHouse();
                    break;
                case '2':

                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    updateHouse();
                    break;
                case '5':
                    listHouse();
                    break;
                case '6':
                    exit();
                    break;
            }
        }while (loop);
    }
    public void exit(){
        char choice = Utility.readConfirmSelection();
        if(choice=='Y'){
            loop = false;
            System.out.println("退出");
        }
    }
    public void listHouse(){
        System.out.println("==========房屋列表==========");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House[] houses = houseService.list();
        for (int i=0;i<houses.length;i++){
            if(houses[i]==null){
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("==========房屋列表显示完毕==========");
    }
    public void addHouse(){
        System.out.println("==========添加房屋==========");
        System.out.print("房主姓名");
        String name = Utility.readString(8);
        System.out.print("电话");
        String phone = Utility.readString(12);
        System.out.print("地址");
        String address = Utility.readString(16);
        System.out.print("月租");
        int rent = Utility.readInt();
        System.out.print("状态");
        String status = Utility.readString(8);
//        创建一个house对象，id是系统分配的，用户不能输入
        House newHouse = new House(0,name,phone,address,rent,status);
        if(houseService.add(newHouse)){
            System.out.println("==========添加房屋成功==========");
        }else{
            System.out.println("==========添加房屋失败==========");
        }
    }
    public void delHouse(){
//        接受输入的id，调用del方法
        System.out.println("==========删除房屋==========");
        System.out.print("==========请输入待删除房屋的编号(-1退出)==========");
        int delId = Utility.readInt();
        if(delId==-1){
            System.out.println("==========放弃删除房屋信息==========");
            return;
        }
        System.out.println("==========请确定是否删除(Y/N)==========");

        char choice = Utility.readConfirmSelection();
        if(choice=='Y'){
            if(houseService.del(delId)){
                System.out.println("==========删除房屋信息成功==========");
            }else {
                System.out.println("==========房屋编号不存在，删除失败==========");
            }
        }else{
            System.out.println("==========放弃删除房屋信息==========");
        }
    }
    public void findHouse(){
        System.out.println("==========查找的房屋信息==========");
        System.out.print("==========请输入要查找的id==========");
        int findId = Utility.readInt();
        if(houseService.find(findId)!=null){
            System.out.println(houseService.find(findId));
        }else{
            System.out.println("==========查找的房屋信息不存在==========");
        }
    }
    public void updateHouse(){
        System.out.println("==========修改房屋信息==========");
        System.out.println("==========选择要修改的房屋编号(-1退出)==========");
        listHouse();
        int updateId = Utility.readInt();
        if(updateId==-1){
            System.out.println("==========放弃修改房屋信息==========");
            return;
        }
        House house = houseService.find(updateId);
        if(house==null){
            System.out.println("==========修改的房屋信息编号不存在==========");
        }
        System.out.print("姓名("+house.getName()+"):");
        String name = Utility.readString(8,"");//如果直接回车表示不修改信息
        if (!"".equals(name)){
            house.setName(name);
        }
        System.out.print("电话("+house.getPhone()+"):");
        String phone = Utility.readString(8,"");
        if (!"".equals(phone)){
            house.setPhone(phone);
        }
        System.out.print("地址("+house.getAddress()+"):");
        String address = Utility.readString(8,"");
        if (!"".equals(address)){
            house.setAddress(address);
        }
        System.out.print("租金("+house.getRent()+"):");
        int rent = Utility.readInt(-1);
        if (rent!=-1){
            house.setRent(rent);
        }
        System.out.print("状态("+house.getStatus()+"):");
        String status = Utility.readString(8,"");
        if (!"".equals(status)){
            house.setStatus(status);
        }
        System.out.println("修改成功");
    }
}
