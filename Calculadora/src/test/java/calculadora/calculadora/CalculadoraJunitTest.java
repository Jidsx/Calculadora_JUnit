package calculadora.calculadora;

import java.text.DecimalFormat;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jeani
 */
public class CalculadoraJunitTest {

    @Test
    public void SomarDoisNum() {
        //Teste de Soma

        Soma calc = new Soma();

        //Cenário de teste 1: soma de dois valores, Resultado esperado: 10
        double somar = calc.somar(3, 7);
        assertEquals(10, somar);

        //Cenário de teste 2: soma de dois valores sendo um zero, Resultado esperado: 3
        somar = calc.somar(3, 0);
        assertEquals(3, somar);

        //Cenário de teste 3: soma de dois valores sendo que ambos são zero, Resultado esperado: 0
        somar = calc.somar(0, 0);
        assertEquals(0, somar);

        //Cenário de teste 4: soma de dois valores sendo um negativo, Resultado esperado: 2
        somar = calc.somar(3, -1);
        assertEquals(2, somar);

        //Cenário de teste 5: soma de dois valores sendo dois negativo, Resultado esperado: -4
        somar = calc.somar(-3, -1);
        assertEquals(-4, somar);

        //Cenário de teste 6: soma de dois valores sendo um quebrado, Resultado esperado: 3.5
        somar = calc.somar(3, 0.5);
        assertEquals(3.5, somar);

    }
    
    @Test
    public void SubtrairDoisNum() {
        //Teste de Subtracao

        Subtracao sub = new Subtracao();

        //Cenário de teste 1: subtracao de dois valores, Resultado esperado: -4
        double subtra = sub.subtracao(3, 7);
        assertEquals(-4, subtra);

        //Cenário de teste 2: subtracao de dois valores sendo um zero, Resultado esperado: 3
        subtra = sub.subtracao(3, 0);
        assertEquals(3, subtra);

        //Cenário de teste 3: subtracao de dois valores sendo ambos zero, Resultado esperado: 0
        subtra = sub.subtracao(0, 0);
        assertEquals(0, subtra);

        //Cenário de teste 4: subtracao de dois valores sendo um negativo, Resultado esperado: 4
        subtra = sub.subtracao(3, -1);
        assertEquals(4, subtra);

        //Cenário de teste 4: subtracao de dois valores sendo dois negativo, Resultado esperado: -2
        subtra = sub.subtracao(-3, -1);
        assertEquals(-2, subtra);

        //Cenário de teste 6: subtracao de dois valores sendo um quebrado, Resultado esperado: 2.5
        subtra = sub.subtracao(3, 0.5);
        assertEquals(2.5, subtra);
    }
    
    @Test
    public void MultiplicarDoisNum() {
        //Teste de Multiplicacao

        Multiplicacao mult = new Multiplicacao();

        //Cenário de teste 1: multiplicacao de dois valores, Resultado esperado: 21
        double multi = mult.multiplicacao(3, 7);
        assertEquals(21, multi);

        //Cenário de teste 2: multiplicacao de dois valores sendo um zero, Resultado esperado: 0
        multi = mult.multiplicacao(3, 0);
        assertEquals(0, multi);

        //Cenário de teste 3: multiplicacao de dois valores sendo ambos zero, Resultado esperado: 0
        multi = mult.multiplicacao(0, 0);
        assertEquals(0, multi);

        //Cenário de teste 4: multiplicacao de dois valores sendo um negativo, Resultado esperado: -3
        multi = mult.multiplicacao(3, -1);
        assertEquals(-3, multi);

        //Cenário de teste 4: multiplicacao de dois valores sendo dois negativo, Resultado esperado: 3
        multi = mult.multiplicacao(-3, -1);
        assertEquals(3, multi);

        //Cenário de teste 6: multiplicacao de dois valores sendo um quebrado, Resultado esperado: 1.5
        multi = mult.multiplicacao(3, 0.5);
        assertEquals(1.5, multi);
    }
    
    @Test
    public void DividirDoisNum(){
        //Teste de Divisao
        
        Divisao div = new Divisao();
        
        // Cenário de teste 1: divisao de dois valores, Resultado esperado: 0.43
        double divi = div.divisao(3, 7);
        assertEquals(0.43, divi, 0.01); // Utilizando delta para lidar com a precisão de números de ponto flutuante

        // Cenário de teste 2: divisao de dois valores sendo um zero, Resultado esperado: ?
        divi = div.divisao(3, 0);
        assertEquals(Double.POSITIVE_INFINITY, divi, 0); // Divisão por zero retorna Double.POSITIVE_INFINITY

        // Cenário de teste 3: divisao de dois valores sendo ambos zero, Resultado esperado: ?
        divi = div.divisao(0, 0);
        assertEquals(Double.NaN, divi, 0); // Divisão de zero por zero retorna Double.NaN

        // Cenário de teste 4: divisao de dois valores sendo um negativo, Resultado esperado: -3
        divi = div.divisao(3, -1);
        assertEquals(-3, divi, 0); // Delta é 0 porque estamos lidando com números inteiros

        // Cenário de teste 5: divisao de dois valores sendo dois negativo, Resultado esperado: 3
        divi = div.divisao(-3, -1);
        assertEquals(3, divi, 0); 

        // Cenário de teste 6: divisao de dois valores sendo um quebrado, Resultado esperado: 6
        divi = div.divisao(3, 0.5);
        assertEquals(6, divi, 0);
    }

}
