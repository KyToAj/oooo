package HouseDesigner;

import HouseDesigner.Domain.House;
import HouseDesigner.Service.HouseService;
import HouseDesigner.View.HouseView;

/**
 * 程序入口
 * 创建house view对象
 * 调用该对象，显示主菜单
 */
public class HouseRentApp {
    public static void main(String[] args) {
        //创建HouseView对象，整个程序的入口。
       new HouseView().mainMenu();


    }

}
