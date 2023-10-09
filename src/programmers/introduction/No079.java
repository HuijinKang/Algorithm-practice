package programmers.introduction;
//  숨어있는 숫자의 덧셈 (2)

import java.util.ArrayList;
import java.util.Arrays;

/**
    문제 설명
    문자열 my_string이 매개변수로 주어집니다. my_string은 소문자, 대문자, 자연수로만 구성되어있습니다. my_string안의 자연수들의 합을 return하도록 solution 함수를 완성해주세요.

    제한사항
    1 ≤ my_string의 길이 ≤ 1,000
    1 ≤ my_string 안의 자연수 ≤ 1000
    연속된 수는 하나의 숫자로 간주합니다.
    000123과 같이 0이 선행하는 경우는 없습니다.
    문자열에 자연수가 없는 경우 0을 return 해주세요.

    입출력 예
    my_string	result
    "aAb1B2cC34oOp"	37
    "1a2b3c4d123Z"	133

    입출력 예 설명
    입출력 예 #1
    "aAb1B2cC34oOp"안의 자연수는 1, 2, 34 입니다. 따라서 1 + 2 + 34 = 37 을 return합니다.
    입출력 예 #2
    "1a2b3c4d123Z"안의 자연수는 1, 2, 3, 4, 123 입니다. 따라서 1 + 2 + 3 + 4 + 123 = 133 을 return합니다.
*/
public class No079 {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.replaceAll("[a-zA-Z]"," ").split(" ");
        System.out.println(Arrays.toString(arr));
        ArrayList list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals("")) {
                list.add(Integer.valueOf(arr[i]));
            }
        }
        answer = list.stream().mapToInt(i -> (int) i).sum();
        return answer;
    }

    public int solution2(String my_string) {
        int answer = 0;
        String[] arr = my_string.replaceAll("[a-zA-Z]"," ").split(" ");

        for(String s :  arr){
            if(!s.equals("")){
                answer+=Integer.valueOf(s);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        No079 no079 = new No079();
        System.out.println(no079.solution("aAb1B2cC34oOp"));
    }
}