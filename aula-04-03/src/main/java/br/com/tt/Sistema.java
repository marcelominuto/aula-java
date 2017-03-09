package br.com.tt;

public class Sistema {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.setNome("Toto");
		
		Animal a2 = new Animal();
		a2.setNome("Rex");
		
		System.out.println(a1.getNome());
		System.out.println(a2.getNome());
		//fibonacci(5L);
	}
	
//	private static void fibonacci(Long i){
//		Long f1 = i-1L;
//		Long f2 = i-2L;
//		Long fib = f1 + f2;
//		System.out.println(fib);
//		if(!(fib >= Long.MAX_VALUE)){
//		fibonacci(fib);
//		} else {
//			return;
//		}
//	}
}