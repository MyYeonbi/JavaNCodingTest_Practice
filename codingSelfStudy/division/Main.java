package codingSelfStudy.division;

class Main {
    public static void main(String[] args) {
        GcdLcm sol = new GcdLcm();

        // 테스트 케이스 실행
        int[] testCases = {6, 10, 4, 12, 8}; // 테스트할 n 값들

        System.out.println("테스트 케이스 결과:");
        System.out.println("-----------------------------");
        for (int n : testCases) {
            int result = sol.solution(n); //solurion 함수 실행
            System.out.println("입력: " + n + " -> 필요한 피자 판 수: " + result);
        }

    }
}

