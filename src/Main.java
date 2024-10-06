//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

/*        Ordenador miOrden = new Ordenador("HP", "Victus", 512);
        System.out.println(miOrden.memLibre);
        System.out.println(miOrden.numSwInstalados);
        miOrden.instalarSW(25);

        miOrden.Formatear();*/

        int edad;

        edad = 10;

        if (edad < 13){
            System.out.println("Se trata de un niño");
        } else if (edad < 18) {
            System.out.println("Se trata de un adolescente");
        } else if (edad < 65) {
            System.out.println("Se trata de un adulto");
        }else {
            System.out.println("Se trata de un jubilado");
        }


    }
}