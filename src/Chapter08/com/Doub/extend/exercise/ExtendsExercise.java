package Chapter08.com.Doub.extend.exercise;

class Computer{
    private String CPU;
    private String Memory;
    private String HardDrive;


    public String getDetails() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", Memory='" + Memory + '\'' +
                ", HardDrive='" + HardDrive + '\'' +
                '}';
    }

    public Computer(String CPU, String memory, String hardDrive) {
        this.CPU = CPU;
        this.Memory = memory;
        this.HardDrive = hardDrive;
    }

    public Computer() {
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getMemory() {
        return Memory;
    }

    public void setMemory(String memory) {
        Memory = memory;
    }

    public String getHardDrive() {
        return HardDrive;
    }

    public void setHardDrive(String hardDrive) {
        HardDrive = hardDrive;
    }
}
class PC extends Computer{
    private String brand;

    public PC(String CPU, String memory, String hardDrive, String brand) {
        super(CPU, memory, hardDrive);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void showPC(){
        System.out.println(getDetails() + "brand: " + brand);
    }
}
class NotePad extends Computer{
    private String color;

    public NotePad(String CPU, String memory, String hardDrive, String color) {
        super(CPU, memory, hardDrive);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void showNote(){
        System.out.println(getDetails() + "color: " + color);
    }
}


public class ExtendsExercise {
    public static void main(String[] args) {
        PC pc = new PC("i9-19990","固态","硬盘","神舟");
        NotePad note = new NotePad("i9-19990","固态","硬盘","red");
        pc.showPC();
        note.showNote();
    }
}