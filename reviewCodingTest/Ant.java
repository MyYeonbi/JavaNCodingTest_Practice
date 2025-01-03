package reviewCodingTest;

public class Ant {
    public int solution(int hp) {
        int generalAnt = 5;
        int soldierAnt = 3;
        int workerAnt = 1;

        int count = 0;
        count += hp / generalAnt;
        hp %= generalAnt;

        count += hp / soldierAnt;
        hp %= soldierAnt;

        count += hp / workerAnt;

        return count;
    }
    public static void main(String[] args) {
        Ant ant = new Ant();
        System.out.println(ant.solution(30));
    }
}
