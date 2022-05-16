package digital.innovation.one.metodos.Java;

public class Main {
    public static void main(String[] args) {
        // Calculadora
        System.out.println("Exercício da Calculadora");
        Calculadora.soma(5, 15);
        Calculadora.subtracao(10,2.5);
        Calculadora.multiplicacao(15,8);
        Calculadora.divisao(10,2.5);

        // Mensagem
        System.out.println("Exercício da mensagem");
        Mensagem.obterMensagem(10);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(22);

        // Empréstimo
        System.out.println("Exercício do empréstimo");
        Emprestimo.calculo(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calculo(2000, Emprestimo.getTresParcelas());
        Emprestimo.calculo(3000, 10);
    }
}
