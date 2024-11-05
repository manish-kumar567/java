import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class k121 {
    public static void main(String[] args)throws FileNotFoundException{
        File f1=new File("D:\\4MW23CS065\\OOPJ\\src\\names.txt");
        Scanner sc1=new Scanner(f1);
        String name="";
        Tools1 t1=new Tools1();
        name=sc1.nextLine();
      System.out.println(t1.reverse(name));
        name=sc1.nextLine();
        System.out.println(t1.reverse(name));
        name=sc1.nextLine();
        System.out.println(t1.reverse(name));
    }
    
}
