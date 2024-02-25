public class Locomotora {
    String matricula;
    int potencia;
    int añoFabricacion;
    Mecanico mecanico;

    public Locomotora(String matricula, int potencia, int añoFabricacion, Mecanico mecanico) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.añoFabricacion = añoFabricacion;
        this.mecanico = mecanico;
    }
}
