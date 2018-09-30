package version2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DictionaryManagement {
    Dictionary dictionary= new Dictionary();
    DocGhiDuLieu docghi= new DocGhiDuLieu();
    Scanner scan = new Scanner(System.in);
    Word wor= new Word();
    private int dem= 1;
    
    public DictionaryManagement() {
        dictionary.arrayList= docghi.docFile("dictionaries.txt");
    }
// Phương thức insertFromCommandline()
    public void insertFromCommandline(){
        System.out.print("English: ");
        // Nhập word_target và word_explain
        wor.word_target= scan.nextLine();
        System.out.print("Vietnamese: ");
        wor.word_explain= scan.nextLine();
        if(wor.word_target.isEmpty()|| wor.word_explain.isEmpty()){
            System.out.println("Không được bỏ trống !");
        }
        else {
            // Truyền giá trị
            wor.setWord_target(wor.word_target);
            wor.setWord_explain(wor.word_explain);
            // Thêm vào arraylist
            dictionary.arrayList.add(wor);
            // Ghi vào file
            docghi.ghiFile(dictionary.arrayList, "dictionaries.txt");
            System.out.println("Thêm từ thành công!");
        }
    }
// Phương thức xóa từ đã nhập
    public void deleteFromCommandline(){
        // Xóa toàn bộ từ trong arraylist
        dictionary.arrayList.removeAll(dictionary.arrayList);
        // Ghi lại
        docghi.ghiFile(dictionary.arrayList, "File.dat");
    }
// Hàm tìm kiếm
   public void dictionaryLookup(){
       System.out.print("Nhập từ cần tìm: ");
       // Nhập word_target và word_explain
       String seach= scan.nextLine();
        if(seach.isEmpty()){
            System.out.println("Không được bỏ trống !");
        }
        else {
            System.out.println("----------------------------------");
            System.out.println("No   |English    |Vietnamese");
            System.out.println("----------------------------------");
            // Sắp xếp
            Collections.sort(dictionary.arrayList, new Comparator<Word>() {
                public int compare(Word word0, Word word1) {
                    return (word0.getWord_target().compareTo(word1.getWord_target()));
                }
            });
            for(Word i: dictionary.arrayList){
                Word w  = (Word) i;
                // Khớp từ khi đã uppercase
                if(w.getWord_target().toUpperCase().matches(".*"+(seach.toUpperCase())+".*") ||
                    w.getWord_explain().toUpperCase().matches(".*"+(seach.toUpperCase())+".*")){
                    System.out.printf("%-6d%-12s%-12s", dem++, w.getWord_target(),w.getWord_explain());
                    System.out.print("\n----------------------------------\n");
                }
            }
            dem= 1;
        }
       
   }
}
