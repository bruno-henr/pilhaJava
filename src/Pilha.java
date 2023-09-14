public class Pilha {
    private No head;

    public Pilha() {
        this.head = null;
    }

    public void  push(No novoNo) {

        if(this.isEmpty()) {
            this.head = novoNo;
        } else {
            No aux = this.head;
            novoNo.setProx(aux);
            head = novoNo;
        }
    }

    public No pop() {
        if(!this.isEmpty()) {
            No aux = this.head;
            this.head = this.head.getProx();
            return aux;
        }
        return null;
    }

    @Override
    public String toString() {
        String s = "--------------------\n";
        s += "   Pilha      \n";
        s += "----------------------\n";
        No aux = this.head;
        while(true) {
            if(aux != null) {
                s += "[No { Dado = " + aux.getDado() +" } ]\n";
                aux = aux.getProx();
            } else {
                break;
            }
        }
        s += "------------\n";
        return s;
    }

    public No top() {
        return this.head;
    }
    public boolean isEmpty() {
        return this.head == null;
    }
}
