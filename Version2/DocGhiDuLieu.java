package version2;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DocGhiDuLieu {
    public void ghiFile(ArrayList <Word> list){
        try (PrintWriter print = new PrintWriter(new File("dictionaries.txt"))){
            for(Word i: list){
                print.println(i.getWord_target());
                print.println(i.getWord_explain());
            }
            print.close();
        } catch (Exception e) {
            System.out.println("File trống!");
        }
    }
    public ArrayList docFile(){
        ArrayList<Word> list = new ArrayList<>();
        try(Scanner scan = new Scanner(new File("dictionaries.txt"))) {
            while(scan.hasNext()){
                Word w = new Word();
                w.setWord_target(scan.nextLine());
                w.setWord_explain(scan.nextLine());
                list.add(w);
            }
        } catch (Exception e) {
            System.out.println("File trống!");
        }
        return list;
    }
}
