package cuentas;
/**
 * la clase CCuenta represta una cuenta bancaria con operaciones basicas como
 * deposito de dinero y retirada y vonsulta de efectivo, ademas contiene informacion
 * de la cuenta y el dueño de esta
 * @author mayan
 */

public class CCuenta {

    //Setters y getters de todos los parametros necesarios
    
    /***
     * getter del nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**setter del nombre
     * @param nombre del titular
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**getter del numero de cuenta
     * @return numero de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**setter del numero de cuenta
     * @param cuenta numero de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**getter del saldo
     * @return  saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**setter del saldo disponible
     * @param saldo disponible
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**getter del tipo de interes
     * @return tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**setter tipo de interes
     * @param tipoInterés de la cuenta
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }


    private String nombre;              //Nombre del titular
    private String cuenta;              //Numero de cuenta
    private double saldo;               //saldo actual de la cuenta
    private double tipoInterés;         //tipo de interes de la cuenta

    /***
     * Constructor de CCuenta. Inicia una cuenta vacia
     */
    public CCuenta()
    {
    }

    /**
     * Constructor de Ccuenta con informacion especifica.
     * 
     * @param nom Nombre del titular
     * @param cue Numero de cuenta
     * @param sal Saldo de la cuenta
     * @param tipo Tipo de Interes de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    //devuelve el saldo actual de la cuenta
    public double estado() //metodo para recibir el saldo de la cuenta
    {
        return getSaldo();
    }

    /**Desposita una cantidad de dinero en la cuenta
     * lanza una excepcion si la cantidad es negativa
     * @param cantidad a ingresar
     * @throws java.lang.Exception excepcion si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**retira una cantidad de dinero en la cuenta
     * lanza una excepcion si la cantidad es negativa o si no hay fondos suficientes
     * @param cantidad a retirar
     * @throws java.lang.Exception excepcion si la cantidad es negativa o no hay suficiente dinero
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
