package br.dio.exceptions;

public class InvalidParametersException extends RuntimeException {
    public InvalidParametersException(String message) {
        super(message);
    }
}
