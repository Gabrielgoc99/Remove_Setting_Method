package code_smell;

public class Televisao {
    private String marca;
    private String modelo;
    private float valor;
    private int tamanho;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }


    public String cadastrarTelevisao() {
        return "Televisao{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", valor=" + valor +
                ", tamanho=" + tamanho +
                '}';
    }
}

