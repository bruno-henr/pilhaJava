public class Pilha {
    private No head;

    public Pilha() {
        this.head = null;
    }

    public void  push(No novoNo) {
        if(this.isEmpty()) {
            this.head = novoNo;
        }
        No aux = this.head;
        novoNo.setProx(aux);
        head = novoNo;
    }

    public No pop() {
        if(!this.isEmpty()) {
            No aux = this.head;
            this.head = this.head.getProx();
            return aux;
        }
        return null;
    }

    public No top() {
        return this.head;
    }
    public boolean isEmpty() {
        return this.head == null;
    }
}
