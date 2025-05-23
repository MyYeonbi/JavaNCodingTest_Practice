package codingStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bitmasking {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int M = Integer.parseInt(br.readLine());
    int S = 0;
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < M; i++) {
      String[] cmd = br.readLine().split(" ");
      String op = cmd[0];

      if (op.equals("add")) {
        int x = Integer.parseInt(cmd[1]);
        S |= (1 << (x - 1));
      } else if (op.equals("remove")) {
        int x = Integer.parseInt(cmd[1]);
        S &= ~(1 << (x - 1));
      } else if (op.equals("check")) {
        int x = Integer.parseInt(cmd[1]);
        sb.append((S & (1 << (x - 1))) != 0 ? "1\n" : "0\n");
      } else if (op.equals("toggle")) {
        int x = Integer.parseInt(cmd[1]);
        S ^= (1 << (x - 1));
      } else if (op.equals("all")) {
        S = (1 << 20) - 1;
      } else if (op.equals("empty")) {
        S = 0;
      }
    }

    System.out.print(sb.toString());
  }

}
