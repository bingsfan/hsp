/**
 * ClassName: Computer
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author mh sun
 * @Create 2024/3/11 20:23
 * @Version 1.0
 */
public class Computer {
    private String CPU;
    private int memory;
    private int disk;

    public Computer(String CPU, int memory, int disk) {
        this.CPU = CPU;
        this.memory = memory;
        this.disk = disk;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }
    public String getDetails(){
        return "cpu="+CPU+" memory="+memory+" disk="+disk;
    }
}
