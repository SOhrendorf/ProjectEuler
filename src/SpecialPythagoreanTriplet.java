public class SpecialPythagoreanTriplet {
    public static void main(String[] args) {
        for (int a = 1; a < 1000; a++){
            for (int b = 2; b < 1000; b++){
                for (int c  = 3; c < 1000; c++){
                    if(a+b+c==1000 && a <b && b <c && Pythagorean(a,b,c)){
                        System.out.println(a + " " + b + " " + c);
                        break;
                    }
                }
            }
        }
    }

    public static boolean Pythagorean(int a, int b, int c){
        return (a*a)+(b*b) == (c*c);
    }
}
