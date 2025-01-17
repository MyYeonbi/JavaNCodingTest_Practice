package codingSelfStudy.ifelse;

public class QuadrantFinder {
    public int solution(int[] dot) {
        if (dot[0] >0 && dot[1]> 0) {
            return 1;
        } else if (dot[0]<0 && dot[1]>0) {
            return 2;
        } else if (dot[0] <0 && dot[1] <0) {
            return 3;
        } else (dot[0]>0 && dot[1] <0){
            return 4;
        }
    }
    public static void main(String[] args) {
        QuadrantFinder quadrantFinder = new QuadrantFinder();
        System.out.println(quadrantFinder.solution(new int[]{1,2}));
    }
}
