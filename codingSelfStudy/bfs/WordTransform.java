package codingSelfStudy.bfs;
/*문제 설명
두 개의 단어 begin, target과 단어의 집합 words가 있습니다. 아래와 같은 규칙을 이용하여 begin에서 target으로 변환하는 가장 짧은 변환 과정을 찾으려고 합니다.

1. 한 번에 한 개의 알파벳만 바꿀 수 있습니다.
2. words에 있는 단어로만 변환할 수 있습니다.

예를 들어 begin이 "hit", target가 "cog", words가 ["hot","dot","dog","lot","log","cog"]라면 "hit" -> "hot" -> "dot" -> "dog" -> "cog"와 같이 4단계를 거쳐 변환할 수 있습니다.
두 개의 단어 begin, target과 단어의 집합 words가 매개변수로 주어질 때, 최소 몇 단계의 과정을 거쳐 begin을 target으로 변환할 수 있는지 return 하도록 solution 함수를 작성해주세요.

< 제한사항 >
각 단어는 알파벳 소문자로만 이루어져 있습니다.
각 단어의 길이는 3 이상 10 이하이며 모든 단어의 길이는 같습니다.
words에는 3개 이상 50개 이하의 단어가 있으며 중복되는 단어는 없습니다.
begin과 target은 같지 않습니다.
변환할 수 없는 경우에는 0를 return 합니다.

< 입출력 예 >
begin	target	words	return
"hit"	"cog"	["hot", "dot", "dog", "lot", "log", "cog"]	4
"hit"	"cog"	["hot", "dot", "dog", "lot", "log"]	0
*/
import java.util.*;
public class WordTransform {
    public int solution(String begin, String target, String[] words) {
        // 1. 단어 목록에 목표 단어가 있는지 확인 - 바꿀 수 없으니깐 0을 반환하고 끝!
        if (!Arrays.asList(words).contains(target)) {
            return 0;
        }

        // 2. 단어 변환을 위한 큐(FIFO) 만들기 - 큐는 줄 서는 개념과 비슷하다.
        Queue<WordNode> queue = new LinkedList<>();
           // 첫 단어(begin)과 변환 횟수 0을 저장한다.
            queue.offer(new WordNode(begin, 0));

        // 3. 방문한 단어 체크 - 한번 방문한 단어는 다시 방문하면 안된다.
        // 그래서 visited[i] = true;하면 "이 단어는 이미 사용했다"라고 표시할 것이다.
        boolean[] visited = new boolean[words.length];


        // 4. 줄을 서서 하나씩 단어를 꺼내기(BFS)
        while (!queue.isEmpty()) {
            // queue.poll(); -> 줄의 맨 앞에 있는 단어를 꺼내기!
            // 현재 단어를 current라는 변수에 저장.
            WordNode current = queue.poll();

            // 5. 목표 단어에 도달하면 현재 변환 횟수 반환
              // 현재 단어가 목표 단어와 같다면 변환 횟수(current.step)반환하고 끝.
            if (current.word.equals(target)) {
                return current.step;
            }

            // 6. 현재 단어와 한 글자만 다른 단어를 찾음
              /*	•	모든 단어(words[i])를 하나씩 확인!
	•	isOneLetterDiff(current.word, words[i]) → 현재 단어와 한 글자만 다른지 확인!
	•	방문하지 않은 단어라면?
	•	visited[i] = true; (방문 표시)
	•	queue.offer(new WordNode(words[i], current.step + 1)); → 변환 횟수를 1 늘려서 큐에 추가!*/
            for (int i = 0; i < words.length; i++) {
                if (!visited[i] && isOneLetterDiff(current.word, words[i])) {
                    visited[i] = true; // 방문처리
                    queue.offer(new WordNode(words[i], current.step +1));
                }
            }
        }

        // 7. 변환 불가능할 경우 0 반환
        return 0;
    }
    // 8. 두 단어가 한 글자만 다른지 확인하는 메서드
     /*	•	두 단어를 비교해서 **다른 글자 개수(diffCount)**를 세.
	    •	딱 한 글자만 다르면 true!
	    •	두 개 이상 다르면 false!*/
    private boolean isOneLetterDiff(String word1, String word2) {
        int diffCount = 0;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                diffCount++;
            }
            if (diffCount > 1) {
                return false;
            }
        }
        return diffCount == 1;
    }

    // 9. 단어와 현재 변환 횟수를 저장하는 클래스
    	/*•	word: 현재 단어 저장
	      •	step: 지금까지 몇 번 변환했는지 저장
	      •	이렇게 묶어서 관리하면 편해! */
    private class WordNode {
        String word;
        int step;

        WordNode (String word, int step) {
            this.word = word;
            this.step = step;
        }
    }
    public static void main(String[] args) {
        WordTransform wt = new WordTransform();
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};

        int result = wt.solution(begin, target, words);
        System.out.println("최소 변환 단계 수: " + result);  // 출력: 4
    }

}
