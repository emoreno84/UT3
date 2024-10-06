public class Pistola {
    // ATRIBUTOS DE LA CLASE
    public String modelo;
    public int numBalas;
    public int numMaximoBalas;

    // MÉTODOS DE LA CLASE
    public void Disparar(){
        numBalas = numBalas - 1;
    }

    public void Recargar(){
        numBalas = numMaximoBalas;
    }

    public int obtenerNumBalas(){
        return numBalas;
    }

}
