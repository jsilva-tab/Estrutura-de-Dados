public class Main {
	public static void main(String[]args) {
		Arvore arv = new Arvore();
		
		arv.insert(1);
		arv.insert(2);
		arv.insert(10);
		arv.insert(4);
		arv.insert(15);
		arv.insert(6);

		System.out.println("Em ordem: ");
		arv.inOrder();
		System.out.println();
		
		System.out.println("Em pré-ordem: ");
		arv.preOrder();
		System.out.println();
		
		System.out.println("Em pós-ordem: ");
		arv.postOrder();
		System.out.println();
	}
}
