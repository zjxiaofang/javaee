package com.zss.Test10;

import java.io.*;

public class CopyDir {
    public static void main(String[] args) {
        try {
            copyDirectiory("d:/301sxt","d:/301sxt2");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void copyFile(File sourceFile, File targetFile) throws IOException {
        BufferedInputStream inBuff = null;
        BufferedOutputStream outBuff = null;
        try {
            // 新建文件输入流
            inBuff = new BufferedInputStream(new FileInputStream(sourceFile));
            // 新建文件输出流
            outBuff = new BufferedOutputStream(new FileOutputStream(targetFile));
            // 缓冲数组
            byte[] b = new byte[1024 * 5];
            int len;
            while ((len = inBuff.read(b)) != -1) {
                outBuff.write(b, 0, len);
            }
            // 刷新此缓冲的输出流
            outBuff.flush();
        } finally {
            // 关闭流
            if (inBuff != null)
                inBuff.close();
            if (outBuff != null)
                outBuff.close();
        }
    }


    private static void copyDirectiory(String sourceDir, String targetDir) throws IOException {
        File fSourceDir = new File(sourceDir);
        if(!fSourceDir.exists() || !fSourceDir.isDirectory()){
            return;
        }
        File fTargetDir = new File(targetDir);
        if(!fTargetDir.exists()){
            fTargetDir.mkdirs();
        }
        File[] file = fSourceDir.listFiles();
        for (int i = 0; i < file.length; i++) {
            if (file[i].isFile()) {
                File sourceFile = file[i];
                File targetFile = new File(fTargetDir, file[i].getName());
                copyFile(sourceFile, targetFile);
            }

            if (file[i].isDirectory()) {
                String subSourceDir = sourceDir + File.separator + file[i].getName();
                String subTargetDir = targetDir + File.separator + file[i].getName();
                copyDirectiory(subSourceDir, subTargetDir);
            }
        }
    }
}
