package DiGui;

public class EightQueens {
    public static void main(String[] args) {
        Queens queens = new Queens();
        int[]q = new int[7];
        queens.queen(q,0);
    }
}
class Queens{
    public void queen(int[]q,int i ){
        for(int j = 0 ; j < q.length-1 ; j++){
            if(q[j+1] != q[j] && q[j+1] != (q[j] +1)){

            }else {
                q[j+1] = q[0]+1;
            }
        }
    }
}
