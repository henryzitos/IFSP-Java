public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("1020304050", "Azul", new Motor(150, 8));

        System.out.println(carro.getMotor().getPotencia() + carro.getMotor().getValvulas());

        carro.addRodas(new Roda(26, 32));
        carro.addRodas(new Roda(25, 32));
        carro.addRodas(new Roda(24, 32));
        carro.addRodas(new Roda(23, 32));

        for (Roda roda: carro.getRodas()) {
            System.out.println("Aro da roda:" + roda.getAro());
        }
    }
}
