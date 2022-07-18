public class OperacaoBasicaTeste extends OperacaoBasica {

    public static boolean testar_soma (){
        return somar(5, 3) == 8;
    }

    public static boolean testar_subtracao(){
        return subtrair(5, 3) == 2;
    }

    public static boolean testar_multiplicacao(){
        return multiplicar(5, 3) == 15;
    }

    public static boolean testar_divisao(){
        return dividir(9, 3) == 3;
    }

}
