//package Homework;
//import java.util.Random;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.OutputStream;
//
//public class Test2 {
//    Random random = new Random();//产生随机数的对象
//    private int x;
//    private int y;//双私有数据成员，x为左操作数，y为右操作数
//    private char c;
//    private int r;
//    private int result;
//    private String str;
//    private boolean outliers = true;
//    private boolean bol;
//    private char[] opertor = { '+', '-', '*', '/' };
//
//    public Test2() {
//
//    }
//
//    /**
//     * 双私有数据成员
//     *
//     * @param x 左操作数
//     * @param y 右操作数
//     * @param c 运算符
//     */
//    public Test2(int x, char c, int y) {
//        this.x = x;
//        this.y = y;
//        this.c = c;
//    }
//
//    /**
//     * 获取结果的方法
//     * @return
//     */
//    public String getResult() {
//        outliers = false;
//        for (int i = 0; i < opertor.length; i++) {
//            if (this.c == opertor[i]) {
//                r = i;
//            }
//        }
//        String string = get();
//        outliers = true;
//        return string;
//    }
//
//    public String get() {
////若除数为0，抛出异常
//        if (outliers) {
//            r = random.nextInt(4);
//        }
//        switch (r) {
//            case 0:
//                result = x + y;
//                break;
//            case 1:
//                result = x - y;
//                break;
//            case 2:
//                result = x * y;
//                break;
//            case 3:
//                if (y == 0) {
//                    throw new ArithmeticException("除数不能为零");
//                } else {
//                    result = x / y;
//                }
//                break;
//
//        }
//        str = Integer.toBinaryString(x) + opertor[r] + Integer.toBinaryString(y) + "=" + Integer.toBinaryString(result);
//        return str;
//
//    }
//
//    public int getX() {
//        return x;
//    }
//
//    public void setX(int x) {
//        this.x = x;
//    }
//
//    public int getY() {
//        return y;
//    }
//
//    public void setY(int y) {
//        this.y = y;
//    }
//
//    public char getOperator() {
//        return c;
//    }
//
//    public void setOperator(char operator) {
//        this.c = operator;
//    }
//    /**
//     * 创建100个随机数
//     * @throws Exception
//     */
//    public void createRandom() throws Exception {
//        //100个随机数
//        for (int i = 0; i < 100; i++) {
//            Test2 m = new Test2(random.nextInt(10) + 10, (char) random.nextInt(4), random.nextInt(10) + 1);
//            m.get();
//            IO.write(m.str + '\n');
//        }
//    }
//
//    /**
//     * 主函数
//     * @param args
//     * @throws Exception
//     */
//    public static void main(String[] args) throws Exception {
//
//        Test2 demo = new Test2();
//        demo.bol = IO.file.exists();
//        if (demo.bol) {
//            System.out.println(IO.read());
//            ;
//        } else {
//            demo.createRandom();
//        }
//
//    }
//}
///**
// * 操作io对象的类
// *
// */
//class IO {
//    static File file = new File("out.txt");
//    static String strs = "";
//    /**
//     * 表达式和运算结果写入文件
//     * @param info
//     */
//    public static void write(String info) {
//
//        OutputStream os = null;
//        try {
//            os = new FileOutputStream(file, true);
//            String msg = info + "";
//            byte[] bytes = msg.getBytes();
//            os.write(bytes);
//            os.flush();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (null != os) {
//                try {
//                    os.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//    }
//    /**
//     * 读取文件内容，并行中显示
//     * @return
//     */
//    public static String read() {
//
//        InputStream is = null;
//
//        try {
//            is = new FileInputStream(file);
//            byte[] flush = new byte[1024];
//            int len = -1;
//            while ((len = is.read(flush)) != -1) {
//
//                strs = new String(flush, 0, len);
//
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//
//            if (null != is) {
//                try {
//                    is.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        return strs;
//    }
//
//}
