public class Triangulo extends PoligonoRegular {

    public Triangulo(int numLados, int tamLado) {
        super(numLados, tamLado);
    }
     public float calcularArea(){
        return getTamLado()*getTamLado()/2;


     }
}
