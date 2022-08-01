package ExtruturadeDados;

public class RodaAplicacao {
    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.setCor("Preto");
        carro1.setModelo("Audi R8");
        carro1.setCapacidadeTanque(85);


        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.TotalValordoTanque(6.46));
    }
}
