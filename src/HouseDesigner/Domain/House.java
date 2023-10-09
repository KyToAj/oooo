package HouseDesigner.Domain;
//一个house对象表示一个房屋信息
public class House {
    private int house_id;//编号
    private String name;//房主
    private String tel;//电话
    private String address;//地址
    private double rent;//房租
    private String state;//状态（已出租/未出租）

    public House(int house_id, String name, String tel, String address, double rent, String state) {
        this.house_id = house_id;
        this.name = name;
        this.tel = tel;
        this.address = address;
        this.rent = rent;
        this.state = state;
    }

    public int getHouse_id() {
        return house_id;
    }

    public void setHouse_id(int house_id) {
        this.house_id = house_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return
                house_id +
                "\t\t" + name +
                "\t\t" + tel +
                "\t\t" + address +
                "\t\t" + rent +
                "\t\t" + state ;
    }

}
