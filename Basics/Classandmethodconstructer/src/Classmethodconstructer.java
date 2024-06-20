

class hj{
	String name;
	String tittle;
    int page;
    
    public hj(String name,String tittle, int page) {
    	
    	this.page=page;
    	this.name=name;
    	this.tittle=tittle;
    }
    void n() {
    	System.out.println(tittle);
    	System.out.println(name);
    	System.out.println(page);
    }
    
    
}
public class Classmethodconstructer {

	public static void main(String[] args) {
		
         hj me1=new hj("Apj kalam","wingsoffire",89);
         me1.n();
         hj me2=new hj("Sree krishna","life",100);
         me2.n();
	}

}
