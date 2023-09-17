import Transporte.TransporteNautico;
import Transporte.TransporteTerrestre;

public class Main {

    public static void main(String[] args) {

        TransporteNautico transporteNautico = new TransporteNautico(15, 15);
        TransporteTerrestre transporteTerrestre = new TransporteTerrestre(15, 15);

        System.out.println(transporteNautico.calculaFrete());
        System.out.println(transporteTerrestre.calculaFrete());

    }
}