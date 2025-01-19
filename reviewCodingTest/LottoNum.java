package reviewCodingTest;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
public class LottoNum {
    public static void main(String[] args) {
        System.out.println("생성 된 로또 번호는");
        System.out.print(generateLottoNumbers());
        System.out.print(" 입니다.");
    }
    public static Set<Integer> generateLottoNumbers() {
        Set<Integer> numbers = new HashSet<>();
        Random random = new Random();

        while (numbers.size()<= 6) {
            int num = random.nextInt(45)+1;
            numbers.add(num);
        }

        return new TreeSet<>(numbers);

    }
}
