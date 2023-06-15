package sigmoid;

public class homeWorkInit {

    public static void main(String[] args) {
        // sigmoid:
        // S(x) = 1 / (1 + e^(-x))
        // S = pr^2

        int x = 12;
        int x1 = 14;


        // стандартная реализация формулы
        double result1 = (Math.PI * (Math.pow(x, 2) )) *40;
        System.out.println(result1);

        double result2 = (Math.PI * (Math.pow(x1, 2) )) *40;
        System.out.println(result2);

        double result3 = result2 -result1;
        System.out.println(result3);


//        // SigmoidOne
//        sigmoidOne s1 = new sigmoidOne(x);
//
//        // SigmoidTwo
//        sigmoidTwo s2 = new sigmoidTwo(x);
    }
}
