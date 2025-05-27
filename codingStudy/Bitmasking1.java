package codingStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;





  public class Bitmasking1 {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int M = Integer.parseInt(br.readLine());
      int S = 0;
      StringBuilder sb = new StringBuilder();

      for (int i = 0; i < M; i++) {
        StringTokenizer st = new StringTokenizer(br.readLine());
        String op = st.nextToken();

        if (op.equals("all")) {
          S = (1 << 20) - 1;
        } else if (op.equals("empty")) {
          S = 0;
        } else {
          int x = Integer.parseInt(st.nextToken());
          if (op.equals("add")) {
            S |= (1 << (x - 1));
          } else if (op.equals("remove")) {
            S &= ~(1 << (x - 1));
          } else if (op.equals("check")) {
            sb.append((S & (1 << (x - 1))) != 0 ? "1\n" : "0\n");
          } else if (op.equals("toggle")) {
            S ^= (1 << (x - 1));
          }
        }
      }

      System.out.print(sb.toString());
    }
  }

