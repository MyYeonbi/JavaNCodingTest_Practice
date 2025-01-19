package codingStudy.set;
import java.util.*;

public class SetHomework2 {
    public static void main(String[] args) {
        System.out.println("생성된 로또 번호는");
        System.out.print(generateLottoNumbers());
        System.out.print(" 입니다.");
    }

    static Set<Integer> generateLottoNumbers() {
        Set<Integer> lottoNumbers = new TreeSet<>();
        Random random = new Random();

        while (lottoNumbers.size() <6) {
            lottoNumbers.add(random.nextInt(45)+1);

        }
        return lottoNumbers;

    }
}
