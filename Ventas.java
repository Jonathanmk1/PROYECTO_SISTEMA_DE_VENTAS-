package Proyecto_paradigmasSV;
//Falta guardar en archivos los datos

import java.io.IOException;
import java.util.ArrayList;
import utilerias.Busqueda;
import utilerias.Lectura;

public class Ventas {

    public static void main(String[] args) throws IOException {
        int resp;
        ArrayList<Principal> pe = new ArrayList();
        do {
            Lectura.imprimirString("Que servicio desea realizar?");
            resp = Lectura.leerInt("1.Recarga\n2.PagoServicio\n3.Pines\n4.Reportes_Ventas_Del_Dia\n"
                    + "5.Consultar_venta\n6.Salir\n");
            switch (resp) {
                case 1: {
                    System.out.println("********************RECARGA*****************************");
                    int id;
                    long numero;
                    String compania, val;
                    float monto;
                    id = Lectura.leerInt("Ingrese id: ");
                    numero = Lectura.leerlong("Ingrese el numero de telefono: ");
                    String no = String.valueOf(numero);
                    while (no.length() > 10) {
                        System.out.println("El numero excede el tamanio de caracteres permitidos");
                        numero = Lectura.leerlong("Ingrese el numero de telefono: ");
                        no = String.valueOf(numero);

                    }
                    while (no.length() < 10) {
                        System.out.println("El numero le faltan caracteres");
                        numero = Lectura.leerlong("Ingrese el numero de telefono: ");
                        no = String.valueOf(numero);

                    }
                    Lectura.imprimirString("Que compania es su red?: (Escriba la compania)");
                    compania = Lectura.leerString("1.Telcel\n2.Movistar\n3.Pillofon\n4.Att\n5.Unefon");

                    Lectura.imprimirString("De cuanto sera la venta?: (Escriba el numero de la venta)");
                    monto = Lectura.leerfloat("1.10\n2.20\n3.30\n4.50\n5.50\n6.100");
                    //quiero que solo acepte los montos del menu. 
                    /*
                    while (monto != 10 || monto != 20 || monto != 30 || monto != 50 || monto != 100) {
                        System.out.println("Montos no existentes");
                        Lectura.imprimirString("De cuanto sera la venta?: (Escriba el numero de la venta)");
                        monto = Lectura.leerfloat("1.10\n2.20\n3.30\n4.50\n5.50\n6.100");
                    }*/

                    val = Lectura.leerString("Esta seguro de realizar la venta? Escriba: si---no");
                    if (val.equalsIgnoreCase("Si")) {
                        pe.add(new Recarga(id, numero, compania, monto));
                        System.out.println("transicion exitosa\n");
                    } else {
                        System.out.println("Venta cancelada\n");
                    }
                }
                break;
                case 2: {
                    System.out.println("*****************************PAGO DE SERVICIO********************");
                    int id;
                    String dependencia, no, val;
                    long referencia;
                    float monto;
                    id = Lectura.leerInt("Ingrese id: ");

                    dependencia = Lectura.leerString("Escriba el nombre de la dependencia:\n"
                            + "1.CFE\n2.Internet\n3.Telefono\n4Agua\n5.Tenencia");

                    referencia = Lectura.leerlong("Ingrese la referencia: ");
                    no = String.valueOf(referencia);
                    while (no.length() > 18) {
                        System.out.println("El numero excede el tamanio de caracteres permitidos");
                        referencia = Lectura.leerlong("Ingrese la referencia: ");
                        no = String.valueOf(referencia);

                    }
                    while (no.length() < 18) {
                        System.out.println("El numero le faltan caracteres");
                        referencia = Lectura.leerlong("Ingrese la referencia: ");
                        no = String.valueOf(referencia);

                    }
                    monto = Lectura.leerfloat("Ingrese el monto a pagar: ");
                    val = Lectura.leerString("Esta seguro de realizar la venta? Escriba: si---no");
                    if (val.equalsIgnoreCase("Si")) {
                        pe.add(new PagoS(id, dependencia, referencia, monto));
                        System.out.println("transicion exitosa\n");
                    } else {
                        System.out.println("Venta cancelada\n");
                    }

                }
                break;
                case 3: {
                    System.out.println("*******************************PINES ELECTRONICOS****************************");
                    int id;
                    String nompin, val;
                    long numero;
                    String correo, no;
                    float monto;

                    id = Lectura.leerInt("Ingrese id: ");
                    //Que lo escriba o que onda?
                    nompin = Lectura.leerString("Que PIN desea comprar?\n1.Microsoft 365\n2.Netflix\n3.Nintendo\n"
                            + "4.Google Play\n5.Spotify\n5.Xbox GamePass");
                    numero = Lectura.leerlong("Ingrese el numero de telefono: ");
                    no = String.valueOf(numero);
                    while (no.length() > 10) {
                        System.out.println("El numero excede el tamanio de caracteres permitidos");
                        numero = Lectura.leerlong("Ingrese el numero de telefono: ");
                        no = String.valueOf(numero);

                    }
                    while (no.length() < 10) {
                        System.out.println("El numero le faltan caracteres");
                        numero = Lectura.leerlong("Ingrese el numero de telefono: ");
                        no = String.valueOf(numero);

                    }
                    correo = Lectura.leerString("Ingrese su correo: ");
                    monto = Lectura.leerfloat("Costo del monto");
                    val = Lectura.leerString("Esta seguro de realizar la venta? Escriba: si---no");
                    if (val.equalsIgnoreCase("Si")) {
                        pe.add(new Pines(id, nompin, numero, correo, monto));
                        System.out.println("transicion exitosa\n");
                    } else {
                        System.out.println("Venta cancelada\n");
                    }
                }
                break;
                case 4: {
                    byte lol;
                    //agregar do while
                    do {
                        lol = Lectura.leerbyte("Que reportes desea ver?\n1.Reportes globales\n"
                                + "2.Recargas\n3.Pago_Servicios\n4.Pines\n5.Regresar");
                        switch (lol) {
                            case 1: {
                                for (int i = 0; i < pe.size(); i++) {
                                    Lectura.imprimirString(pe.get(i).toString());
                                }
                            }
                            break;
                            case 2: {
                                for (int i = 0; i < pe.size(); i++) {
                                    Lectura.imprimirString(((Recarga) pe.get(i)).toString());
                                }
                            }
                            break;
                            case 3: {
                                for (int i = 0; i < pe.size(); i++) {
                                    Lectura.imprimirString(((PagoS) pe.get(i)).toString());
                                }
                            }
                            break;
                            case 4: {
                                for (int i = 0; i < pe.size(); i++) {
                                    Lectura.imprimirString(((Pines) pe.get(i)).toString());
                                }
                            }
                            break;
                        }
                    } while (lol != 5);
                }
                break;
                case 5: {
                    int id, po = -1;
                    id = Lectura.leerInt("Dame Id a consultar:");
                    po = Busqueda.buscaArrayList(pe, id);
                    if (po != -1) {
                        Lectura.imprimirString((pe.get(po)).toString());
                    } else {
                        Lectura.imprimirString("El id=" + id + " no existe");
                    }
                }
                break;
            }
        } while (resp != 6);
    }

}
