package murachBook;

public class Chap11_1_AlbumClass extends Chap11_1_ProdClass{

	public String artist;
	
	public Chap11_1_AlbumClass(){
		super();
		artist="";
		count++;
	}
	public void setArtist(String artist){
		this.artist=artist;
	}
	public String getArtist(){
		return artist;
	}
	@Override
	public String toString(){
		return super.toString()+" ("+artist+")";
	}
}
