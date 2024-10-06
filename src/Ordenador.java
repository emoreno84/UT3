import javax.sound.midi.VoiceStatus;

public class Ordenador {
    // ATRIBUTOS DE LA CLASE
    public String marca;
    public String modelo;
    public int memoria;
    public int memLibre;
    public int numSwInstalados;


    public Ordenador(String queMarca, String queModelo, int queMemoria){
        this.marca = queMarca;
        this.modelo = queModelo;
        this.memoria = queMemoria;
        this.memLibre = this.memoria;
        this.numSwInstalados = 0;
    }

    // MÉTODOS DE LA CLASE
    public void instalarSW(int memoriaAInstalar){
        if (memLibre < memoriaAInstalar)
        {
            System.out.println("Memoria insufuciente");
        }else
        {
            memLibre = memLibre - memoriaAInstalar;
            numSwInstalados = numSwInstalados + 1;
        }
    }

    public void Formatear(){
        numSwInstalados = 0;
        memLibre = memoria;
    }

    // Metodo que devuelve la suma de la memoria total
    //  y la libre
    public int sumaTotalLibre(){
        int suma;
        suma = memoria + memLibre;
        return suma;
    }

    public int obtenerMemLibre(){
        return memLibre;
    }
}
