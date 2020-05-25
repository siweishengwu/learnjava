package Mid_Level.I_O.System_in;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Step5 {
    public static void main(String[] args) {
        // 接受客户输入
        Scanner s = new Scanner(System.in);
        System.out.println("请输入类的名称：");
        String className = s.nextLine();
        System.out.println("请输入属性的类型：");
        String type = s.nextLine();
        System.out.println("请输入属性的名称：");
        String property = s.nextLine();
        String Uproperty = toUpperFirstLetter(property);

        // 读取模板文件

        File modelFile = new File("d:/lol.txt");
        String mdoelContent = null;
        try(FileReader fr = new FileReader(modelFile)) {
            char cs[] = new char[(int) modelFile.length()];
            fr.read(cs);
            mdoelContent = new String(cs);
        }catch (IOException e){
            e.printStackTrace();
        }

        // 替换

        String fileContent = mdoelContent.replaceAll("@class@",className);
        fileContent = fileContent.replaceAll("@type@",type);
        fileContent = fileContent.replaceAll("@property@",property);
        fileContent = fileContent.replaceAll("@Uproperty@",Uproperty);
        String fileName = className + ".java";

        // 替换后的内容
        System.out.println("替换后的内容：");
        System.out.println(fileContent);
        File file = new File("d:/",fileName);

        try(FileWriter fw = new FileWriter(file);) {
            fw.write(fileContent);
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("文件保存在:" + file.getAbsolutePath());
    }

    private static String toUpperFirstLetter(String str) {
            char upperCaseFirst = Character.toUpperCase(str.charAt(0));
            String rest = str.substring(1);
            return upperCaseFirst + rest;
    }
}
