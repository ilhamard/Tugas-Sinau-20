public class TugasPertama {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 50){
            if (i % 5 == 0){
                System.out.println("n habis dibagi 5");
                i++;
            } else if (i % 3 == 0){
                System.out.println("n habis dibagi 3");
                i++;
            }else {
                System.out.println(i);
                i++;
            }
        }
    }
}
