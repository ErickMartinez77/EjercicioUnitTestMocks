package primeTest;

import ejercicioUnitTestMocks.Generador;
import ejercicioUnitTestMocks.PrimeNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class PrimeTest {
    PrimeNumber primeNumberMock = Mockito.mock(PrimeNumber.class);
    @Test
    public void verifyPrimeNumberA() throws Exception{
        Mockito.when(primeNumberMock.getPrimeNumber(11)).thenReturn(true);
        Generador generador = new Generador(primeNumberMock);
        List<Integer> actualResult = generador.calcularNumeroPrimo(11);
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(1);
        expectedResult.add(3);
        expectedResult.add(5);
        expectedResult.add(7);
        expectedResult.add(9);
        expectedResult.add(11);
        Assertions.assertEquals(expectedResult, actualResult,"ERROR la respuesta es incorrecta");

        Mockito.verify(primeNumberMock).getPrimeNumber(11);
    }

    @Test
    public void verifyPrimeNumberB() throws Exception{
        Mockito.when(primeNumberMock.getPrimeNumber(21)).thenReturn(true);
        Generador generador = new Generador(primeNumberMock);
        List<Integer> actualResult = generador.calcularNumeroPrimo(21);
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(2);
        expectedResult.add(4);
        expectedResult.add(6);
        expectedResult.add(8);
        expectedResult.add(10);
        expectedResult.add(12);
        expectedResult.add(14);
        expectedResult.add(16);
        expectedResult.add(18);
        expectedResult.add(20);
        Assertions.assertEquals(expectedResult, actualResult,"ERROR la respuesta es incorrecta");

        Mockito.verify(primeNumberMock).getPrimeNumber(21);
    }

    @Test
    public void verifyPrimeNumberC()throws Exception{
        Mockito.when(primeNumberMock.getPrimeNumber(8)).thenReturn(true);
        Generador generador = new Generador(primeNumberMock);
        List<Integer> actualResult = generador.calcularNumeroPrimo(8);
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(2);
        expectedResult.add(4);
        expectedResult.add(6);
        expectedResult.add(8);
        Assertions.assertEquals(expectedResult, actualResult,"ERROR la respuesta es incorrecta");

        Mockito.verify(primeNumberMock).getPrimeNumber(8);
    }
}
