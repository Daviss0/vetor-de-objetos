public class VetorObjeto {
    
    private Object[] elementos;
    private int tamanho;

    public VetorObjeto (int capacidade) {
        this.elementos = new Object[5];
        this.tamanho = 0;
    }
    
    public void aumentarCapacidade () {
        if (this.tamanho == this.elementos.length) {
            Object[] novoElemento = new Object [this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                novoElemento[i] = this.elementos[i];
            }
            this.elementos = novoElemento;
        }
    }

    public void adicionar (Object elemento) throws Exception {
        this.aumentarCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        }
        else {
            throw new Exception ("Não é possivel adicionar novos elementos, vetor cheio");
        }
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public int setTamaho(int tamanho) {
        return this.tamanho = tamanho;
    }

    @Override
        public String toString () {
            StringBuilder  s = new StringBuilder();
            s.append("[");
            for (int i = 0;  i < this.tamanho-1; i++) {
                s.append(this.elementos[i]);
                s.append(", ");
            }

            if (this.tamanho > 0) {
                s.append(this.elementos[this.tamanho - 1]);
            }
            s.append("]");
            return s.toString();
        }

        public Object busca (int posicao) throws Exception {
            if  (posicao  >=0 && posicao < tamanho) {
                return elementos[posicao];
            }
            else {
                throw new Exception ("posicao invalida");
            }
        }

        public int busca1 (Object elemento) {
            for (int i = 0; i < tamanho;i++) {
                if (elementos[i].equals(elemento)) {
                    return i;
                }
            }
            return - 1;
        }

        public boolean adicionarInicio (int posicao, Object elemento) throws Exception {
            this.aumentarCapacidade();
            if (posicao >=0 && posicao < tamanho) {
            for (int i = this.tamanho-1; i > posicao; i--) {
                this.elementos[i + 1]  = this.elementos[i];
            }
            this.elementos[posicao] = elemento;
            this.tamanho++;
           } 
           else {
            throw new Exception ("posição invalida");
           }
           return true;
        }

        public void remove (int posicao) throws Exception {
            if (posicao >=0 && posicao < tamanho) {
                for (int i = posicao; i < this.tamanho - 1; i++) {
                    this.elementos[i] = this.elementos[i + 1];
                }
                this.tamanho--;
            }
            else {
                throw new Exception ("posicao invalida");
            }
        }
}


/* 
 * 
public class VetorObjeto {
    private Object[] elementos;
    private int tamanho;

    public VetorObjeto (int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho  = 0;
    }

    public void adicionar (Object elemento) throws Exception {
            this.aumentarCapacidade();
            if (this.tamanho <this.elementos.length) {
                this.elementos[this.tamanho] = elemento;
                this.tamanho++;
            }
            else {
                throw new Exception ("o vetor ja  esta cheio, " +
                 "nao é possivel adicionar novos elementos");
            }
        }
        public int tamanho () {
            return this.tamanho;
        }
        @Override
        public String toString () {
            StringBuilder  s = new StringBuilder();
            s.append("[");
            for (int i = 0;  i < this.tamanho-1; i++) {
                s.append(this.elementos[i]);
                s.append(", ");
            }

            if (this.tamanho > 0) {
                s.append(this.elementos[this.tamanho - 1]);
            }
            s.append("]");
            return s.toString();
        }

        public Object busca (int posicao) throws Exception {
            if  (posicao  >=0 && posicao < tamanho) {
                return elementos[posicao];
            }
            else {
                throw new Exception ("posicao invalida");
            }
        }

        public int busca1 (Object elemento) {
            for (int i = 0; i < tamanho;i++) {
                if (elementos[i].equals(elemento)) {
                    return i;
                }
            }
            return - 1;
        }

        public boolean adicionarInicio (int posicao, Object elemento) throws Exception {
            this.aumentarCapacidade();
            if (posicao >=0 && posicao < tamanho) {
            for (int i = this.tamanho-1; i > posicao; i--) {
                this.elementos[i + 1]  = this.elementos[i];
            }
            this.elementos[posicao] = elemento;
            this.tamanho++;
           } 
           else {
            throw new Exception ("posição invalida");
           }
           return true;
        }

        public void aumentarCapacidade () {
            if (this.tamanho == this.elementos.length) {
                Object elementosNovos[] = new String [this.elementos.length *  2];
                for (int i = 0; i < this.elementos.length; i++) {
                    elementosNovos[i] = this.elementos[i];
                }
                this.elementos = elementosNovos;
            }
        }

        public void remove (int posicao) throws Exception {
            if (posicao >=0 && posicao < tamanho) {
                for (int i = posicao; i < this.tamanho - 1; i++) {
                    this.elementos[i] = this.elementos[i + 1];
                }
                this.tamanho--;
            }
            else {
                throw new Exception ("posicao invalida");
            }
        }    

}

*/