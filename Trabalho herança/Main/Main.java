package Main;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setMarca("Honda");
        carro.setModelo("NSX");
        carro.setNumeroPortas(2);
        
        Moto moto = new Moto();
        moto.setMarca("Honda");
        moto.setModelo("POP 110i");
        moto.setCilindrada(110);
        
        System.out.println("Carro escolhido: " + carro.getMarca() + " " + carro.getModelo() + " com " + carro.getNumeroPortas() + " portas.");
        System.out.println("Moto escolhida: " + moto.getMarca() + " " + moto.getModelo() + " de " + moto.getCilindrada() + " cilindradas.");
    }
}