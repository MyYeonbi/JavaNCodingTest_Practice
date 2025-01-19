package codingStudy.set;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetHomework {
    public static void main(String[] args) {
        System.out.println("생성 된 로또 번호는");
        System.out.print(generateLottoNumbers());
        System.out.print(" 입니다.");
    }

    static Set<Integer> generateLottoNumbers() {
        // 여기를 완성해서 생성된 로또 번호가 오름차순으로 정렬 된, Set 을 리턴하는 코드를 완성하시오
        Set<Integer> hashSet = new TreeSet<>();
        Random random = new Random();

        //Set의 크기가 6이 될 때까지 랜덤 숫자 추가
        while (hashSet.size() < 6) {
            int number = random.nextInt(45)+1;
            hashSet.add(number);
        }


        return new TreeSet<>(hashSet);
    }
}