package murachBook;

import java.text.NumberFormat;

public class Chap4_2_1_AreaPerSetGet {

		private double len;
		private double wid;
		public double getLen() {
			return len;
		}
		public void setLen(double len) {
			this.len = len;
		}
		public double getWid() {
			return wid;
		}
		public void setWid(double wid) {
			this.wid = wid;
		}
		public Chap4_2_1_AreaPerSetGet(){
			len=0.0;
			wid=0.0;
		}
		/*public Chap4_2_1(double len,double wid){
			this.len=len;
			this.wid=wid;
		}*/
		public Chap4_2_1_AreaPerSetGet(double rl,double rw){
			len=rl;wid=rw;
		}
		public double getArea(){
			return len*wid;
		}
		public String getFarea(){
			NumberFormat nr=NumberFormat.getNumberInstance();
			nr.setMinimumFractionDigits(3);
			return(nr.format(len*wid));
		}
		public double getPer(){
			return 2*wid+2*len ;
		}
		public String getFper(){
			NumberFormat nr=NumberFormat.getNumberInstance();
			nr.setMinimumFractionDigits(3);
			return(nr.format(2*wid+2*len));	
		}
}
