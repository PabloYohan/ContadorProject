package br.dio;

import br.dio.exceptions.InvalidParametersException;

public class Counter {

    public static void count(int a, int b){
        if(b > a) {
            throw new InvalidParametersException("O segundo parâmetro deve ser maior que o segundo");
        }

        int quantity = b - a;

        for(int i = 0; i < quantity; i++){
            System.out.printf("Imprimindo o número %s \n", i+1);
        }
    }
}
