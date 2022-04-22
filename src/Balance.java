import java.util.ArrayList;
import java.util.Scanner;
public class Balance {
    public static void main(String[] args) {
        int respuesta, Cargo, Abono;
        String BuscarC, BuscarA;

        Scanner leer = new Scanner(System.in);
        ArrayList<Cuenta> Activo = new ArrayList<>();
        ArrayList<Cuenta> Pasivo = new ArrayList<>();
        do {
        System.out.println("¿Que desea hacer?");
        System.out.println("1) Dar de alta una cuenta de activo");
        System.out.println("2) Dar de alta una cuenta de pasivo");
        System.out.println("3) Mostrar cuentas de activo y pasivo");
        System.out.println("4) Cargo");
        System.out.println("5) Abono");
        System.out.println("6) Balance General ");
        System.out.println("7) Salir");
        respuesta = leer.nextInt();


            switch (respuesta) {
                case 1:
                    Cuenta nuevaA = new Cuenta();
                    System.out.println("Ingrese el nombre de la cuenta");
                    nuevaA.setNombre(leer.next());
                    System.out.println("ingrese el saldo de la cuenta// Debe comenzar como cero");
                    nuevaA.setSaldo(leer.nextInt());
                    Activo.add(nuevaA);
                    break;
                case 2:
                    Cuenta nuevaP = new Cuenta();
                    System.out.println("Ingrese el nombre de la cuenta");
                    nuevaP.setNombre(leer.next());
                    System.out.println("ingrese el saldo de la cuenta// Debe comenzar como cero");
                    nuevaP.setSaldo(leer.nextInt());
                    Pasivo.add(nuevaP);
                    break;
                case 3:
                    System.out.println("Cuentas Activo");
                    for (int i = 0; i < Activo.size(); i++) {
                        System.out.println(i + 1 + ". " + Activo.get(i).getNombre());
                    }
                    System.out.println("");
                    System.out.println("Cuentas Pasivo");
                    for (int j = 0; j < Pasivo.size(); j++) {
                        System.out.println(j + 1 + ". " + Pasivo.get(j).getNombre());
                    }
                    break;
                case 4:
                    System.out.println("Coloque el nombre de la cuenta Comenzando con Mayus");
                    System.out.println("En cual cuenta desea Cargar?");
                    BuscarC = leer.next();
                    int ElementoBuscarAC=0;
                    int ElementoBuscarPC=0;
                    for (int i = 0; i < Activo.size(); i++) {
                        ElementoBuscarAC=Activo.get(i).getNombre().indexOf(BuscarC);
                    }
                    for (int i =0; i<Pasivo.size(); i++) {
                       ElementoBuscarPC= Pasivo.get(i).getNombre().indexOf(BuscarC);
                    }
                    if (ElementoBuscarAC != -1) {
                        System.out.println("Su cuenta se encuentra en Activo");
                        System.out.println("Ingrese el monto del cargo");
                        Cargo = leer.nextInt();
                        int Total = Activo.get(ElementoBuscarAC).getSaldo() + Cargo;
                        Activo.get(ElementoBuscarAC).setSaldo(Total);
                    } else if (ElementoBuscarPC != -1) {
                        System.out.println("Su cuenta se encuentra en Pasivo");
                        System.out.println("Ingrese el monto del cargo");
                        Cargo = leer.nextInt();
                        int Total = Pasivo.get(ElementoBuscarPC).getSaldo() + Cargo;
                        Pasivo.get(ElementoBuscarPC).setSaldo(Total);
                    }
                  else {
                        System.out.println("Su cuenta no existe");
                    }
                    //Cargo
                    break;
                case 5:
                    System.out.println("Coloque el nombre de la cuenta Comenzando con Mayus");
                    System.out.println("En cual cuenta desea Abonar?");
                    BuscarA = leer.next();
                    int ElementoBuscarAA =0;
                    int ElementoBuscarPA = 0;
                    for (int i = 0; i < Activo.size(); i++) {
                        ElementoBuscarAA=Activo.get(i).getNombre().indexOf(BuscarA);
                    }
                    for (int i =0; i<Pasivo.size(); i++) {
                        ElementoBuscarPA= Pasivo.get(i).getNombre().indexOf(BuscarA);
                    }
                    if (ElementoBuscarAA != -1) {
                        System.out.println("Su cuenta se encuentra en Activo");
                        System.out.println("Ingrese el monto del cargo");
                        Abono = leer.nextInt();
                        int Total = Activo.get(ElementoBuscarAA).getSaldo() - Abono;
                        Activo.get(ElementoBuscarAA).setSaldo(Total);
                    }
                     else if (ElementoBuscarPA != -1) {
                        System.out.println("Su cuenta se encuentra en Pasivo");
                        System.out.println("Ingrese el monto del cargo");
                        Abono = leer.nextInt();
                        int Total = Pasivo.get(ElementoBuscarPA).getSaldo() - Abono;
                        Pasivo.get(ElementoBuscarPA).setSaldo(Total);
                    }
                     else{
                        System.out.println("Esta cuenta no existe");
                    }
                    //Abono
                    break;
                case 6:
                    int TotalA = 0, TotalP = 0, Total;
                    System.out.println("Cuentas Activo");
                    for (int i = 0; i < Activo.size(); i++) {
                        System.out.println(1 + "." + Activo.get(i).getNombre());
                        for (Cuenta cuenta : Activo) {
                            TotalA += Activo.get(i).getSaldo();
                            Activo.get(i).setSaldo(TotalA);
                        }
                    }

                    System.out.println("Suma de Activo "+TotalA);
                    System.out.println("Cuentas Pasivo");
                    for (int i = 0; i < Pasivo.size(); i++) {
                        System.out.println(1 + "." + Pasivo.get(i).getNombre());
                        for (Cuenta cuenta : Pasivo) {
                            TotalP += Activo.get(i).getSaldo();
                            Activo.get(i).setSaldo(TotalP);}
                    }
                    System.out.println("Suma Pasivo"+ TotalP);
                    Total=TotalA+TotalP;
                    System.out.println("Capital "+ Total);
                    break;
            }
        } while (respuesta != 7);

    }

}
        
