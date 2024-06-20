class car{
	public void horn() {
		System.out.println(" car 3type horns ");
	}
	public void styring() {
		System.out.println(" carround and 23cm");
	}
	public void light() {
		System.out.println(" car 2type light ");
	}
}
class alto extends car{
	public void horn() {
		System.out.println( " alto 2type horns");
	}
	public void styring() {
		System.out.println(" alto round and 20cm");
	}
	
}
class thar extends car{
	public void light() {
		System.out.println( " thar 4 type light ");
	}
	public void styring() {
		System.out.println(" thar round and 24cm");
	}
	
}


public class BasicPoly {

	public static void main(String[] args) {
		alto a1=new alto();
          a1.horn();
          a1.styring();
          a1.light();
          
          thar t1=new thar();  
         
          t1.styring();
          t1.light();
          t1.horn();
          
	}

}
