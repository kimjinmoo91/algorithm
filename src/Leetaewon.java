

//220716SAT--------------------------------------------------------------------------------------------------------------------------
//Arrays.sort() 코테에 자주 나오는 유형!!!!


문제 설명
        2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요?
        두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요.
        요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT 입니다.
        예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.

제한 조건
        2016년은 윤년입니다.
        2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)

import java.time.LocalDate;
        import java.time.DayOfWeek;
        import java.time.format.TextStyle;
        import java.util.Locale;

class Solution {
    public String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016, a,b);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.US).toUpperCase();
    }
}

//반복문, 조건문 아는대로 적었고, 문제 풀 방법을 분석해보았는데....? 분석이 안된다?
//문제를 검색했고, 이 문제를 어떻게 분석을 했는지... 조급한 마음으로 찾아보았다.
//감이 일절,, 손을 어디서 어떻게...? 대야하는지 1도 모르겠다.
//풀이를 보고 풀이를 해석하려한다. 팀원들에게 문제풀이를 해야하니,, 아참!
//내가 알아야 설명도 해줄 수 있겠구나 문제풀이 공부먼저해 보자 싶어 문제풀이본을 보고 해석을 했다.

//        LocalDate : 날짜 정보 출력
//        ex) LocalDate currentDate = LocalDate.now();    2022-07-16
//
//        DayOfWeek : 월요일, 화요일, 수요일, 목요일, 금요일, 토요일 및 일요일의 7 일을 나타내는 열거 형.
//        1        2        3        4        5         6           7
//
//        date.getDayOfWeek();
//        요일을 표현하는 DayOfWeek Enum을 가져옴
//        DayOfWeek Enum 으로 요일을 구함.
//        Enum : 열거형 = 관련이 있는 상수들의 집합(ex. Day, Month)
//
//        dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.US).toUpperCase();
//
//        DayOfWeek 클래스의 getDisplayName() 메소드는 요일을 텍스트로 리턴.
//
//        TextStyle = 보여줄 요일에 대한 형식
//        TextStyle.Full                요일의 풀네임         ex.    Sunday -> Sunday
//        TextStyle.NARROW        요일 앞글자 하나             Sunday -> S
//        TextStyle.SHORT           요일 줄임말                   Sunday -> Sun
//
//        Locale.US  -> 국가언어설정을 US (United State) 영어로 출력받겠다.
//
//        toUpperCase();  -> 높임형으로 해석하시면 되겠는데 소문자를 대문자로 변환.
//        ex) toRowerCase -> 낮춤형으로,, 대문자를 소문자로 변환.

//      영단어 느낌으로 쪼개서 의미를 찾아보았는데 코드의 내용이 보이고 문제가 보였다.
//      이게 답은 아니지만 이렇게 한번쯤 해보는 것도 때론 공부하는 방법이 될 수도 있겠구나.알게됬고
//      문제를 알고 해석본을 해석하니 이해가 잘 되지 않는가? 손코딩 3번 돌이켜 보았다.
//      다음 번 비슷한 문제가 나온다면 오늘을 기억하고 풀어볼 수 있을 것 같다. 풀지 못한대도,
//      구글링으로 충분히 풀어볼 수 있지 않을까 생각한다.




    class Solution {
        public boolean solution(String s) {
            boolean answer = true;

            String a = "a234";
            String b = "1234";
            String s = "1234";

            for (int i = 0; i < length; i++) {
                if (s.equals(a)) {
                    System.out.println("False");
                } else (s.equals(b));
                {
                    System.out.println(answer);
                    {

                    }
                }
                return answer;
            }
        }
    }

------수정한 코딩-------
    public class Solution {
        public boolean solution(String s) {

            String s = "1234";
            boolean isNumeric = StringUtils.isNumeric(s);
            System.out.println(isNumeric);
            s = "a234";
            isNumeric = StringUtils.isNumeric(s);
            System.out.println(isNumeric);
        }
    }
// 숫자에 문자가 섞여 있는 메소드를 찾아보았다 matches()로 풀었는데 2개 중 하나가 자꾸 실패로 뜬다.
// 무엇이 문제인고,,, 컴파일의 문제라고만 나온다.. 이것만 해결하면 통과가 될 것 같은데,,
// 수정하고 수정하다 코드가 엉망이 되었고 초기화했다...ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ
// 그래 잘 됬다 새로 코드 짜보자 싶어 클래스, 메소드를 새로 찾아보았고 구글에서 가져다가
// 일단 적어보았는데 생각 외로 문법이 잘 완성이 되었다. 감이 좀 온건가?ㅋㅋㅋㅋㅋㅋ
// 손코딩을 죙일하니 머리가 멍해진다....
// 에러만 두고 내일 마저 해결해야겠다.


//Solution.java:6: error: variable s is already defined in method solution(String)
//        String s = "1234";
//        ^
//        /Solution.java:7: error: cannot find symbol
//        boolean isNumeric = StringUtils.isNumeric(s);
//        ^
//        symbol:   variable StringUtils
//        location: class Solution
///Solution.java:10: error: cannot find symbol
//        isNumeric = StringUtils.isNumeric(s);
//        ^
//        symbol:   variable StringUtils
//        location: class Solution
//4 errors
//
//4개의 에러가 발생했다. 머리가 멈추어서 내일 해결해야할 것 같다.
//두통이 살짝 온다.


// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ재수정  CODEㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
import org.apache.commons.lang3.StringUtils;

    public class Solution {
        public boolean solution(String s) {
            boolean answer = true;

            if (s.length() == 4 && s.length() == 6) {
                answer = false;
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) >= 'a') {
                        answer = false;
                    }
                }
            }
            return answer;
        }
    }
// 재수정  CODE..
///Solution.java:1: error: package org.apache.commons.lang3 does not exist
//        import org.apache.commons.lang3.StringUtils;
// not solution  !!!







// 2주차 시작
// 문제설명
// 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
// 전화번호가 문자열 phone_number로 주어졌을 때,
// 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
//
// 제한 조건
// phone_number는 길이 4 이상, 20이하인 문자열입니다.

    class Solution {
        public String solution(String phone_number) {
            String answer = "";

            for (int i = 0; i < phone_number.length() -4; i++) {
                answer += "*";
            }
            answer += phone_number.substring(phone_number.length() -4, phone_number.length());

            return answer;
        }
    }

    // for문을 통해서 뒷 4자리를 제외한 나머지 번호를 answer의 *로 만들어주고
//substring() 메소드로 뒷 4자리 번호를 붙였다. substring(a,b) : a~b번째 전까지 잘라줌 / a=는 시작값, b=종료값
//ㅡㅡㅡㅡㅡ다 른 풀 이ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
    class Solution {
        public String solution(String phone_number) {
            return "*".repeat(phone_number.length() - 4) + phone_number.substring(phone_number.length() - 4);
        }
    }
//repeat() 메소드를 이용하여 반복을한다.
// 뒤에서 네자리 숫자와 *을 더한다.

    //이런것도 있구나 가져와 봤다.
    class Solution {
    public String solution(String phone_number) {
        return phone_number.replaceAll(".(?=.{4})", "*");
    }
}



// 문제 설명
// 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
// n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
//
// 제한 사항
// n은 1이상, 50000000000000 이하인 양의 정수입니다.

class Solution {
    public long solution(long n) {
        long sqrRt = (long)Math.sqrt(n);

        if (sqrRt * sqrRt == n) {
            return (sqrRt + 1) * (sqrRt + 1);
        }
        else {
            return -1;
        }
    }
}

// 구글링을 통해 제곱근 pow(), sqrt()메소드를 알게 됬고 sqrt()메소드를 사용했다.
// double형 값의 제곱근 값을 반환함.
// ex) System.out.println((int)Math.pow(5, 2)); -> 25
//     System.out.println((int)Math.sqrt(25)); -> 5
// 문제 설명을 분석, 해석, 쪼개고 나누는게 실력 차이인 것 같다.
// 문제를 분석하고 쪼개 나누는 게 아직도 어렵다.
// 팀원들과 소통하면서 문제를 해석하고 쪼개 하나씩 작성해나가기 시작했고,
// 생각보다 재밌고 빠르게 해결해본 것 같다.
// 문제를 분석하는 연습은 많이 풀고 보는 것이 현재 방법인 것 같다..!!!!




// 문제 설명 ㅡㅡㅡㅡ(해결중)ㅡㅡㅡㅡ
// 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
//
// 제한 조건
//  arr은 길이 1 이상인 배열입니다.
//  인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.

import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int[] arr = {4,3,2,1};
        int min = arr[0];
        for (int num : arr)
            if(max > min) {

                min = num;
            }


        return answer;
    }
}
