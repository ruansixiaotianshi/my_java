package Homework;
import java.util.Arrays;
public class Test1 {
    public static String strs = "3,7,2,8,1,9,4,5,6,1";

  /**
    * 把字符串转换成int数组存储
    * @return
    */

    public int[] sepator_zf() {

        String[] str = strs.split(",");
        int[] int_str = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            int_str[i] = Integer.parseInt(str[i]);
        }
        return int_str;
    }

    /**
     * 读取并输出字符串
     */
    public int[] read() {
        int[] int_str = sepator_zf();

        return int_str;
    }

    /**
     * 反向读取并输出字符串
     * @return
     */
    public int[] reverse_read() {
        int[] int_str = sepator_zf();
        int[] int_str2 = new int[int_str.length];
        int j = 0;
        for (int i = int_str.length - 1; i >= 0; i--) {
            int_str2[j] = int_str[i];
            j++;
        }
        return int_str2;
    }

    /**
     * 数组排序
     * @return
     */
    public int[] sort() {
        int[] int_str = sepator_zf();
        Arrays.sort(int_str);

        return int_str;
    }

    /**
     * 计算平均值
     * @return
     */
    public int average() {
        int[] int_str = sepator_zf();
        int sum = 0;
        int ave = 0;
        for (int i = 0; i < int_str.length; i++) {
            sum += int_str[i];
        }
        ave = sum / int_str.length;

        return ave;
    }

    /**
     * 显示平均值的位置
     * @return
     */
    public int show_avg() {
        int[] int_str = sepator_zf();
        int[] compare = new int[int_str.length];
        int average = average();
        int index = 0;
        for (int i = 0; i < int_str.length; i++) {
            compare[i] = Math.abs(int_str[i] - average);
        }
        int temp = compare[0];
        for (int i = 0; i < compare.length - 1; i++) {
            if (compare[i + 1] < compare[i]) {
                temp = compare[i + 1];
            }
        }
        for (index = 0; index < compare.length; index++) {
            if (compare[index] == temp) {
                return index + 1;

            }
        }
        return index + 1;
    }

    /**
     * 主函数
     * @param args
     */

    public static void main(String[] args) {
        Test1 demo = new Test1();
        System.out.print("读取字符串：");
        int[] a1 = demo.read();
        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i] + " ");
        }
        System.out.println();
        System.out.print("反向输出字符串：");
        int[] a2 = demo.reverse_read();
        for (int i = 0; i < a2.length; i++) {
            System.out.print(a2[i] + " ");
        }
        System.out.println();
        System.out.print("排序字符串：");
        int[] a3 = demo.sort();
        for (int i = 0; i < a3.length; i++) {
            System.out.print(a3[i] + " ");
        }
        System.out.println();
        System.out.println("平均值为：" + demo.average());
        int index = demo.show_avg();
        System.out.println("最接近平均值的数在第" + index + "位");
    }

}
