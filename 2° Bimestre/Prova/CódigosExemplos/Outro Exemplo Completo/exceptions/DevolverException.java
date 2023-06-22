package exceptions;

public class DevolverException extends Exception{
    public DevolverException(String item) {
        super("Não foi possivel devolver o " + item + ", pois o mesmo não está emprestado!");
    }
}
