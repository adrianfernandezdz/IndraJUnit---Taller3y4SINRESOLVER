package Taller4.T4Mockito;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;

public class PaymentProcessorServiceTest {

    // aquí inicializaremos los mocks necesarios y servicios necesarios

    // Test de processPayment (Mockito: usaremos patrón: whenThenReturn, y matchers: anyString() y eq())
    // Podremos comprobar el resultado utilizando un assert de JUnit
    @Test
    public void testProcessPayment_Success() {
    }

    // Test de refundPayment (Mockito: usaremos patrón: whenThenReturn, y matchers: anyString() y eq())
    // Podremos comprobar el resultado utilizando un assert de JUnit
    @Test
    public void testRefundPayment_Success() {
    }

    // Test de la excepción de refundPayment (Mockito: usaremos patrón: whenThenThrow, y matchers: anyString() y anyDouble())
    // Podremos comprobar si se lanza la excepción o no con un assert de JUnit.
    @Test
    public void testRefundPayment_ThrowsException() {
    }

    // Test de validateCardDetails (Mockito: usaremos patrón: whenThenReturn, y matchers: argThat para comprobar
    // que el cardNumber empieza por 4, en ese caso verificamos la tarjeta. Usaremos también anyString()
    // Podremos comprobar el resultado utilizando un assert de JUnit
    @Test
    public void testValidateCardDetails_CustomMatcher() {
    }

    // Test de makeFullPayment (Mockito: usaremos patrón: whenThenReturn y whenThenCallRealMethod (para el método verifyCard
    // de paymentGatewayService, y matchers: anyString(), anyDouble().
    // Podremos comprobar el resultado utilizando un assert de JUnit
    @Test
    public void testMakeFullPayment_RealMethodCall() {
    }

    // Test de processPayment (Mockito: usaremos patrón: whenThenReturn) para comprobar un caso fallido.
    // y matchers: anyString(), anyDouble().
    // Podremos comprobar el resultado falido utilizando un assert de JUnit
    @Test
    public void testProcessPayment_Failure() {
    }
}