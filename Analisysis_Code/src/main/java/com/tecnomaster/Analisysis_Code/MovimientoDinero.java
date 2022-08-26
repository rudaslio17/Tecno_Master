package com.tecnomaster.Analisysis_Code;

public class MovimientoDinero {
    //Atributos
    private double monto;
    private boolean tipoMonto; //Donde False: Es un movimiento negativo y True: Es un movimiento positivo
    private String conceptoMovimiento;
    private Empleado usuario; // Usuario es un objeto de la clase empleado

    //Constructor
    public MovimientoDinero(double monto, String conceptoMovimiento, Empleado usuario) {
        this.monto = monto;
        if(monto < 0){
            tipoMonto = false;
        }else{
            tipoMonto = true;
        }
        this.conceptoMovimiento = conceptoMovimiento;
        this.usuario = usuario;
    }


    //Getter y Setters

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }



    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public Empleado getUsuario() {
        return usuario;
    }

    public void setUsuario(Empleado usuario) {
        this.usuario = usuario;
    }

    public void setTipo(boolean tipoMonto) {
        this.tipoMonto = tipoMonto;
    }

    public boolean isTipoMonto() {
        return tipoMonto;
    }
    



    //Metodo toString

    @java.lang.Override
    public java.lang.String toString() {
        return "com.tecnomaster.Analisysis_Code.MovimientoDinero{" +
                "monto=" + monto +
                ", tipoMonto=" + tipoMonto +
                ", conceptoMovimiento='" + conceptoMovimiento + '\'' +
                ", usuario=" + usuario.getNombreEmpleado() +
                '}';

  
    }

    public void tipoMonto(){
        if(tipoMonto){
            System.out.println("El monto creado es positivo");
        }else{
            System.out.println("El monto creado es negativo");
        }
    }
}
