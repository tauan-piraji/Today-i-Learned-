public class EstruturaEstatica <T>{
    private T[] elements;
    private int tamanho;

    public EstruturaEstatica(int capacidade){
        this.elements = (T[])new Object[capacidade];
        this.tamanho = 0;
    }

    public EstruturaEstatica(){
        this(10);
    }

    public boolean adciona(T element){
        this.aumentaCapacidade();
        if(this.tamanho < this.elements.length){
            this.elements[this.tamanho] = element;
            this.tamanho ++;
            return true;
        }
        return false;
    }

    public boolean adiciona(int posicao, T element){
        if(!(posicao>= 0 && posicao < this.tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }

        this.aumentaCapacidade();

        for(int i=this.tamanho-1; i>=posicao; i--){
            this.elements[i+1]= this.elements[i];
        }
        this.elements[posicao]= element;
        this.tamanho++;

        return true;
    }

    private void aumentaCapacidade(){
        if(this.tamanho == this.elements){
            T[] newElements = (t[]) new object[this.elements.length *2];
        }
        for(int i=0; i< this.elements.length;i++){
            this.newElements[i]=this.elements[i];
        }
        this.elements=newElements;
    }

    public int tamanho(){
        return this.tamanho;
    }

    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");

        for(int i=o;i<this.tamanho-1;i++){
            s.append(this.element[i]);
            s.append(", ");
        }

        if(this.tamanho >0){
            s.append(this.elements[this.tamanho-1]);
        }

        s.append("]");
        
        return s.toString();
    }
}