package Chapter08.com.Doub.polyparameter;
public class PolyParameter {
    public static void main(String[] args) {
        NormalEmployee xiaoyi = new NormalEmployee("xiaoyi", 4600);
        BigEmployee xiaobai = new BigEmployee("xiaobai", 7800, 60000);
        PolyParameter polyParameter = new PolyParameter();
        polyParameter.showEmpAnnual(xiaobai);
        polyParameter.showEmpAnnual(xiaoyi);
        "hello".equals("baga");
//
//        int m = 1;
//        double n = 2.3;
//        m.equals(m);

    }
    public void showEmpAnnual(Employee e){
        System.out.println( e.getAnnual());
    }
    public Integer i;
    public void testWork(Employee employee){
        if(employee instanceof NormalEmployee){
            ((NormalEmployee) employee).work();
        }
        else if(employee instanceof BigEmployee) {
            ((BigEmployee) employee).manage();
            Object o = new Object();
        }
    }
}