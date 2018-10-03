<h1 align="center"> Version1: Phiên bản từ điển command line sơ khai. </h1>
<h3>I. Word.java<br></h3>
<ul>
	<li>
		1. Các thuộc tính:
		<ol>
			String word_target<br>
    			String word_explain<br>
		</ol>
  	</li>
	<li>
		2. Phương thức Getter và Setter:
		<ol>
			public String getWord_target()<br>
			public void setWord_target(String word_target)<br>
			public String getWord_explain()<br>
			public void setWord_explain(String word_explain)<br>
		</ol>
  	</li>
</ul> <hr>
<h3>II. Dictionary.java<br></h3>
<ul>
  	<li>
      		1. Mảng Word:
		<ol>
			ArrayList<Word> arrayList= new ArrayList<Word>()
		</ol>
  	</li>
</ul> <hr>
<h3>III. DictionaryManagement.java<br></h3>
<ul>
  	<li>
		1. Phương thức khởi tạo không đối tượng:
		<ol>
			public DictionaryManagement()
		</ol>
  	</li>
	<li>
		2. Hàm insertFromCommandline():
		<ol>
			public void insertFromCommandline()<br>
			Chức năng:<br>
			- Nhập liệu.
		</ol>
  	</li>
	<li>
		3. Hàm hienThiTu():
		<ol>
			public void hienThiTu()<br>
			Chức năng:<br>
			- Hiển thị toàn bộ từ đã thêm.
		</ol>
  	</li>
</ul> <hr>
<h3>IV. DictionaryCommandline.java</h3>
<ul>
   	<li>
      		1. Hàm showAllWords():
		<ol>
			public void showAllWords()<br>
			Chức năng:<br>
			- Gọi lại hàm hienThiTu() của class DictionaryManagement để hiển thị toàn bộ từ đã thêm.
		</ol>
  	</li>
	<li>
		2. Hàm dictionaryBasic():
		<ol>
			public void dictionaryBasic()<br>
			Chức năng:<br>
			- Chức năng gọi hàm insertFromCommandline() và showAllWords().
		</ol>
  	</li>	
	<li>
		3. Main():
		<ol>
			public static void main(String[] args)
		</ol>
  	</li>	
</ul> <hr>
<h2 align="center"> Version2: Phiên bản từ điển command line cải tiến lần 1.(Trang tiếp theo) </h2>
