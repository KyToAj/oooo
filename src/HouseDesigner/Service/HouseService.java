package HouseDesigner.Service;

import HouseDesigner.Domain.House;
import HouseDesigner.Utils.Utility;

/**
 * 1. 响应houseView的调用
 * 2. 完成对房屋信息的各种操作
 */
public class HouseService {
    private House[] houses;
    private int houseNumbers = 0;
    private int idAdd = 1;

    public House[] getHouses() {
        return houses;
    }

    public void setHouses(House[] houses) {
        this.houses = houses;
    }
//使用构造器定义数组的大小。
    public HouseService(int size) {
        houses = new House[size];
    }

    public House[] list(){
        return houses;
    }
    public Boolean addHouse(House house){
        //判断是否可以继续添加
        if(houseNumbers == houses.length-1){
            System.out.println("数组满了不能加了");
            return false;
        }
        houses[houseNumbers++] = house;
        house.setHouse_id(++idAdd);
        return true;
    }
    public Boolean delHouse(int House_id){
        int index = -1;
        for (int i = 0; i < houseNumbers; i++) {
            if(houses[i].getHouse_id() == House_id){
                index = i;
            }
        }
        if(index != -1){
            for (int i = index; i < houseNumbers - 1; i++) {
                houses[i] = houses[i+1];
            }
            houses[--houseNumbers] = null;
            return true;
        }else {
            System.out.println("未找到该房屋");
            return false;
        }

    }
    public Boolean findHouse(int house_id){
        int index = -1;
        for (int i = 0; i < houseNumbers; i++) {
            if(houses[i].getHouse_id() == house_id){
                index = i;
            }
        }
        if(index != -1){
            System.out.println(houses[index]);
            return true;
        }
        else {
            System.out.println("未找到房屋信息");
            return false;
        }
    }
    public Boolean changeHouse(int house_id){
        int index = -1;
        for (int i = 0; i < houseNumbers; i++) {
            if(houses[i].getHouse_id() == house_id){
                index = i;
            }
        }
        if(index != -1){
            System.out.println("请选择你要修改的属性：（1 姓名 ，2 电话 ， 3 地址 ， 4 房租 ， 5 状态）");
            int in = Utility.readInt();
            switch (in){
                case 1:
                    System.out.println("请输入你需要修改的姓名");
                    houses[index].setName(Utility.readString(10));
                    break;
                case 2:
                    System.out.println("请输入你需要修改的电话");
                    houses[index].setTel(Utility.readString(11));
                    break;
                case 3:
                    System.out.println("请输入你需要修改的地址");
                    houses[index].setAddress(Utility.readString(50));
                    break;
                case 4:
                    System.out.println("请输入你需要修改的房租");
                    houses[index].setRent(Utility.readInt(10));
                    break;
                case 5:
                    System.out.println("请输入你需要修改的状态");
                    houses[index].setState(Utility.readString(4));
                    break;

            }
            System.out.println("修改完毕~");
            return true;
        }
        else {
            System.out.println("未找到房屋信息");
            return false;
        }
    }
}
