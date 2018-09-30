package version1;

import java.util.Scanner;


public class DictionaryCommandline {
    Dictionary dictionary= new Dictionary();
    DictionaryManagement dictionaryManagement= new DictionaryManagement();
    Word w= new Word();
    int n;
    
    public DictionaryCommandline() {}
    
// Phương thức showAllWords()
    public void showAllWords(){
        dictionaryManagement.hienThiTu();
    }
// Phương thức dictionaryBasic()
    public void dictionaryBasic(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập 1: Thêm từ.");
        System.out.println("Nhập 2: Xem toàn bộ từ đã thêm.");
        System.out.println("Nhập 3: Kết thúc.");
        System.out.print("Nhập số... ");
        n= scan.nextInt();
        System.out.print("==================================");
        System.out.println();
        switch(n){
            case 1:
                dictionaryManagement.insertFromCommandline();
                System.out.println("==================================");
                break;
            case 2:
                this.showAllWords();
                System.out.println("==================================");
                break;
            case 3:
                break;
            default:
                System.out.println("Chỉ được nhập từ 1- 3. Vui lòng nhập lại !!!");
                System.out.println("==================================");
        }
    }

// Vòng lặp
    public void loof(){
        System.out.println();
        while(n== 1 || n== 2){
            this.dictionaryBasic();
        }
        System.out.println();
    }
    
// Phương thức main()
    public static void main(String[] args) {
        DictionaryCommandline dictionaryCommandline= new DictionaryCommandline();
        dictionaryCommandline.dictionaryBasic();
        dictionaryCommandline.loof();
    }

}
