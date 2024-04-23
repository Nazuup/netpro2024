import java.util.Random;

public class NetproLabMember {
    public static void main(String[] args){
        Random random = new Random();
        double pro = 1;
        double[][] member = new double[15][3]; //1~25年目の学生総数、女子学生の割合、岩井研の配属人数
        for(int i = 0; i<member.length; i++){
            member[i][0] = 100 + (int)random.nextInt(20);//学生総数
            member[i][1] = 20+i;//女子学生の割合
            member[i][2] = 7+(int)random.nextInt(6);//岩井研の配属人数
            pro *= Math.pow(1-member[i][2]/member[i][0], member[i][0]*(member[i][1]/100));//確率
        }
        System.out.println("確率:"+pro);
    }
}
