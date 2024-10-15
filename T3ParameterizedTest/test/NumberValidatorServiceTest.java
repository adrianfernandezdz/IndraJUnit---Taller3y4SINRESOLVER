package Taller3.T3ParameterizedTest.test;

import java.util.stream.Stream;

import Taller3.T3ParameterizedTest.services.NumberValidatorService;
import org.junit.jupiter.params.provider.Arguments;

public class NumberValidatorServiceTest {

    private final NumberValidatorService numberProperties = new NumberValidatorService();


    // Test parametrizado para verificar si un número es primo usando @ValueSource
    public void testIsPrime_ValidPrimes(int number) {
    }

    // Test parametrizado para verificar no primos usando @ValueSource
    public void testIsPrime_NotPrimes(int number) {
    }

    // Test parametrizado para verificar si un número es par usando @ValueSource
    public void testIsEven_EvenNumbers(int number) {
    }

    // Test parametrizado para verificar que un número NO es par usando @ValueSource
    public void testIsEven_OddNumbers(int number) {
    }

    // Test parametrizado para verificar si un número es positivo usando @ValueSource
    public void testIsPositive_PositiveNumbers(int number) {
    }

    // Test parametrizado para verificar si un número NO es positivo usando @ValueSource
    public void testIsPositive_NotPositiveNumbers(int number) {
    }

    // Test parametrizado para verificar la combinación de propiedades usando @MethodSource
    public void testValidateNumberProperties(int number, boolean expectedIsPrime, boolean expectedIsEven, boolean expectedIsPositive, boolean expected) {
    }

    // Método que proporciona datos para el test de validateNumberProperties
    static Stream<Arguments> provideNumberPropertiesData() {
        return null;
    }
}
