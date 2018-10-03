
import java.io.Serializable;
import java.util.Objects;

public class Word implements Serializable{ 
// Serializable chuyển đổi các đối tượng thành stream.
    protected String word_target;
    protected String word_explain;
// Khởi tạo không đối tượng
    public Word(){}
// Khởi tạo đầy đủ
    public Word(String word_target, String word_explain) {
        this.word_target = word_target;
        this.word_explain = word_explain;
    }
// Phương thức get-set
    public String getWord_target() {
        return word_target;
    }

    public void setWord_target(String word_target) {
        this.word_target = word_target;
    }

    public String getWord_explain() {
        return word_explain;
    }

    public void setWord_explain(String word_explain) {
        this.word_explain = word_explain;
    }
}
