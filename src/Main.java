import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite limite do cartão:");
        double limiteCartao = leitor.nextDouble();

        CartaoCredito cartaoCredito = new CartaoCredito(limiteCartao);

        int sair = 1;
        while (sair != 0){

            System.out.println("Descrição da compra:");
            String descricaoCompra = leitor.next();

            System.out.println("Digite o valor da compra:");
            double valorCompra = leitor.nextDouble();

            Compras compras = new Compras(descricaoCompra, valorCompra);
            boolean compraEfetuada = cartaoCredito.lancaCompra(compras);

            if (compraEfetuada){
                System.out.println("Compra realizada !");
                System.out.println("Digite 0 para sair ou 1 para continuar comprando: ");
                sair = leitor.nextInt();
            } else {
                System.out.println("Compra não realizada");
                System.out.println("Sem limite para compra!");
                System.out.println("Digite 0 para sair ou 1 para continuar comprando: ");
                sair = leitor.nextInt();
            }

        }

        leitor.close();

        System.out.println("\n****************************");
        System.out.println("COMPRAS REALIZADAS: \n");
        Collections.sort(cartaoCredito.getCompras());
        for (Compras listaDeCompras : cartaoCredito.getCompras()) {
            System.out.println(listaDeCompras.getDescricaoCompra() + " - " + "R$ " + listaDeCompras.getValorCompra());
        }

        System.out.println("\n****************************\n");

        System.out.println("Saldo Restante : R$ " + cartaoCredito.getSaldo());
        System.out.println("Limite Total: R$ " + cartaoCredito.getLimite());

    }
}