class Arvore {
	No raiz;
	
	public Arvore() {
		this.raiz = null;
	}
	
	public void insert(int data) {
		raiz = insertRec(raiz, data);
	}
	
	private No insertRec(No raiz, int data) {
		if(raiz == null) {
			raiz = new No(data);
			return raiz;
		}
		
		if(data < raiz.data) {
			raiz.esquerda = insertRec(raiz.esquerda, data);
		} else if(data > raiz.data) {
			raiz.direita = insertRec(raiz.direita, data);
		}
		
		return raiz;
	}
	
	public void inOrder() {
		inOrderRec(raiz);
	}
	
	private void inOrderRec(No raiz) {
		if(raiz != null) {
			inOrderRec(raiz.esquerda);
			System.out.print(raiz.data + " ");
			inOrderRec(raiz.direita);
		}
	}
	
	public void preOrder() {
		preOrderRec(raiz);
	}
	
	private void preOrderRec(No raiz) {
		if(raiz != null) {
			System.out.print(raiz.data + " ");
			preOrderRec(raiz.esquerda);
			preOrderRec(raiz.direita);
		}
	}
	
	public void postOrder() {
		postOrderRec(raiz);
	}
	
	private void postOrderRec(No raiz) {
		if(raiz != null) {
			postOrderRec(raiz.esquerda);
			postOrderRec(raiz.direita);
			System.out.print(raiz.data + " ");
		}
	}
}
