import br.dio.Counter;
import br.dio.exceptions.InvalidParametersException;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bem vindo");
        System.out.println("Digite o Valor do primeiro parâmetro");
        int firstParameter = scanner.nextInt();
        System.out.println("Digite o Valor do primeiro parâmetro");
        int secondParameter = scanner.nextInt();

        try {
            Counter.count(firstParameter, secondParameter);
        } catch (InvalidParametersException ex){
            System.out.println(ex.getMessage());
        }


    }
}