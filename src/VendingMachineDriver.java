public class VendingMachineDriver {
    public static void main(String[] args) {
        VendingMachine vend = new VendingMachine();

        vend.fillUp(20);

        for(int i = 0;i <= 3; i++) {
            vend.insertToken();

            System.out.println(vend.toString());
        }
    }
}
