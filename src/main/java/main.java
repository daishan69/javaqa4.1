public class main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        int amount;
        boolean registered;
        long expected = 150;
        long aktual = service.calculate(amount = 5_000 , registered = true);
        System.out.println("1." + expected + "==?==" + aktual);

    }
}
