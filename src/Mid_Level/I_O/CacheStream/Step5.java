package Mid_Level.I_O.CacheStream;

import java.io.*;

public class Step5 {

    private static void removeComments(File javaFile) {
        StringBuffer sb = new StringBuffer();
        //读取内容
        try(FileReader fr = new FileReader(javaFile); BufferedReader br = new BufferedReader(fr);){
            while(true) {
                String line = br.readLine();
                if (null == line)
                    break;
                //如果不是以//开头，就保存在StringBuffer中
                if (!line.trim().startsWith("//"))
                    sb.append(line).append("\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (
                FileWriter fw = new FileWriter(javaFile);
                PrintWriter pw = new PrintWriter(fw);
            ) {
            //写出内容
            pw.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        File javaFile = new File("d:/java.java");
        System.out.println(javaFile.exists());
        System.out.println(javaFile.length());
        removeComments(javaFile);
    }

}
