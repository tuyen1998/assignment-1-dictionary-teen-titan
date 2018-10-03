<h1 align="center"> Version2: Phiên bản từ điển command line cải tiến lần 1. </h1>
<h3>I. Word.java<br></h3>
<ul>
	<li>
		1. Các thuộc tính:
		<ol>
			String word_target<br>
    			String word_explain<br>
		</ol>
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
		2. Hàm insertFromCommandline():
		<ol>
			public void insertFromCommandline()<br>
			Chức năng:<br>
			- Nhập liệu.
		</ol>
		3. Hàm suaTu():
		<ol>
			public void suaTu()<br>
			Chức năng:<br>
			- Sửa từ đã chọn.
		</ol>
		4. Hàm deleteFromCommandline():
		<ol>
			public void deleteFromCommandline()
			Chức năng:<br>
			- Xóa toàn bộ từ đã thêm.
		</ol>
		5. Hàm dictionaryLookup():
		<ol>
			public void dictionaryLookup()
			Chức năng:<br>
			- Tìm kiếm từ đã thêm.
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
		2. Hàm dictionaryAdvanced():
		<ol>
			public void dictionaryAdvanced()<br>
			Chức năng:<br>
			- Chức năng gọi hàm insertFromCommandline(), dictionaryLookup() và showAllWords().
		</ol>
		3. Main():
		<ol>
			public static void main(String[] args)
		</ol>
  	</li>	
</ul> <hr>
<h3>IV. DictionaryExportToFile.java</h3>
<ul>
   	<li>
      		1. Hàm ghiFile():
		<ol>
			public void ghiFile(ArrayList <Word> list)<br>
			Chức năng:<br>
			- Ghi lại từ vừa thêm.
		</ol>
		2. Hàm docFile():
		<ol>
			public ArrayList docFile()<br>
			Chức năng:<br>
			- Đọc dữ liệu từ file.
		</ol>
  	</li>	
</ul> <hr>
<h2 align="center"> Version3: Phiên bản từ điển command line cải tiến lần 2.(Trang tiếp theo) </h2>
