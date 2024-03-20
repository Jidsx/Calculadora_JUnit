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
 * @author Jean Israel
 * @version 1.1
 * @since Release 1.1 da aplicação
 */
public class CalculadoraJunitTest {

    Soma calc = new Soma();
    Subtracao sub = new Subtracao();
    Multiplicacao mult = new Multiplicacao();
    Divisao div = new Divisao();

    /**
     * Teste de Soma Cenário de teste 1: soma de dois valores, Resultado
     * esperado: 10
     */
    @Test
    public void SomarDoisNumPositivos() {
        //Parametro a seremn utlizados para o teste
        double somar = calc.somar(3, 7);
        //Modelo de comparativo de teste
        assertEquals(10, somar);
    }

    /**
     * Teste de Soma Cenário de teste 2: soma de dois valores sendo um zero,
     * Resultado esperado: 3
     */
    @Test
    public void somarDoisNumComUmZero() {
        //Parametro a seremn utlizados para o teste
        double somar = calc.somar(3, 0);
        //Modelo de comparativo de teste
        assertEquals(3, somar);
    }

    /**
     * Teste de Soma Cenário de teste 3: soma de dois valores sendo que ambos
     * são zero, Resultado esperado: 0
     */
    @Test
    public void SomarDoisNumZeros() {
        //Parametro a seremn utlizados para o teste
        double somar = calc.somar(0, 0);
        //Modelo de comparativo de teste
        assertEquals(0, somar);
    }

    /**
     * Teste de Soma Cenário de teste 4: soma de dois valores sendo um negativo,
     * Resultado esperado: 2
     */
    @Test
    public void SomarDoisNumUmNegativo() {
        //Parametro a seremn utlizados para o teste
        double somar = calc.somar(3, -1);
        //Modelo de comparativo de teste
        assertEquals(2, somar);

    }

    /**
     * Teste de Soma Cenário de teste 5: soma de dois valores sendo dois
     * negativo, Resultado esperado: -4
     */
    @Test
    public void SomarDoisNumNegativos() {
        //Parametro a seremn utlizados para o teste
        double somar = calc.somar(-3, -1);
        //Modelo de comparativo de teste
        assertEquals(-4, somar);
    }

    /**
     * Teste de Soma Cenário de teste Cenário de teste 6: soma de dois valores
     * sendo um quebrado, Resultado esperado: 3.5
     */
    @Test
    public void SomarDoisNumUmQuebrado() {
        //Parametro a seremn utlizados para o teste
        double somar = calc.somar(3, 0.5);
        //Modelo de comparativo de teste
        assertEquals(3.5, somar);
    }

    /**
     * Teste de Subtração Cenário de teste 1: subtração de dois valores,
     * Resultado esperado: -4
     */
    @Test
    public void SubtrairDoisNumPositivos() {
        //Parametro a seremn utlizados para o teste
        double subtrair = sub.subtracao(3, 7);
        //Modelo de comparativo de teste
        assertEquals(-4, subtrair, 0);
    }

    /* ====================================================================================================================== */
    /**
     * Teste de Subtração Cenário de teste 2: subtração de dois valores sendo um
     * zero, Resultado esperado: 3
     */
    @Test
    public void SubtrairDoisNumComUmZero() {
        //Parametro a seremn utlizados para o teste
        double subtrair = sub.subtracao(3, 0);
        //Modelo de comparativo de teste
        assertEquals(3, subtrair, 0);
    }

    /**
     * Teste de Subtração Cenário de teste 3: subtração de dois valores sendo
     * ambos zero, Resultado esperado: 0
     */
    @Test
    public void SubtrairDoisNumZeros() {
        //Parametro a seremn utlizados para o teste
        double subtrair = sub.subtracao(0, 0);
        //Modelo de comparativo de teste
        assertEquals(0, subtrair, 0);
    }

    /**
     * Teste de Subtração Cenário de teste 4: subtração de dois valores sendo um
     * negativo, Resultado esperado: 4
     */
    @Test
    public void SubtrairDoisNumUmNegativo() {
        //Parametro a seremn utlizados para o teste
        double subtrair = sub.subtracao(3, -1);
        //Modelo de comparativo de teste
        assertEquals(4, subtrair, 0);
    }

    /**
     * Teste de Subtração Cenário de teste 5: subtração de dois valores sendo
     * dois negativos, Resultado esperado: -2
     */
    @Test
    public void SubtrairDoisNumNegativos() {
        //Parametro a seremn utlizados para o teste
        double subtrair = sub.subtracao(-3, -1);
        //Modelo de comparativo de teste
        assertEquals(-2, subtrair, 0);
    }

    /**
     * Teste de Subtração Cenário de teste 6: subtração de dois valores sendo um
     * quebrado, Resultado esperado: 2.5
     */
    @Test
    public void SubtrairDoisNumUmQuebrado() {
        //Parametro a seremn utlizados para o teste
        double subtrair = sub.subtracao(3, 0.5);
        //Modelo de comparativo de teste
        assertEquals(2.5, subtrair, 0);
    }

    /* ====================================================================================================================== */
    /**
     * Teste de Multiplicação Cenário de teste 1: multiplicação de dois valores,
     * Resultado esperado: 21
     */
    @Test
    public void MultiplicarDoisNumPositivos() {
        //Parametro a seremn utlizados para o teste
        double multiplicar = mult.multiplicacao(3, 7);
        //Modelo de comparativo de teste
        assertEquals(21, multiplicar, 0);
    }

    /**
     * Teste de Multiplicação Cenário de teste 2: multiplicação de um dos
     * valores por zero, Resultado esperado: 0
     */
    @Test
    public void MultiplicarUmNumPorZero() {
        //Parametro a seremn utlizados para o teste
        double multiplicar = mult.multiplicacao(3, 0);
        //Modelo de comparativo de teste
        assertEquals(0, multiplicar, 0);
    }

    /**
     * Teste de Multiplicação Cenário de teste 3: multiplicação de ambos os
     * valores por zero, Resultado esperado: 0
     */
    @Test
    public void MultiplicarAmbosNumPorZero() {
        //Parametro a seremn utlizados para o teste
        double multiplicar = mult.multiplicacao(0, 0);
        //Modelo de comparativo de teste
        assertEquals(0, multiplicar, 0);
    }

    /**
     * Teste de Multiplicação Cenário de teste 4: multiplicação de um dos
     * valores por um negativo, Resultado esperado: -3
     */
    @Test
    public void MultiplicarUmNumPorNegativo() {
        //Parametro a seremn utlizados para o teste
        double multiplicar = mult.multiplicacao(3, -1);
        //Modelo de comparativo de teste
        assertEquals(-3, multiplicar, 0);
    }

    /**
     * Teste de Multiplicação Cenário de teste 5: multiplicação de ambos os
     * valores negativos, Resultado esperado: 3
     */
    @Test
    public void MultiplicarAmbosNumNegativos() {
        //Parametro a seremn utlizados para o teste
        double multiplicar = mult.multiplicacao(-3, -1);
        //Modelo de comparativo de teste
        assertEquals(3, multiplicar, 0);
    }

    /**
     * Teste de Multiplicação Cenário de teste 6: multiplicação de um valor
     * quebrado, Resultado esperado: 1.5
     */
    @Test
    public void MultiplicarUmNumQuebrado() {
        //Parametro a seremn utlizados para o teste
        double multiplicar = mult.multiplicacao(3, 0.5);
        //Modelo de comparativo de teste
        assertEquals(1.5, multiplicar, 0);
    }

    /* ====================================================================================================================== */
    /**
     * Teste de Divisão Cenário de teste 1: divisão de dois valores, Resultado
     * esperado: 0.43
     */
    @Test
    public void DividirDoisNumPositivos() {
        //Parametro a seremn utlizados para o teste
        double dividir = div.divisao(3, 7);
        //Modelo de comparativo de teste
        assertEquals(0.43, dividir, 0.01); // Utilizando delta para lidar com a precisão de números de ponto flutuante
    }

    /**
     * Teste de Divisão Cenário de teste 2: divisão por zero, Resultado
     * esperado: Double.POSITIVE_INFINITY
     */
    @Test
    public void DividirPorZero() {
        //Parametro a seremn utlizados para o teste
        double dividir = div.divisao(3, 0);
        //Modelo de comparativo de teste
        assertEquals(Double.POSITIVE_INFINITY, dividir, 0); // Divisão por zero retorna Double.POSITIVE_INFINITY
    }

    /**
     * Teste de Divisão Cenário de teste 3: divisão de zero por zero, Resultado
     * esperado: Double.NaN
     */
    @Test
    public void DividirZeroPorZero() {
        //Parametro a seremn utlizados para o teste
        double dividir = div.divisao(0, 0);
        //Modelo de comparativo de teste
        assertEquals(Double.NaN, dividir, 0); // Divisão de zero por zero retorna Double.NaN
    }

    /**
     * Teste de Divisão Cenário de teste 4: divisão de um valor por um negativo,
     * Resultado esperado: -3
     */
    @Test
    public void DividirPorNegativo() {
        //Parametro a seremn utlizados para o teste
        double dividir = div.divisao(3, -1);
        //Modelo de comparativo de teste
        assertEquals(-3, dividir, 0); // Delta é 0 porque estamos lidando com números inteiros
    }

    /**
     * Teste de Divisão Cenário de teste 5: divisão de ambos os valores
     * negativos, Resultado esperado: 3
     */
    @Test
    public void DividirAmbosPorNegativos() {
        //Parametro a seremn utlizados para o teste
        double dividir = div.divisao(-3, -1);
        //Modelo de comparativo de teste
        assertEquals(3, dividir, 0); // Delta é 0 porque estamos lidando com números inteiros
    }

    /**
     * Teste de Divisão Cenário de teste 6: divisão de um valor quebrado,
     * Resultado esperado: 6
     */
    @Test
    public void DividirUmNumQuebrado() {
        //Parametro a seremn utlizados para o teste
        double dividir = div.divisao(3, 0.5);
        //Modelo de comparativo de teste
        assertEquals(6, dividir, 0); // Delta é 0 porque estamos lidando com números inteiros
    }

}
