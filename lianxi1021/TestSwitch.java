package com.banyuan.lianxi1021;

public class TestSwitch {
    public static void main(String[] args) {

        int score = 78;
        //声明一个变量，专门接受等级：
        String level = "";

        boolean flag = true;

        //根据学生成绩判断等级：
        if (score <= 100) {
            switch (score / 10) {
                case 10:
                case 9:
                    level = "A级";
                    break;
                case 8:
                    level = "B级";
                    break;
                case 7:
                    level = "C级";
                    break;
                case 6:
                    level = "D级";
                    break;
                case 5:
                case 4:
                case 3:
                case 2:
                case 1:
                case 0:
                    level = "E级";
                    break;
                default:
                    flag = false;
            }
        }

        if (flag) {
            System.out.println("学生成绩对应的等级是：" + level);
        } else {
            System.out.println("成绩有误！");
        }
    }
}




