//
// 过年了，小孩们放炮，现在有三个小孩：呆呆，龙飞，小雪，每一个人一支香，每人一百个炮（散），呆呆每隔一秒燃放一个，龙飞每隔两秒燃放一个，小雪每隔三秒燃放一个，在不考虑燃烧时间跟安全的情况下，即随点随炸，当龙飞喊开始的时候大家一起点，问当大家都放完时，一共可以听到多少响？
//

public class FireCracker {
    public static void main(String[] args) {
        int initNumA = 100;
        int initNumB = 100;
        int initNumC = 100;
        int totalSounds = 0;
        // System.out.format("t\tleftA\tleftB\tleftC\tBangs\n");
        for(int t = 0; (initNumA >0 || initNumB >0 || initNumC > 0) && t<400; t++){
            int bangA = 0;
            int bangB = 0;
            int bangC = 0;
            if(t % 1 == 0 && initNumA > 0) {
                initNumA--;
                bangA = 1;
            }
            if(t % 2 == 0 && initNumB > 0) {
                initNumB--;
                bangB = 1;
            }
            if(t % 3 == 0 && initNumC > 0) {
                initNumC--;
                bangC = 1;
            }
            if (bangA + bangB + bangC > 0 ) {
                totalSounds++;
            }
            // System.out.format("%d\t%d\t%d\t%d\t%d\n", t, initNumA, initNumB, initNumC, totalSounds);
        }
        System.out.println("Total sounds: " + totalSounds);
    }

}
