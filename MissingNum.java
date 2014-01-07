// 现在有一个长度为100W（万）的整形数组，里面的值为1~100W（无重复）
// 这些数的存放顺序是杂乱无章的即随机存放，
// 现在随机指定一个元素的值为0，
// 问：丢了的元素值是多少？到底是谁丢了呢？
//
public class MissingNum {
    public int[] numA;
    public int length;

    MissingNum (int length, int missing) {
        this.length = length;
        numA = new int[length];
        for(int i = 0; i < length; i++) {
            numA[i] = i+1;
        }
        // set number at index 'missing - 1' to zero
        numA[missing-1] = 0;
    }

    public long findMissing(){
        // sum before number is missing
        long sum_old = (long) length * (1+length) / 2;
        // sum after number is missing
        long sum_new = 0;
        for(int i : numA) {
            sum_new += (long) i;
        }
        // System.out.println("== " + sum_old + " " + sum_new + " ==");
        return (sum_old - sum_new);
    }

    public static void main(String[] args) {
        MissingNum missingNum = new MissingNum(1000000, 4);
        System.out.println("missing: " + missingNum.findMissing());
    }
}
