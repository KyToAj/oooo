package DiGui;

public class MiGong {
    public static void main(String[] args) {
        int map[][] = new int[8][7];
        int t = 0 ;
        for(int i = 0 ; i < 7; i ++){//列
            map[0][i] = 1;
            map[7][i] = 1;
        }  for(int i = 0 ; i < 8; i ++){//行
            map[i][0] = 1;
            map[i][6] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;
        map[2][2] = 1;
        System.out.println("=========迷宫图=========");
        for(int i = 0 ; i < map.length ; i ++){
            for( int j = 0 ; j < map[i].length ; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println(" ");
        }
        mig mi = new mig();
        System.out.println("=========经过的坐标=========");
        mi.findWay(map,1,1);

        System.out.println("=========路线图=========");
        for(int i = 0 ; i < map.length ; i ++){
            for( int j = 0 ; j < map[i].length ; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
class mig{
    public boolean findWay(int map[][],int i , int j){
        if(map[6][5] == 2){
            return  true;
        }
        else {
            if(map[i][j] == 0){
                map[i][j] = 2;
                if(findWay(map,i+1,j)){
                    System.out.println("i = " + i + ", j = " + j);
                    return true;
                }else if(findWay(map,i,j+1)){
                    System.out.println("i = " + i + ", j = " + j);
                    return true;
                }else if(findWay(map,i-1,j)){
                    System.out.println("i = " + i + ", j = " + j);
                    return true;
                } else if (findWay(map,i,j-1)) {
                    System.out.println("i = " + i + ", j = " + j);
                    return true;
                }else {
                    map[i][j] = 3;
                    return false;
                }
//                if(findWay(map,i-1,j)){
//                    System.out.println("i = " + i + ", j = " + j);
//                    return true;
//
//                }else if(findWay(map,i,j+1)){
//                    System.out.println("i = " + i + ", j = " + j);
//                    return true;
//                }else if(findWay(map,i+1,j)){
//                    System.out.println("i = " + i + ", j = " + j);
//                    return true;
//                } else if (findWay(map,i,j-1)) {
//                    System.out.println("i = " + i + ", j = " + j);
//                    return true;
//                }else {
//                    map[i][j] = 3;
//                    return false;
//                }
            }else {
                return false;
            }
        }
    }

}