public class SumSquareDifference {
    public static void main(String[] args) {
        System.out.println(sum(10));
        System.out.println(factor(10));
        int solution = sum(10) - factor(10);
        System.out.println(solution);
    }

    public static int factor(int range){
        int fac = 1;
        for (int i = 0; i < range; i++){
            fac = fac*fac;
            fac++;
        }
        return fac;
    }

    public static int sum(int range){
        int sum = 0;
        for (int i = 0; i < range; i++){
            i++;
            sum = sum + i;
            System.out.println(sum);
        }
        System.out.println("summe: " + sum);
        return sum*sum;
    }
}

