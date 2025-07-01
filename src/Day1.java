import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 입력 예: 13

        int room = 1;
        int layer = 1;

        while (room < n) {
            room += 6 * layer;
            layer++;
        }

        System.out.println(layer); // 3
    }
}

/**
 * 시간복잡도 계산
 *
 * while 문은 다음과 같은 수열 형태 : 1 + 3n(n-1) = N
 *
 * 주어진 N 이하가 되는 최소 층을 찾는 것이므로
 * 1 + 3n(n-1) ≥ N
 * → n^2 ≥ N
 * 따라서 이 알고리즘의 시간복잡도는 O(√N)
 */