public class App {
    public static void main(String[] args){
        EcuacionSegundoGrado Ec1 = new EcuacionSegundoGrado(1, 10, 2);

        System.out.println("El discriminante es positivo: "+Ec1.discriminantePositivo());
        
        System.out.println("La primera solucion es: "+Ec1.solucionPositiva());
        System.out.println("La segunda solucion es: "+Ec1.solucionNegativo());
        

    }
}
