import java.time.LocalDate;

class main {
    public static void main(String[] args) {

        cromos C = new cromos(
                1, "Cristiano Ronaldo",
                "Copa do Mundo", "Página 2",
                LocalDate.parse("2020-05-17")
        );


        System.out.println(C);

    }
}