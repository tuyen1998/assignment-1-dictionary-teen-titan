import java.io.Console;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DictionaryCommandline {
    Dictionary dictionary= new Dictionary();
    DictionaryManagement dictionaryManagement= new DictionaryManagement();
    DocGhiDuLieu docghi= new DocGhiDuLieu();
    private int dem= 1;
    int n;
    
    public DictionaryCommandline() {
        dictionary.arrayList= docghi.docFile("dictionaries.txt");
    }
    
// Phương thức showAllWords()
    public void showAllWords(){
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
// Phương thức dictionaryAdvanced() 
    public void dictionaryAdvanced(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập 1: Thêm từ.");
        System.out.println("Nhập 2: Xem toàn bộ từ đã thêm.");
        System.out.println("Nhập 3: Xóa toàn bộ từ đã thêm.");
        System.out.println("Nhập 4: Tìm từ đã thêm.");
        System.out.println("Nhập 5: Sửa từ.");
        System.out.println("Nhập 6: Kết thúc.");
        System.out.print("Nhập số... ");
        n= scan.nextInt();
        System.out.println("==================================");
        switch(n){
        case 1:
            dictionaryManagement.insertFromCommandline();
            System.out.println("==================================");
            break;
        case 2:
            dictionary.arrayList= docghi.docFile("dictionaries.txt");
            if(dictionary.arrayList.isEmpty()){
                System.out.println("Danh sách trống, hãy thêm từ !");
            }
            else {
                this.showAllWords();
            }
            System.out.println("==================================");
            break;
        case 3:
            if(dictionary.arrayList.isEmpty()){
                System.out.println("Danh sách trống, hãy thêm từ !");
            }
            else {
                dictionaryManagement.deleteFromCommandline();
            }
            System.out.println("==================================");
            break;
        case 4:
            if(dictionary.arrayList.isEmpty()){
                System.out.println("Danh sách trống, hãy thêm từ !");
            }
            else {
                System.out.print("Nhập từ cần tìm: ");
                dictionaryManagement.dictionaryLookup();
            }
            System.out.println("==================================");
            break;
        case 5:
            if(dictionary.arrayList.isEmpty()){
                System.out.println("Danh sách trống, hãy thêm từ !");
            }
            else {
                this.showAllWords();
                System.out.println("Nhập từ cần sửa: ");
                dictionaryManagement.suaTu();
            }
            System.out.println("==================================");
            break;
        case 6:
            System.out.println(" ------- Hẹn gặp lại !!! --------");
            System.out.println("==================================");
            break;
        default:
            System.out.println("Chỉ được nhập từ 1- 6. Vui lòng nhập lại !!!");
            System.out.println("==================================");
        }
    }
// Phương thức main()
    public static void main(String[] args) {
        DictionaryCommandline dictionaryCommandline= new DictionaryCommandline();
        do {            
            dictionaryCommandline.dictionaryAdvanced();
        } while (dictionaryCommandline.n!= 6);
    }
}
