package version2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DocGhiDuLieu {
    public void ghiFile(ArrayList list, String filename ){
        try(FileOutputStream fos = new FileOutputStream(new File(filename))){
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
        }catch(Exception e){
            System.out.println("File trống!");
        }
    }
    
    public ArrayList docFile(String filename){
        ArrayList list = new ArrayList();
        try(FileInputStream fis = new FileInputStream(new File(filename))){
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = (ArrayList)ois.readObject();
        }catch(Exception e){
            System.out.println("File trống!");
        }
        return list;
    }
}
