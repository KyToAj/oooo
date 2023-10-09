package chapter07.ClassLei;

public class ClassLei {

    class Car{
        String name;//属性

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String[] getColor() {
            return color;
        }

        public void setColor(String[] color) {
            this.color = color;
        }

        String price;
        String[] color; // 属性可以是一般基本数据类型，也可以是引用类型
        //成员方法
        public void speak(){
            System.out.println("说话");
        }
    }
        public void cal01() {

    }


    public static void main(String[] args) {
        int[][]map = {{1,5,4},{2,3,5},{1,2,3}};
        xunhuan xun = new xunhuan();
        xun.xun(map);

    }
}
class xunhuan {
    public void xun(int xunh[][]){
        for(int i = 0 ; i < xunh.length ; i ++){
            for(int j = 0 ; j < xunh[i].length ; j++){
                System.out.print(xunh[i][j] + " ");
            }
            System.out.println();
        }
    }
}
