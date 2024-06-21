public class Compras implements Comparable<Compras>{

    private String descricaoCompra;
    private double valorCompra;

    public Compras(String descricaoCompra, double valorCompra){
        this.descricaoCompra =descricaoCompra;
        this.valorCompra = valorCompra;
    }

    public String getDescricaoCompra() {
        return descricaoCompra;
    }

    public double getValorCompra() {
        return valorCompra;
    }
//
//    @Override
//    public String toString() {
//        return "Compras: \n" +
//               "descricao =" + descricaoCompra +
//               " valor = R$ " + valorCompra;
//    }

    @Override
    public int compareTo(Compras outraCompra) {
        return Double.valueOf(this.valorCompra).compareTo(Double.valueOf(outraCompra.valorCompra));
    }
}
