import java.time.LocalDate;

class main {
    public static void main(String[] args) {

        cromo C = new cromo(
                1, "Cristiano Ronaldo",
                "Copa do Mundo", "Página 2",
                LocalDate.parse("2020-05-17"), "Velho"
        );
        System.out.println(C);
        C.setLocalizacao("Página 67");
        System.out.println(C);

    }
}