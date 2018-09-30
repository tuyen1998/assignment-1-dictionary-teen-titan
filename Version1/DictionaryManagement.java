package version01;

import java.util.Scanner;

public class DictionaryManagement {
    Dictionary dictionary= new Dictionary();
    int dem= 1;
    
    public DictionaryManagement() {}
    
// Phương thức insertFromCommandline()
    public void insertFromCommandline(){
        Scanner scan = new Scanner(System.in);
        Word wor= new Word();
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
            dictionary.arrayList.add(wor);
            System.out.println("Thêm từ thành công!");
        }
        
    }
    public void hienThiTu(){
        System.out.println("----------------------------------");
        System.out.println("No   |English    |Vietnamese");
        System.out.println("----------------------------------");
        for(Word i: dictionary.arrayList){
            Word w  = (Word) i;
            System.out.printf("%-6d%-12s%-12s", dem++, w.getWord_target(),w.getWord_explain());
            System.out.print("\n----------------------------------\n");
        }
        dem= 1;
    }
}
