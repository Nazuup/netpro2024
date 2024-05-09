public class XmasTreeKadai {

    public static void main(String[] args) {
        // int X = Integer.parseInt(args[0]);
        // int Y = Integer.parseInt(args[1]);

        int yokohaba = 19; // 最大の葉の横幅の数
        int snow = (yokohaba+1)/2; // 最大の雪の横幅の数
        int miki = 3; // 幹の幅列
        if(yokohaba%2==0){
            miki = 2;
        }
        for(int i = 0; i<yokohaba; i++){
            if(i%2==0){
                System.out.print(" ");
                snow--;
            }

            for(int j = 0; j<snow; j++){
                System.out.print("+ ");
            }
            for(int j = 0; j<2*i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i<7; i++){
            for(int j = 0; j<yokohaba-2; j++){
                System.out.print(" ");
            }
            for(int j = 0; j<miki; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
// https://docs.oracle.com/javase/jp/8/docs/api/java/lang/Integer.html