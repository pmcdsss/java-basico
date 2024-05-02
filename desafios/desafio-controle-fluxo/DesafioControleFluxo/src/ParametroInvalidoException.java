public class ParametroInvalidoException extends Exception {
    ParametroInvalidoException() {
        super("O segundo parâmetro deve ser maior que o primeiro.");
    }
}
