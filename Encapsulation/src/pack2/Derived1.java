package pack2;

import pack1.Base1;

public class Derived1 extends Base1{
	
	public Derived1() {
		super ();
	}

	public void test() {
		prof=1;
		pubf=2;
		System.out.println(prof+pubf);
	}
}
