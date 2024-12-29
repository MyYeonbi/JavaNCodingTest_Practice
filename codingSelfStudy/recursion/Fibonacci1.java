package codingSelfStudy.recursion;

//팥붕어빵 틀
public class Fibonacci1 {
 public int count = 0;

    public int solution(int n) {
        if(n <=1) return n;
       count++;
        return solution(n-1) + solution(n-2);
    }

    public static void main(String[] args) {


        Fibonacci1 fibo1 = new Fibonacci1();

        System.out.println(fibo1.solution(4)); //팥붕어빵 2번 이름 안붙음. (solution =3 들어있음 count = 4)
        System.out.println("총 재귀 몇 번 : " + fibo1.count); //팥붕어빵 1번 이름 붙음.  (solution 실행 안함. count = 0 - 팥붕어빵 1번의 count와 solution과는 다른것.)
    }
}
