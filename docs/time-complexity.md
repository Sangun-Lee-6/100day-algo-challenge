### 입력에 따른 시간 복잡도 기준

- 1억에 1초 걸린다고 생각
- ex. 시간제한 2초 & 입력이 최대 10억이면 → O(N)을 사용하면 10초가 걸림 → 따라서 O(N)보다 빠른 알고리즘을 사용해야겠다고 생각해야함

| 시간복잡도 | 안전한 N 최대 크기 (1초 기준) |
| --- | --- |
| O(1), O(log N), O(√N) | 최대 10억 이상 |
| O(N) | 최대 1억 정도 |
| O(N log N) | 최대 1,000만 정도 |
| O(N²) | 최대 10,000 정도 |
| O(2ⁿ), O(N!) | 최대 20 정도 |