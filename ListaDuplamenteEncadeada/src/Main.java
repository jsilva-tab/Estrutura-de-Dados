class No{
    int valor;
    No proximo;
    No anterior;

    public No(int valor){
        this.valor = valor;
        this.proximo = null;
        this.anterior = null;
    }
}

class Deque{
    private No inicio;
    private No fim;
    private int tamanho;

    public Deque(){
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public boolean Vazio(){
        return tamanho == 0;
    }

    public void inserirInicio(int valor){
        No newNo = new No(valor);
        if(Vazio()){
            inicio = fim = newNo;
        } else {
            newNo.proximo = inicio;
            inicio.anterior = newNo;
            inicio = newNo;
        }
        tamanho++;
    }

    public void inserirFim(int valor){
        No newNo = new No(valor);
        if(Vazio()){
            inicio = fim = newNo;
        } else {
            newNo.anterior = fim;
            fim.proximo = newNo;
            fim = newNo;
        }
        tamanho++;
    }

    public int removerInicio(){
        if(Vazio()){
            throw new IllegalStateException("Deque Vazio.");
        }
        int valor = inicio.valor;
        if(inicio == fim){
            inicio = fim = null;
        } else {
            inicio = inicio.proximo;
            inicio.anterior = null;
        }
        tamanho--;
        return valor;
    }

    public int removerFim(){
        if(Vazio()){
            throw new IllegalStateException("Deque Vazio.");
        }
        int valor = fim.valor;
        if(inicio == fim){
            inicio = fim = null;
        } else {
            fim = fim.anterior;
            fim.proximo = null;
        }
        tamanho--;
        return valor;
    }

    public int tamanho(){
        return tamanho;
    }

    public void imprimir(){
        No atual = inicio;
        while(atual!=null){
            System.out.print(atual.valor+" ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public void reverso() {
    	No atual = fim;
    	while(atual!=null){
    		System.out.print(atual.valor+" ");
    		atual = atual.anterior;
    	}
    	System.out.println();
    }
}

public class Main{
    public static void main (String[]args){
        Deque deque = new Deque();

        deque.inserirFim(10);
        deque.inserirFim(20);
        deque.inserirInicio(5);
        deque.inserirInicio(2);

        deque.imprimir();

        deque.reverso();

        System.out.println("Removido do início: "+deque.removerInicio());
        System.out.println("Removido do fim: "+deque.removerFim());

        deque.imprimir();
    }
}
