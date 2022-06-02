public class test {
    public static void main(String[] args) {
        boolean prima = false;
        for (int i = 2; i <=20-1 ; i++) {
            if (20 % i == 0){
                System.out.println(i+ " ini bilangan prima");
                prima = true;
            } if (!prima){
                System.out.println(i+ " ini bukan bilangan prima");
            }

        }
    }
}
