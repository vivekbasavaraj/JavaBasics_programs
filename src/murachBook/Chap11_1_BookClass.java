package murachBook;

public class Chap11_1_BookClass extends Chap11_1_ProdClass{
	
	private String author;
	
	public Chap11_1_BookClass(){
		super();
		author="";
		count++;
	}
	public void setAuthor(String author){
		this.author=author;
	}
	public String getAuthor(){
		return author;
	}
	@Override
	public String toString(){
		return super.toString()+" by " + author;
	}

}
