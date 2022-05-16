package digital.innovation.one.metodos.Java;
/* Classe de exemplo para o exercício da Aula 1 de Métodos */
public class Emprestimo {
    public static int getDuasParcelas() {
        return 2;
    }

    public static int getTresParcelas() {
        return 3;
    }

    public static double getTaxaDuasParcelas() {
        return 0.5;
    }

    public static double getTaxaTresParcelas() {
        return 0.65;
    }

    public static void calculo(double valor, int parcelas) {
        if (parcelas == 2 ) {
            double valorFinal = valor + (valor * getTaxaDuasParcelas());
            System.out.println("Valor final do empréstimo para 2 parcelas: R$ " + valorFinal);
        } else if (parcelas == 3) {
            double valorFinal = valor + (valor * getTaxaTresParcelas());
            System.out.println("Valor final do empréstimo para 3 parcelas: R$ " + valorFinal);
        } else {
            System.out.println("Quantidade de parcelas não foram aprovadas. Por favor, tente novamente.");
        }
    }
}
