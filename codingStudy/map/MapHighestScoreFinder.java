package codingStudy.map;

import java.util.HashMap;
import java.util.Map;
public class MapHighestScoreFinder {
    public static void main(String[] args) {
        Map<String, Integer> homework = new HashMap<>();

        homework.put("연비", 95);
        homework.put("시완", 88);
        homework.put("수민", 92);
        homework.put("규찬", 85);
        System.out.println("homework map: " + homework);

        String topStudent = getTopStudent(homework);
        System.out.println("최고 점수를 가진 사람 : " + topStudent);
    }

    static public String getTopStudent(Map<String, Integer> studentList) {
        String topStudent = ""; // 최고 점수를 가진 학생의 이름
        int highestScore = Integer.MIN_VALUE; // 초기값은 가능한 가장 낮은 점수를 설정

        // Map의 엔트리를 순회하며 최고 점수를 찾음
        for (Map.Entry<String, Integer> entry : studentList.entrySet()) {
            if (entry.getValue() > highestScore) {
                highestScore = entry.getValue(); //최고 점수 갱신
                topStudent = entry.getKey(); // 해당 학생 이름 갱신
            }
        }
        return topStudent;
    }
}
