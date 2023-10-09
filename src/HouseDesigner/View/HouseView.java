package HouseDesigner.View;

import HouseDesigner.Domain.House;
import HouseDesigner.Service.HouseService;
import HouseDesigner.Utils.Utility;

import java.util.Scanner;

//1. 显示界面
//2. 接受用户的输入
//3. 调用house service完成对房屋信息的各种操作
public class HouseView {
    private boolean loop = true;
    private char key;
    private HouseService housesList =  new HouseService(5);
    //主界面
    public void mainMenu(){
        do{
            System.out.println("===============房屋出租系统===============");
            System.out.println(" 1 新 增 房 源 \n 2 查 找 房 屋 \n 3 删 除 房 屋 \n 4 修 改 房 屋 信 息 \n 5 房 屋 列 表 \n 6 退\t出");
            System.out.println("请输入你的选择：");
            key = Utility.readChar();
            switch (key){
                case '1':
                    System.out.println("新 增 房 源");
                    addHouse();
                    break;
                case '2':
                    System.out.println("查 找 房 屋");
                    findHouse();
                    break;
                case '3':
                    System.out.println("删 除 房 屋");
                    delHouse();
                    break;
                case '4':
                    System.out.println("修 改 房 屋 信 息");
                    changeHouse();
                    break;
                case '5':
                    System.out.println("房 屋 列 表");
                    houseList();
                    break;
                case '6':
                    System.out.println("退   出");
                    quitHouse();
                    break;
            }
        }while (loop);

    }
    //展示
    public void houseList(){
        System.out.println("================房屋列表===============\n");
        System.out.println("编号\t\t房主\t\t\t电话\t\t\t地址\t\t\t月租\t\t\t状态(已出租/未出租)");
        House[] houses = housesList.list();//得到所有房屋信息。
        for (int i = 0; i < houses.length; i++) {
            if(houses[i]!=null){
                System.out.println(houses[i]);
            }
        }
        System.out.println("\n==============房屋列表显示完毕=============\n");

    }
    //添加
    public void addHouse(){

        System.out.println("================添加房屋===============\n");

        System.out.print("姓名：");
        String name = (Utility.readString(10));
        System.out.print("电话：");
        String tel = (Utility.readString(11));
        System.out.print("地址：");
        String address = (Utility.readString(50));
        System.out.print("月租：");
        int rent = (Utility.readInt());
        System.out.print("状态：");
        String stare = (Utility.readString(3));
        House house = new House(0,name,tel,address,rent,stare);
    if(housesList.addHouse(house)){
        System.out.println("================添加房屋成功===============");
    }
    else {
        System.out.println("================添加房屋失败===============");
    }
    }
    //退出
    public void quitHouse(){
        System.out.println("确认退出吗？");
        char result = Utility.readConfirmSelection();
        if(result == 'Y'){
            loop = false;
        }
    }
    //删除
    public void delHouse(){
        System.out.println("================删除房屋===============\n");
        int house_id;
        System.out.print("请选择待删除房屋编号（-1 退出）：");
        house_id = (Utility.readInt());
        if(house_id != -1){
    //        System.out.print("确认是否删除(y/n)，请谨慎选择：");
            char re = Utility.readConfirmSelection();
            if(re == 'Y'){
                if(housesList.delHouse(house_id)){
                    System.out.println("已删除");
                }
                else {
                    System.out.println("删除失败，请确认您的id是否有误");
                }
            }
            else {
                System.out.println("放弃删除房屋");
            }
        }
        else {
            System.out.println("放弃删除。");
            return;
        }
    }
    //查找
    public void findHouse(){
        System.out.println("================查找房屋===============\n");
        int house_id;
        System.out.print("请输入需要查找的房屋id：");
        house_id = Utility.readInt();
        housesList.findHouse(house_id);
    }
    public void changeHouse(){
        System.out.println("===============修改房屋===============\n");
        int house_id;
        System.out.print("请输入需要修改的房屋id：");
        house_id = Utility.readInt();
        housesList.changeHouse(house_id);
    }
}


