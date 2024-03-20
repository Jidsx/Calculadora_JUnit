package calculadora.calculadora;

import java.text.DecimalFormat;

/**
 *
 * @author Jean Israel
 * @version 1.0
 * @since Release 1.0 da aplicação
 */

public class CalculadoraMain {

    public static void main(String[] args) {
        Soma calc = new Soma();

        System.out.println("Teste de Soma:");

        //Cenário de teste 1: soma de dois valores, Resultado esperado: 10
        double somar = calc.somar(3, 7);
        System.out.println(somar);

        //Cenário de teste 2: soma de dois valores sendo um zero, Resultado esperado: 3
        somar = calc.somar(3, 0);
        System.out.println(somar);

        //Cenário de teste 3: soma de dois valores sendo que ambos são zero, Resultado esperado: 0
        somar = calc.somar(0, 0);
        System.out.println(somar);

        //Cenário de teste 4: soma de dois valores sendo um negativo, Resultado esperado: 2
        somar = calc.somar(3, -1);
        System.out.println(somar);

        //Cenário de teste 5: soma de dois valores sendo dois negativo, Resultado esperado: -4
        somar = calc.somar(-3, -1);
        System.out.println(somar);

        //Cenário de teste 6: soma de dois valores sendo um quebrado, Resultado esperado: 3.5
        somar = calc.somar(3, 0.5);
        System.out.println(somar);

        System.out.println("\nTeste de Subtracao:");

        Subtracao sub = new Subtracao();

        //Cenário de teste 1: subtracao de dois valores, Resultado esperado: -4
        double subtra = sub.subtracao(3, 7);
        System.out.println(subtra);

        //Cenário de teste 2: subtracao de dois valores sendo um zero, Resultado esperado: 3
        subtra = sub.subtracao(3, 0);
        System.out.println(subtra);

        //Cenário de teste 3: subtracao de dois valores sendo ambos zero, Resultado esperado: 0
        subtra = sub.subtracao(0, 0);
        System.out.println(subtra);

        //Cenário de teste 4: subtracao de dois valores sendo um negativo, Resultado esperado: 4
        subtra = sub.subtracao(3, -1);
        System.out.println(subtra);

        //Cenário de teste 4: subtracao de dois valores sendo dois negativo, Resultado esperado: -2
        subtra = sub.subtracao(-3, -1);
        System.out.println(subtra);

        //Cenário de teste 6: subtracao de dois valores sendo um quebrado, Resultado esperado: 2.5
        subtra = sub.subtracao(3, 0.5);
        System.out.println(subtra);
        
        System.out.println("\nTeste de Multiplicacao:");
        
        Multiplicacao mult = new Multiplicacao();
        
        //Cenário de teste 1: multiplicacao de dois valores, Resultado esperado: 21
        double multi = mult.multiplicacao(3, 7);
        System.out.println(multi);
        
        //Cenário de teste 2: multiplicacao de dois valores sendo um zero, Resultado esperado: 0
        multi = mult.multiplicacao(3, 0);
        System.out.println(multi);

        //Cenário de teste 3: multiplicacao de dois valores sendo ambos zero, Resultado esperado: 0
        multi = mult.multiplicacao(0, 0);
        System.out.println(multi);

        //Cenário de teste 4: multiplicacao de dois valores sendo um negativo, Resultado esperado: -3
        multi = mult.multiplicacao(3, -1);
        System.out.println(multi);

        //Cenário de teste 4: multiplicacao de dois valores sendo dois negativo, Resultado esperado: 3
        multi = mult.multiplicacao(-3, -1);
        System.out.println(multi);

        //Cenário de teste 6: multiplicacao de dois valores sendo um quebrado, Resultado esperado: 1.5
        multi = mult.multiplicacao(3, 0.5);
        System.out.println(multi);
        
        System.out.println("\nTeste de Divisao:");
        
        Divisao div = new Divisao();
        
        //Cenário de teste 1: divisao de dois valores, Resultado esperado: 0.43
        double divi = div.divisao(3, 7);
        System.out.println(new DecimalFormat("#.##").format(divi));
        
        //Cenário de teste 2: divisao de dois valores sendo um zero, Resultado esperado: ?
        divi = div.divisao(3, 0);
        System.out.println(new DecimalFormat("#.##").format(divi));

        //Cenário de teste 3: divisao de dois valores sendo ambos zero, Resultado esperado: Nan
        divi = div.divisao(0, 0);
        System.out.println(new DecimalFormat("#.##").format(divi));

        //Cenário de teste 4: divisao de dois valores sendo um negativo, Resultado esperado: -3
        divi = div.divisao(3, -1);
        System.out.println(new DecimalFormat("#.##").format(divi));

        //Cenário de teste 4: divisao de dois valores sendo dois negativo, Resultado esperado: 3
        divi = div.divisao(-3, -1);
        System.out.println(new DecimalFormat("#.##").format(divi));

        //Cenário de teste 6: divisao de dois valores sendo um quebrado, Resultado esperado: 6
        divi = div.divisao(3, 0.5);
        System.out.println(new DecimalFormat("#.##").format(divi));

    }

}
