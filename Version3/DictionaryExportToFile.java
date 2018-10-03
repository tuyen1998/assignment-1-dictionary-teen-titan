
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryExportToFile {
    public void ghiFile(ArrayList <Word> list){
        File file= new File("dictionaries.txt");
        try (PrintWriter print = new PrintWriter(file)){
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
        File file= new File("dictionaries.txt");
        ArrayList<Word> list = new ArrayList<>();
        try(Scanner scan = new Scanner(file)) {
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
