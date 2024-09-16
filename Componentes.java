public class Componentes {
    // atributos: modelo, marca, cor, valor

    private String modelo;
    private String marca;
    private String cor;
    private double valor;

    public Componentes (String modelo, String marca, String cor, double valor) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.valor = valor;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo (String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
      return this.marca;
    }
    public void setMarca (String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return this.cor;
    }
    public void setCor (String cor) {
        this.cor = cor;
    }

    public double getValor() {
        return this.valor;
    }
    public void setValor (double valor) {
         this.valor = valor;
    }

    @override
    public String toString() {
        return "Componentes (" + "modelo="  + modelo + ", marca=" + marca + ", cor=" + cor + ", valor=" + valor + ',';
    }
    
}
