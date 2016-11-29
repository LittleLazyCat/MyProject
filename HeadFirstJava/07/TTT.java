public class TTT {
	public static void main(String[] args) {
		a aa  = new b();
		aa.ff();
		
		System.out.println(aa.a);
		System.out.println(((b)aa).a);
	}
}

class a {
	public int a = 1;
	
	public void ff() {
		System.out.println(a);
	}
}

class b extends a {
	public int a = 2;
	
	public void ff() {
		System.out.println(super.a + " " + this.a);
		super.ff();
	}
}
