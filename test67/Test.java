package com.banyuan.test67;

import javax.swing.JOptionPane;

public class Test {
    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock(1000, true);
        clock.start();
        JOptionPane.showMessageDialog(null, "是否退出？");
        System.exit(0);
    }
}
