public class TugasKedua {
    public static void main(String[] args) {

        int nilai = 20;
        for (int i = 1; i <= nilai ; i++) {
            int angka = 0;
            for (int j = 1; j <=i ; j++) {
            if (i % j == 0){
                angka = angka + 1;
            }
                }
                if (angka==2){
                    System.out.println(i+ " bilangan prima");
                } else {
                    System.out.println(i+ " bukan bilangan prima");
                }
        }
    }
}
