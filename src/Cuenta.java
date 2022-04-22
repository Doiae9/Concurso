public class Cuenta {
    private String nombre;
    private int saldo;

    public Cuenta(String nombre, int saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
        System.out.println("Alta de cuenta exitosa");
    }

    public Cuenta() {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }


}
