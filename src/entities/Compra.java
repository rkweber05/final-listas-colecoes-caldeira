package entities;

public class Compra implements Comparable<Compra> {
    private String descricao;
    private double valor;

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compra " +
                "descricao = '" + descricao +
                ", valor = " + valor;
    }

    @Override
    public int compareTo(Compra o) {
//        return  this.getValor().compareTo(o.getValor());
//        não funciona pois o valor é do tipo primitivo um double, usamos a sintaxe abaixo para
        return Double.valueOf(this.valor).compareTo(Double.valueOf(o.getValor()));
    }
}
