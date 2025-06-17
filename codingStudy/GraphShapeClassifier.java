package codingStudy;

public class GraphShapeClassifier {

  public int[] solution(int[][] edges) {
    int maxNode = 0;
    for (int[] e : edges) {
      maxNode = Math.max(maxNode, Math.max(e[0], e[1]));
    }

    int[] in = new int[maxNode + 1];
    int[] out = new int[maxNode + 1];

    for (int[] e : edges) {
      out[e[0]]++;
      in[e[1]]++;
    }

    int generated = -1;
    int donut = 0, bar = 0, eight = 0;

    for (int i = 1; i <= maxNode; i++) {
      if (out[i] >= 2 && in[i] == 0) {
        generated = i;
      }
    }

    for (int i = 1; i <= maxNode; i++) {
      if (i == generated) continue;
      if (out[i] == 0) {
        bar++;
      } else if (out[i] >= 2) {
        eight++;
      } else {
        donut++;
      }
    }

    return new int[]{generated, donut, bar, eight};
  }

}
