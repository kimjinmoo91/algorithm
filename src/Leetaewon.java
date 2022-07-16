

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

