public class SumSquareDifference {
    public static void main(String[] args) {
        int solution = sum(10) - factor(10);
        System.out.println(solution);
    }

    public static int factor(int range){
        int result;
        result = 0;
        for(int i = 1; i <= range; i++){
            result += i*i;
        }
        return result;
    }

    public static int sum(int range){
        int sum = 0;
        for (int i = 0; i < range; i++){
            sum += i+1;
        }
        return sum*sum;
    }
}