import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class ReadAndWrite {
    public String fileRead() throws Exception {
        File file = new File("D:\\JAVAcode\\src\\in.txt");
		if(file.exists()){
              System.out.print("in.txt文件存在");
          }else{
              System.out.print("in.txt文件不存在");
              file.createNewFile();//不存在则创建
          }
        FileReader reader = new FileReader(file);//定义一个fileReader对象，用来初始化BufferedReader
        BufferedReader bReader = new BufferedReader(reader);//new一个BufferedReader对象，将文件内容读取到缓存
        StringBuilder win = new StringBuilder();//定义一个字符串缓存，将字符串存放缓存中

        String s = "";
        while ((s =bReader.readLine()) != null) {//逐行读取文件内容，不读取换行符和末尾的空格
            win.append(s);//将读取的字符串添加换行符后累加存放在缓存中
        }
        bReader.close();
        String str = win.toString();//将读取的文件内容以字符串赋给str
        System.out.println(str);
        return str;//返回文件内容str
        //return str;
        //int[] a=new int[3];
        //return 0;
    }
  public static void write(String s1) throws IOException {//要写入内容为s1
      try {
          File f = new File("D:\\JAVAcode\\src\\out.txt");
          if(f.exists()){
              System.out.print("文件存在");
          }else{
              System.out.print("文件不存在");
              f.createNewFile();//不存在则创建
          }
          BufferedWriter output = new BufferedWriter(new FileWriter(f));
          output.write(s1); //将s1写入文件
          output.close();
      } catch (Exception e) {
          e.printStackTrace();
      }
  }
}
