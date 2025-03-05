class TrianglePath {
    public int solution(int[][] triangle) {
        int n = triangle.length;
        
        // DP 배열 갱신
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) { 
                    // 왼쪽 끝
                    triangle[i][j] += triangle[i - 1][j];
                } else if (j == i) { 
                    // 오른쪽 끝
                    triangle[i][j] += triangle[i - 1][j - 1];
                } else { 
                    // 가운데
                    triangle[i][j] += Math.max(triangle[i - 1][j - 1], triangle[i - 1][j]);
                }
            }
        }

        // 마지막 행의 최댓값 반환
        int max = 0;
        for (int num : triangle[n - 1]) {
            max = Math.max(max, num);
        }
        return max;
    }
}
