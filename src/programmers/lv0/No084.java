package programmers.lv0;
//  k의 개수
/**
    문제 설명
    1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다. 정수 i, j, k가 매개변수로 주어질 때, i부터 j까지 k가 몇 번 등장하는지 return 하도록 solution 함수를 완성해주세요.

    제한사항
    1 ≤ i < j ≤ 100,000
    0 ≤ k ≤ 9

    입출력 예
    i	j	k	result
    1	13	1	6
    10	50	5	5
    3	10	2	0

    입출력 예 설명
    입출력 예 #1
    본문과 동일합니다.
    입출력 예 #2
    10부터 50까지 5는 15, 25, 35, 45, 50 총 5번 등장합니다. 따라서 5를 return 합니다.
    입출력 예 #3
    3부터 10까지 2는 한 번도 등장하지 않으므로 0을 return 합니다.
*/
public class No084 {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for (int start = i; start <= j; start++) {
            for (int x = 0; x < String.valueOf(start).length(); x++) {
                if (String.valueOf(start).split("")[x].contains(String.valueOf(k))) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        No084 no084 = new No084();
        System.out.println(no084.solution(1, 13, 1));
    }
}
