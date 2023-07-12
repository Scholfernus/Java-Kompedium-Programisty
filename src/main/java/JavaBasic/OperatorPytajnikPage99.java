package JavaBasic;

public class OperatorPytajnikPage99 {
    public static void main(String[] args) {
        int i = 10;
        int k;
        k = i < 0 ? -1 : 1;
        System.out.print("Wartość bezwzględna z ");
        System.out.println(i + " wynosi " + k);
        i = -10;
        k = i < 0 ? -i : i;
        System.out.print("Wartość bezwzględna z ");
        System.out.println(i + " wynosi " + k);
    }
}
