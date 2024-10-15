package Taller3.T3ParameterizedTest.test;

import java.util.stream.Stream;

import Taller3.T3ParameterizedTest.services.FormValidatorService;
import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FormValidatorServiceTest {

    FormValidatorService formValidatorService = new FormValidatorService();

    // Test parametrizado para validar nombres válidos usando @ParameterizedTest y @ValueSource
    public void testValidateName_ValidNames(String name) {

    }

    // Test parametrizado para validar nombres inválidos usando @ParameterizedTest y @ValueSource
    public void testValidateName_InvalidNames(String name) {

    }

    // Test parametrizado para validar edades válidas usando @ParameterizedTest y @ValueSource
    public void testValidateAge_ValidAges(int age) {
    }

    // Test parametrizado para validar edades inválidas usando @ParameterizedTest y @ValueSource
    public void testValidateAge_InvalidAges(int age) {
    }

    // Test parametrizado para validar correos electrónicos válidos usando @ParameterizedTest y @ValueSource
    public void testValidateEmail_ValidEmails(String email) {
    }

    // Test parametrizado para validar correos electrónicos inválidos usando @ParameterizedTest y @ValueSource
    public void testValidateEmail_InvalidEmails(String email) {
    }

    // Test parametrizado para validar contraseñas válidas usando @ParameterizedTest y @ValueSource
    public void testValidatePassword_ValidPasswords(String password) {
    }

    // Test parametrizado para validar el form usando @ParameterizedTest y @CsvSource
    public void testValidateForm_ValidForm(String name, int age, String email, String password) {
    }

    // Método que provee los argumentos para el test de formularios válidos e inválidos
    static Stream<Arguments> provideFormData() {
        return null;
    }

    // Test parametrizado para validar el formulario completo usando @MethodSource
    public void testValidateForm(String name, int age, String email, String password, boolean expected) {
    }
}
