import java.io.*;
public class sessionalq1{
    public static void main(String args[]){
        try{
            FileInputStream obj1=new FileInputStream("File1.txt");
            FileOutputStream obj2=new FileOutputStream("File2.txt");
            int ch;
            while((ch=obj1.read())!=-1){
                String str=String.valueOf((char)ch);
                obj2.write(str.getBytes());
            }
            obj1.close();
            obj2.close();
            FileReader obj3=new FileReader("File3.txt");
            FileWriter obj4=new FileWriter("File4.txt");
            int sh;
            while((sh=obj3.read())!=-1){
                char c=(char)sh;
                String str=String.valueOf(c);
                obj4.write(str);
            }
            obj3.close();
            obj4.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());

        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        
    }
}