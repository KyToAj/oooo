package DiGui;

public class LinShi {
    public static void main(String[] args) {
        int[][]mi = new int[8][7];
        for(int i = 0 ; i < 7 ; i ++ ){
            mi[0][i] = 1;
            mi[7][i] = 1;
        }for(int i = 0 ; i < 8 ; i ++ ){
            mi[i][0] = 1;
            mi[i][6] = 1;
        }
        mi[3][1] = 1 ;
        mi[3][2] = 1 ;
        System.out.println("========迷宫图========");
        for(int i = 0 ; i < mi.length ; i++){
            for(int j = 0 ; j < mi[i].length ; j ++){
                System.out.print(mi[i][j] + " ");
            }
            System.out.println();
        }
        gong mis = new gong();
        mis.findWay(mi,1,1);
        System.out.println("=========寻路图==========");
        for(int i = 0 ; i < mi.length ; i++){
            for(int j = 0 ; j < mi[i].length ; j ++){
                System.out.print(mi[i][j] + " ");
            }
            System.out.println();
        }
    }
}
class feibo{
    public int fei(int i){
        if(i == 1 || i == 2){//
            return 1;
        }
        else {
            return fei(i-1)+fei(i-2);
        }
    }
}
class monkey{
    public int peach(int day){
        if(day == 10){
            return 1;
        } else if (day >= 1 && day <= 9) {
            return (peach(day+1)+1)*2;//
        }
        else {
            return -1;
        }
    }
}

class gong{
    public boolean findWay(int[][]mi,int i , int j){
        if(mi[6][5] == 2){
            return true;
        }else {
            if(mi[i][j] == 0 ){
                mi[i][j] = 2;
                if(findWay(mi,i+1,j)){
                    return true;
                } else if (findWay(mi,i,j+1)) {
                    return true;
                }else if (findWay(mi,i-1,j)) {
                    return true;
                }else if (findWay(mi,i,j-1)) {
                    return true;
                }
                else {
                    mi[i][j] = 3;
                    return false;
                }
            }else {
                return false;
            }

        }
    }
}

class tower{
    public void hgtower(int way , char a , char b , char c){
        if(way == 1){
            System.out.println(a + "-->" + c);
        }else {
            hgtower(way , a,c,b);
            System.out.println(a + "-->" + c);
            hgtower(way , b , a , c);
        }
    }
}
