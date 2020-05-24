package Mid_Level.I_O.ObjectStream.Step1.Step3;

import Mid_Level.I_O.ObjectStream.Step1.Hero;

import java.io.*;

public class TestSTream {
    public static void main(String[] args) {
        //创建Hero数组
        Hero hs[] = new Hero[10];
//        for (int i = 0; i < hs.length ; i++) hs[i] = new Hero("hero:" + i);
        File f = new File("d:/heros.lol");

        try(
                FileOutputStream fos = new FileOutputStream(f);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);
          ) {
            //把数组序列化到文件Heros.lol
            oos.writeObject(hs);
            Hero[]  hs2 = (Hero[]) ois.readObject();
            System.out.println("查看中文件中反序列化出来的数组中的每一个元素：");
            for (Hero hero : hs2) {
                System.out.println(hero.name);
            }
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
