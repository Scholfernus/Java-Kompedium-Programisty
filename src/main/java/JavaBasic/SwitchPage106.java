package JavaBasic;

public class SwitchPage106 {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            switch (i){
                case 0:
                    System.out.println("i wynosi zero.");
                    break;
                case 1:
                    System.out.println("i wynosi jeden.");
                    break;
                case 2:
                    System.out.println("i wynosi dwa.");
                    break;
                case 3:
                    System.out.println("i wynosi trzy.");
                    break;
                case 4:
                    System.out.println("i wynosi cztery.");
                    break;
                case 5:
                    System.out.println("i wynosi pięć.");
                    break;
                default:
                    System.out.println("i jest większa niż 6");
            }
        }
    }
}
