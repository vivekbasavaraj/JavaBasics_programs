package murachBook;

public class Chap11_1_ProdDBClass {

	public static Chap11_1_ProdClass getProd(String prodCode){
		Chap11_1_ProdClass p=null;
		
		if(prodCode.equalsIgnoreCase("java")||prodCode.equalsIgnoreCase("jsp")){
			Chap11_1_BookClass b=new Chap11_1_BookClass();
			if(prodCode.equalsIgnoreCase("java")){
				b.setCode("Java");
				b.setDesc("Murach's Java Programming");
				b.setPrice(57.60);
				b.setAuthor("Joel Murach");
			}else if(prodCode.equalsIgnoreCase("jsp")){
				b.setCode("Jsp");
				b.setDesc("Murach's Jsp");
				b.setPrice(50.09);
				b.setAuthor("Mike Urban");
			}
			p=b;
		}
		else if(prodCode.equalsIgnoreCase("eclipse")){
			Chap11_1_SoftwareClass s=new Chap11_1_SoftwareClass();
			s.setCode("eclipse");
			s.setDesc("Eclipse");
			s.setPrice(46.60);
			s.setVersion("4.4.2");
			p=s;
		}else if(prodCode.equalsIgnoreCase("sgtp")){
			Chap11_1_AlbumClass a=new Chap11_1_AlbumClass();
			a.setCode("sgtp");
			a.setDesc("Sgt.Peppers");
			a.setPrice(14.99);
			a.setArtist("The Beatles");
			p=a;
		}
		return p;
	}
}
