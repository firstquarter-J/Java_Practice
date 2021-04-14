class Cal1{
    int v1,v2;
    Cal1(int v1, int v2) {
    	System.out.println("Cal init!!");
    	this.v1 = v1; this.v2 = v2;
    }
    public int sum() {
    	return this.v1+v2;
    }
}
class Cal4 extends Cal1{

	Cal4(int v1, int v2) {
		super(v1, v2);
		System.out.println("Cal3 init!!");
	}
	public int minus() {
		return this.v1-v2;
	}
    
}
public class InheritanceApp2 {
    public static void main(String[] args) {
    	
        Cal1 c = new Cal1(2,1);
 
        Cal4 c4 = new Cal4(2,1);
        System.out.println(c4.sum()); // 3
        System.out.println(c4.minus()); // 1
    }
}