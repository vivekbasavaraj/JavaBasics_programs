package murachBook;

public class Chap11_1_SoftwareClass extends Chap11_1_ProdClass{

	private String version;
	
	public Chap11_1_SoftwareClass(){
		super();
		version="";
		count++;
	}
	
	public void setVersion(String version){
		this.version=version;
	}
	public String getVersion(){
		return version;
	}
	@Override
	public String toString(){
		return super.toString()+" "+version;
	}
}
