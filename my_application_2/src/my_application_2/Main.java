package my_application_2;

import pack1.A;
//import pack2.B;
import pack3.C;

public class Main {
	public static void main(String[] args) {
		//my_module_a 패키지에 포함된 A 클래스 이용
		A a = new A();
		a.method();
		
		//my_module_a 패키지에 포함된 B클래스 이용
		//B b = new B();
		//b.method();
		
		//my_module_b 패키지에 포함된 C클래스 이용
		C c = new C();
		c.method();
		
		C result = a.getC();
		result.method();
	}
}
