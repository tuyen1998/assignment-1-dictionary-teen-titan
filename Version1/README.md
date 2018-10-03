## Version1: Phiên bản từ điển command line sơ khai.
<b>
<ul>
	Word.java<br>
	<li>
		1. Các thuộc tính:
		<ol>
			String word_target<br>
    			String word_explain<br>
		</ol>
		2. Phương thức Getter và Setter:
		<ol>
			public String getWord_target()
			public void setWord_target(String word_target)
			public String getWord_explain()
			public void setWord_explain(String word_explain)
		</ol>
  	</li>
	Dictionary.java<br>
  	<li>
      		1. Mảng Word
		<ol>
			ArrayList<Word> arrayList= new ArrayList<Word>()
		</ol>
  	</li>
	DictionaryManagement.java<br>
  	<li>
		1. Phương thức khởi tạo không đối tượng
		<ol>
			public DictionaryManagement()
		</ol>
		2. Hàm insertFromCommandline()
		<ol>
			public void insertFromCommandline()<br>
			Chức năng:<br>
			- Nhập liệu.
		</ol>
		3. Hàm hienThiTu()
		<ol>
			public void hienThiTu()<br>
			Chức năng:<br>
			- Hiển thị toàn bộ từ đã thêm.
		</ol>
  	</li>
	DictionaryCommandline.java<hr>
   	<li>
      		1. Hàm showAllWords()
		<ol>
			public void showAllWords()<br>
			Chức năng:<br>
			- Gọi lại hàm hienThiTu() của class DictionaryManagement để hiển thị toàn bộ từ đã thêm.
		</ol>
		2. Hàm dictionaryBasic()
		<ol>
			public void dictionaryBasic()<br>
			Chức năng:<br>
			- Chức năng gọi hàm insertFromCommandline() và showAllWords().
		</ol>
		3. Main()
		<ol>
			public static void main(String[] args)
		</ol>
  	</li>
</ul>
</b>
