/**
 * ClassName: PC
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author mh sun
 * @Create 2024/3/11 20:23
 * @Version 1.0
 */
public class PC extends Computer{
    private String brand;

    public PC(String CPU, int memory, int disk, String brand) {
        super(CPU, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void printInfo(){
        System.out.println("PC信息=");

        System.out.println(getDetails()+" brand= "+brand);
    }
}
