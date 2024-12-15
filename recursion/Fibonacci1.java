package recursion;

//팥붕어빵 틀
public class Fibonacci1 {
 public int count = 0;

    public int solution(int n) {
        if(n <=1) return n;
       count++;
        return solution(n-1) + solution(n-2);
    }

    public static void main(String[] args) {
        int num = 20;

        

        System.out.println(new Fibonacci1().solution(num)); //팥붕어빵 1번 (count =6,solution =3 들어있음)
        System.out.println("총 재귀 몇 번 : " + new Fibonacci1().count); //팥붕어빵 2번 (count = 0,solution = 0 들어있음 - 팥붕어빵 1번의 count와 solution과는 다른것.)
    }
}
