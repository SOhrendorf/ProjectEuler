public class PrimeFactor {
    public static void main(String[] args) {
        System.out.println(samlestMultiple());
    }

    public static int samlestMultiple(){
        int i = 1;
        while (true){
            i++;
            if(i % 11 == 0 && i % 12 == 0 && i % 13 == 0 && i % 14 == 0 && i % 15 == 0 && i % 16 == 0 && i % 17 == 0 && i % 18 == 0 && i % 19 == 0 && i % 20 == 0){
                return i;
            }
        }
    }
}
