package cuentas;
/***
 * La clase main se encarga de simular operaciones de una cuenta bancaria
 * inicia una cuenta bancaria y realiza varias operaciones como ver saldo disponible y retiradas y depositos de dinero
 * @author mayan
 */


public class Main {
/**
 * El metodo main sirve para iniciar la entrada al programa
 * en el se inicia la cuenta y empieza las operaciones con esta
 * @param args argumentos
 */
    public static void main(String[] args) {
        CCuenta cuenta1; //variable de la cuenta bancaria
        double saldoActual; //variable que guarda el saldo disponible

        operativa_cuenta(); //llama al metodo a hacer las operaciones oportunas
    }
/***
 * realiza las operaciones de consulta de saldo, retiradas y depositos,
 * crea un nuevo objeto CCuenta que realiza las siguientes operaciones:
 * retirada de cantidad especifica de saldo
 * ingreso de una cantidad especificia
 * consulta de disponible
 */
    private static void operativa_cuenta() {
        CCuenta cuenta1;//declaracion del nuevo objeto
        double saldoActual;//variable con el saldo actual
        float cantidad;//variable con la cantidad a retirar o ingresar
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);//creacion de cuenta con nombre, numero de cuenta y saldo disponible
        saldoActual = cuenta1.estado();//recoge el saldo actual y lo imprime por consola
        System.out.println("El saldo actual es"+ saldoActual );
        //intenta retirar dinero y maneja las posibles excepciones
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar"); //imprime por consola que la retirada no fue producida
        }
        //intenta ingresar dinero y maneja las posibles excepciones
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar"); //imprime por consola que no se ha podido ingresar el dinero
        }
    }
}
