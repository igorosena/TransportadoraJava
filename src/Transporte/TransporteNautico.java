package Transporte;

public class TransporteNautico extends Transporte{

    public TransporteNautico(int largura, int altura){

        super (altura, largura);
    }
    @Override
    public double calculaFrete(){

        return getAltura() + getLargura() * 0.1;
    }
}