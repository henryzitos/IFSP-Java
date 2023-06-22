package exceptions;

public class EmprestarException extends Exception {
    public EmprestarException(String item) {
        super("O " + item + " já está emprestado!");
    }
}
