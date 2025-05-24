public class MainRPG {

    public static void main(String[] args) {
        Personagem[] personagens = {
                new Guerreiro("Thorin"),
                new Mago("Gandalf"),
                new Arqueiro("Legolas")
        };

        System.out.println("=== Turno de combate ===");
        for (Personagem p : personagens) {
            p.atacar();
        }
    }

}
