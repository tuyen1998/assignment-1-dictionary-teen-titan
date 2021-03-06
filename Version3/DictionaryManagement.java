
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class DictionaryManagement {
    Dictionary dictionary= new Dictionary();
    DictionaryExportToFile docghi= new DictionaryExportToFile();
    Scanner scan = new Scanner(System.in);
    private int dem= 1;
    
    public DictionaryManagement() {
        dictionary.arrayList= docghi.docFile();
    }
// Hàm insertFromCommandline()
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
                // Ghi vào file
                docghi.ghiFile(dictionary.arrayList);
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
                            docghi.ghiFile(dictionary.arrayList);
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
                            System.out.println("Chỉ được nhập từ 1- 3. Vui lòng nhập lại !!!");
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
                    docghi.ghiFile(dictionary.arrayList);
                    System.out.println("--- Thêm từ thành công! ---");
                }
            }
        }
    }
// Hàm xóa tất cả từ đã nhập
    public void deleteFromCommandline(){
        // Xóa toàn bộ từ trong arraylist
        System.out.println("Bạn chắc chắn chứ");
        System.out.println("Nhập 1: Đồng ý.");
        System.out.println("Nhập 2: Hủy thao tác");
        System.out.print("Nhập... ");
        int nhap= scan.nextInt();
        switch(nhap){
            case 1:
                dictionary.arrayList.removeAll(dictionary.arrayList);
                // Ghi lại
                docghi.ghiFile(dictionary.arrayList);
                System.out.println("--- Xóa thành công ! ---");
                break;
            case 2:
                System.out.println("--- Bạn vừa hủy thao tác !!! ---");
                break;
            default:
                System.out.println("--- Vui lòng nhập lại !!! ---");
                break;
        }
    }
// Hàm suaTu() để sửa từ đã chọn
    public void suaTu(){
        int n = 0;
        System.out.print("English: ");
        String tusua= scan.nextLine();
        Word wor= new Word();
        System.out.println("Sửa thành: ");
        System.out.print("English: ");
        wor.word_target= scan.nextLine();
        System.out.print("Vietnamese: ");
        wor.word_explain= scan.nextLine();
        if(tusua.isEmpty() || wor.word_target.isEmpty() || wor.word_explain.isEmpty()){
            System.out.println("--- Không được bỏ trống ! ---");
        }
        else {
            if(dictionary.arrayList.isEmpty()){
                System.out.println("Danh sách trống, hãy thêm từ !!!");
            }
            else {
                for(Word i: dictionary.arrayList){
                    Word w  = (Word) i;
                    if(tusua.toUpperCase().matches(w.getWord_target().toUpperCase())){
                        System.out.println("==================================");
                        System.out.println("Áp dụng sửa cho từ : ");
                        System.out.println("----------------------------------");
                        System.out.println("No   |English    |Vietnamese");
                        System.out.println("----------------------------------");
                        System.out.printf("%-6d%-12s%-12s", dem++, w.getWord_target(),w.getWord_explain());
                        System.out.println();
                        System.out.println("----------------------------------");
                        System.out.println("Nhập 1: Đồng ý.");
                        System.out.println("Nhập 2: Hủy thao tác.");
                        System.out.print("Nhập... ");
                        n= scan.nextInt();
                        System.out.println("==================================");
                        if(n== 1){
                            w.word_target= wor.word_target;
                            w.word_explain= wor.word_explain;
                            docghi.ghiFile(dictionary.arrayList);
                            System.out.println("-----  Sửa thành công !  ------");
                        }
                        else if(n== 2){
                            System.out.println("--- Bạn vừa hủy thao tác !!! ---");
                            break;
                        }
                        else {
                            System.out.println("----- Vui lòng nhập lại!!! -----");
                        }
                    }
                }
                dem= 1;
            }
        }
    }
// Hàm tìm kiếm dictionaryLookup()
   public void dictionaryLookup(){
       // Nhập word_target và word_explain
        String seach= scan.nextLine();
        if(seach.isEmpty()){
            System.out.println("--- Không được bỏ trống ! ---");
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
