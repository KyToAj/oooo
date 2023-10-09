package Chapter08.com.Doub.fengzhuang;

public class Account {
    private String name;
    private double money;
    private String  pass;

    public String getName() {
        return name;
    }

    public Account() {
    }

    public Account(String name, double money, String pass) {
        this.setName(name);
        this.setMoney(money);
        this.setPass(pass);
    }

    public void setName(String name) {
        int len = name.length();
        if(len == 2 || len == 3 || len == 4){
            this.name = name;
        }
        else {
            System.out.println("姓名长度不对，你是哪国人？");
            this.name = "睿智";
        }
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        if(money > 20){
            this.money = money;
        }else {
            System.out.println("没钱了穷B");
            this.money = 0.0;
        }
    }

    public String getPass() {
        return  pass;
    }

    public void setPass(String pass) {
        int len = pass.length();
        if(len == 6){
            this.pass = pass;
        }
        else{
            System.out.println("不会写密码？");
            this.pass = "000000";
        }
    }
    public String info(){
        return "name: " + name + " 余额: " + money + " password: " + pass;
    }
}
