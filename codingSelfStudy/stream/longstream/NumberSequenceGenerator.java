package codingSelfStudy.stream.longstream;
//x만큼 간격이 있는 n개의 숫자
import java.util.stream.LongStream;
public class NumberSequenceGenerator {
    public long[] solution(int x, int n) {
        return LongStream.rangeClosed(1, n).map(i -> (long) x * i).toArray();
    }
}
