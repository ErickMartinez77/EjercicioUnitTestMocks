package ejercicioUnitTestMocks;

import java.util.ArrayList;
import java.util.List;

public class Generador {
    PrimeNumber primeNumber;
    public Generador(){primeNumber = new PrimeNumber();}

    public Generador(PrimeNumber objetoMockeado){
        primeNumber=objetoMockeado;
    }

    public List<Integer> calcularNumeroPrimo(int a) throws Exception {
        List<Integer> numbers = new ArrayList<>();
        if(a<2){
            throw new Exception("Numero no valido");
        }else {
            primeNumber.getPrimeNumber(a);
            esPrimo(a);
        }
        if (esPrimo(a)){
            for (int i = 1; i <= a; i += 2) {
                numbers.add(i);
            }
        } else{
            for (int i = 2; i <= a; i += 2) {
                numbers.add(i);
            }
        }
        return numbers;
    }

    public boolean esPrimo(int n){
        for (int x = 2; x < n / 2; x++) {
            if (n % x == 0){
                return false;
            }
        }
        return true;
    }

//public List<Integer> calcularNumeroPrimo(int num) throws Exception {
//    List<Integer> numbers = new ArrayList<>();
//    if(num<2){
//        throw new Exception("Numero no valido");
//
//    }else if(primeNumber.getPrimeNumber(num)){
//
//        for(int i =1;i<=num;i+=2){
//            numbers.add(i);
//        }
//        System.out.println("Values: "+numbers);
//
//    }else{
//        for(int i =2;i<=num;i+=2){
//            numbers.add(i);
//        }
//        System.out.println("Values: "+numbers);
//    }
//    return numbers;
//}
}
