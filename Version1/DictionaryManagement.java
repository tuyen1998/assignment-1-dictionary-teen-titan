package version1;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DictionaryManagement {
    Dictionary dictionary= new Dictionary();
    Scanner scan = new Scanner(System.in);
    int dem= 1;
    
    public DictionaryManagement() {}
    
// Phương thức insertFromCommandline()
public void insertFromCommandline(){
        int n = 0;
        System.out.print("English: ");
        Word wor= new Word();
        // Nhập word_target và word_explain
        wor.word_target= scan.nextLine();
        System.out.print("Vietnamese: ");
        wor.word_explain= scan.nextLine();
        if(wor.word_target.isEmpty()|| wor.word_explain.isEmpty()){
            System.out.println("--- Không được bỏ trống ! ---");
        }
        else {
            if(dictionary.arrayList.isEmpty()){
                // Truyền giá trị
                wor.setWord_target(wor.word_target);
                wor.setWord_explain(wor.word_explain);
                // Thêm vào arraylist
                dictionary.arrayList.add(wor);
                System.out.println("--- Thêm từ thành công! ---");
            }
            else {
                for(Word i: dictionary.arrayList){
                    Word w  = (Word) i;
                    if(wor.word_target.toUpperCase().matches(w.getWord_target().toUpperCase())){
                        System.out.println("==================================");
                        System.out.println("Từ này bị trùng, bạn muốn: ");
                        System.out.println("----------------------------------");
                        System.out.println("No   |English    |Vietnamese");
                        System.out.println("----------------------------------");
                        System.out.printf("%-6d%-12s%-12s", dem++, w.getWord_target(),w.getWord_explain());
                        System.out.println();
                        System.out.println("----------------------------------");
                        System.out.println("Nhập 1: Thay thế.");
                        System.out.println("Nhập 2: Thêm vào và không thay thế.");
                        System.out.println("Nhập 3: Hủy thao tác.");
                        System.out.print("Nhập... ");
                        n= scan.nextInt();
                        System.out.println("==================================");
                        if(n== 1){
                            w.word_target= wor.word_target;
                            w.word_explain= wor.word_explain;
                            System.out.println("--- Thay thế thành công! ---");
                        }
                        else if(n== 2){
                            // Truyền giá trị
                            wor.setWord_target(wor.word_target);
                            wor.setWord_explain(wor.word_explain);
                        }
                        else if(n== 3){
                            System.out.println("--- Bạn vừa hủy thao tác !!! ---");
                            break;
                        }
                        else {
                            System.out.println("--- Vui lòng nhập lại !!! ---");
                        }
                    }
                    else{
                        // Truyền giá trị
                        wor.setWord_target(wor.word_target);
                        wor.setWord_explain(wor.word_explain);
                    }
                }
                dem= 1;
                // Ghi vào file
                if(n== 0 || n== 2){
                    // Thêm vào arraylist
                    dictionary.arrayList.add(wor);
                    System.out.println("--- Thêm từ thành công! ---");
                }
            }
        }
    }
    public void hienThiTu(){
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
            System.out.printf("%-6d%-12s%-12s", dem++, w.getWord_target(),w.getWord_explain());
            System.out.print("\n----------------------------------\n");
        }
        dem= 1;
    }
}
