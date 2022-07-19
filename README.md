## -알고리즘 기초 풀이-

#### 문제 설명 
##### 220715fri

이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.

제한 조건 :
 n과 m은 각각 1000 이하인 자연수입니다

 ```import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; a < 3; i++) {
            for (int i = 0; b < 5; i++) {
            }
            System.out.print("*");
        }

        System.out.println();
    }
}
```

#### **error**
   1. Output size differs = 실행한 결과값이 *****이 기대값**과 다르다.
   2. 출력을 반대로 해야 할 것 같다. 실행한 결과값이 ***이 기대값 *****과 다르다.
   3. 음.. 그럼 변수를 봐야할 것 같다  첫 for문의 i -> a, 둘째 for문의 i->b로 변경했을 때 '출력한 내용이 너무 길다' 에러 발생.
   4. 그렇다면... for문의 int를 다시보자 -> 두번째 for문도 int i로 줘서 j로 변경했으나 실행시간이 10.0초 초과해서 중단됨.
   5. i < a;, j < b;로 변경을 했다. 변경된 부분에서 변수 i에 관해 언급이 됬다. 고친 변수에서 문제가 생겼다는 말인데,,아 ....
   6. 두번째 for문은 변수를 j로 줬는데 변수 하나를 i에서 j로 안바꿨다. 실행한 결과값이 기대값과 다르다.. 이것은 바뀌었다는 말!!!
   7. 아니... '	Output size differs' 거의 다왔다. 기다려 족쇄 곧 풀어줄게.
   8. 이쯤 되면 잘 쓴거 같은데 결과 기대값이 다르다고?
   9. 생각도 못한게 있었는데 ...출력문이 어디에 있냐 괄호 열고 닫고가 어디에 있느냐의 문제였다.. for문이나 변수가 아무리 고칠 부분이 없었다.
   10. 그랬기 때문에 들여쓰기를 정말 많이 고쳤다. 어딘지를 모르겠어서 다 지우고 새로 처음부터 썼더니 들여쓰기의 문제였었다.. 최종..
   11. 정말 많은 생각을 통해 해결하니 희열넘침. 밑은 완성본이다.


#### **solution**


```import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```





#### 문제설명

0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
 numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.

제한 사항 :
 1 ≤ numbers의 길이 ≤ 9
 0 ≤ numbers의 모든 원소 ≤ 9
 numbers의 모든 원소는 서로 다릅니다.


 ```import java.util.*;

    class Solution {
        public int solution(int[] numbers) {
            int answer = 45;

            for (int i = 0; i < numbers.length; i++) {
                answer -= numbers[i];
            }
            return answer;
        }
    }
```



#### **solution**
1. 아까 풀어보고 한참 뒤에 풀어봤는데,, 기억에 남는 이유가 있다. 확실한 공부법!!
2. 문제를 풀고, 팀원들에게 문제풀이를 해주기로 했는데 내가 이해가 안되니 설명도 안되는 법.
3. 내가 이해를 하면 설명의 질이 다른 것 같다.. 한번에 클리어해서 시원하다 족쇄여



#### 문제설명
##### 220715sat

        2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요?
        두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요.
        요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT 입니다.
        예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.

        제한 조건
        2016년은 윤년입니다.
        2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)


```
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
```

#### **error**

1. 반복문, 조건문 아는대로 적었고, 문제 풀 방법을 분석해보았는데....? 분석이 안된다?
2. 문제를 검색했고, 이 문제를 어떻게 분석을 했는지... 조급한 마음으로 찾아보았다.
3. 감이 일절,, 손을 어디서 어떻게...? 대야하는지 1도 모르겠다.
4. 풀이를 보고 풀이를 해석하려한다. 팀원들에게 문제풀이를 해야하니,, 아참!
5. 내가 알아야 설명도 해줄 수 있겠구나 문제풀이 공부먼저해 보자 싶어 문제풀이본을 보고 해석을 했다.

```
    LocalDate : 날짜 정보 출력
       ex) LocalDate currentDate = LocalDate.now();    2022-07-16
       DayOfWeek : 월요일, 화요일, 수요일, 목요일, 금요일, 토요일 및 일요일의 7 일을 나타내는 열거 형.
       1        2        3        4        5         6           7

        date.getDayOfWeek();
        요일을 표현하는 DayOfWeek Enum을 가져옴
        DayOfWeek Enum 으로 요일을 구함.
        Enum : 열거형 = 관련이 있는 상수들의 집합(ex. Day, Month)

        dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.US).toUpperCase();

        DayOfWeek 클래스의 getDisplayName() 메소드는 요일을 텍스트로 리턴.

        TextStyle = 보여줄 요일에 대한 형식
        TextStyle.Full                요일의 풀네임         ex.    Sunday -> Sunday
        TextStyle.NARROW        요일 앞글자 하나             Sunday -> S
        TextStyle.SHORT           요일 줄임말                   Sunday -> Sun
        Locale.US  -> 국가언어설정을 US (United State) 영어로 출력받겠다.
        toUpperCase();  -> 높임형으로 해석하시면 되겠는데 소문자를 대문자로 변환.
        ex) toRowerCase -> 낮춤형으로,, 대문자를 소문자로 변환.

    영단어 느낌으로 쪼개서 의미를 찾아보았는데 코드의 내용이 보이고 문제가 보였다.
      이게 답은 아니지만 이렇게 한번쯤 해보는 것도 때론 공부하는 방법이 될 수도 있겠구나.알게됬고
      문제를 알고 해석본을 해석하니 이해가 잘 되지 않는가? 손코딩 3번 돌이켜 보았다.
      다음 번 비슷한 문제가 나온다면 오늘을 기억하고 풀어볼 수 있을 것 같다. 풀지 못한대도,
      구글링으로 충분히 풀어볼 수 있지 않을까 생각한다.
```

##### **solution**






#### 문제설명

문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.

제한 사항:
s는 길이 1 이상, 길이 8 이하인 문자열입니다.

```class Solution {
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
```

##### **correction**

```
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
```

#### **error**

1. 숫자에 문자가 섞여 있는 메소드를 찾아보았다 matches()로 풀었는데 2개 중 하나가 자꾸 실패로 뜬다.
2. 무엇이 문제인고,,, 컴파일의 문제라고만 나온다.. 이것만 해결하면 통과가 될 것 같은데,,
3. 수정하고 수정하다 코드가 엉망이 되었고 초기화했다...ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ
4. 그래 잘 됬다 새로 코드 짜보자 싶어 클래스, 메소드를 새로 찾아보았고 구글에서 가져다가
5. 일단 적어보았는데 생각 외로 문법이 잘 완성이 되었다. 감이 좀 온건가?ㅋㅋㅋㅋㅋㅋ
6. 손코딩을 죙일하니 머리가 멍해진다....
7. 에러만 두고 내일 마저 해결해야겠다.


#### error text

```
Solution.java:6: error: variable s is already defined in method solution(String)
        String s = "1234";
        ^
        /Solution.java:7: error: cannot find symbol
        boolean isNumeric = StringUtils.isNumeric(s);
        ^
        symbol:   variable StringUtils
        location: class Solution
        /Solution.java:10: error: cannot find symbol
        isNumeric = StringUtils.isNumeric(s);
        ^
        symbol:   variable StringUtils
        location: class Solution
4 errors
```





### 문제설명

문제 설명
문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

제한 사항
문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.


import java.util.Arrays;
class Solution {
public String solution(String s) {
String answer = "";

        String[] str = s.split(""); // s를 하나씩 읽어오기 위해 배열에 s를 넣음.

        int idx = 0; //index번호 초기화(띄어쓰기마다 인덱스를 초기화해야해서 idx변수 만듦.)
                }
        for (int i = 0; i < str.length; i++) {
            if (str.equals(" ")) { //String은 == 사용시 null 참조오류 발생할 수 있어서 equals로 비교해서 공백을 찾고 공백을 idx = 0 초기화한다.
                idx = 0;  
                    else if (idx % 2 == 0) {
                    str[i] = str[i].toUpperCase(); //나머지가 0이면 대문자로 바꿔주고 증가시켜
                    idx++;
                }
                    else if(idx % 2 != 0) {
                    str[i] = str[i].toLowerCase(); //나머지가 0이 아니라면 소문자로 바꿔주고 증가시켜
                    idx++;
                }
// idx가 짝수이면 toUpperCase(); 함수로 대문자로 변경하고
// idx가 홀수이면 toLowerCase(); 함수로 소문자로 변경시켜줌.
// 이후 idx를 증가시켜 띄어쓰기 이후 홀, 짝을 비교.

                    answer += str[i];
            } // for문 루프가 한번식 돌기 전마다 str[i]를 answer 에 적용.
            return answer;
    }
// 이런식으로 계속 루프가 돌면 문제에서 문자가 answer에 저장되고 answer을 return.
}




### 문제설명

문제 설명
함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.

제한 조건
n은 1이상 8000000000 이하인 자연수입니다.



import java.util.*;

class Solution {
public long solution(long n) {
long answer = 0;

        String[] arrStr = Long.toString(n).split("");
//내림차순하기위해서는 배열을 이용합니다.
//배열을 이용하기 위해서는 정수의 long type->String(문자열)->String[] 문자배열 => Long->String->String[]
// [1,1,8,3,7,2]
        
        Arrays.sort(arrStr, Collections.reverseOrder());
//배열로 내림차순을 만들어준다 이 단계는 [8,7,3,2,1,1] 
검색:Arrays 메소드 ->Arrays.sort(a, Collections.reverseOrder());
        
        return Long.parseLong(String.join("", arrStr));
// String의 배열이었던 것을 원래대로의 Long type로 복구시키는 작업.  -> Long.parseLong()
// String.join("", arrStr)의 String = 배열로 만드느라 벌려놓은 문자열<=>split

    }
}





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







// 220719 2주차 
//
   ### 문제설명
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



   ### 문제설명
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




   ### 문제설명 ㅡㅡㅡㅡ(해결중)ㅡㅡㅡㅡ
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



### **- 문자열 반복하는 간단한 방법 -**
자바판 파이썬 느낌의 간결한 반복하는 메소드가 필요궁금해졌다.
다양한 풀이를 보며, 배워보고 싶고, 알고 싶고, 궁금해졌다.
이렇게 반복하는 방법도 있음에 종류를 나에게 먼저 공유한다.  


```
String str = "abc";
String repeated = str.repeat(3);

repeated.equals("abcabcabc");
```



```
String str = "Hello";
System.out.println("repeat문 : " + str.repeat(3));
```



```
String.prototype.repeat()
```
//repeat() 메서드는 문자열을 주어진 횟수만큼 반복해 붙인 새로운 문자열을 반환.



```
str.repeat(count);
```
//구문



```
String str = "abc";
String repeated = StringUtils.repeat(str, 3);

repeated.equals("abcabcabc");
```
// Commons Lang StringUtils.repeat ()




```
repeated = new String(new char[n]).replace("\0", s);
```
// n문자열을 반복하려는 횟수는 어디 이며 반복 할 문자열 s입니다.
//  가져 오기 또는 라이브러리가 필요하지 않습니다.



```
String.format("%0" + n + "d", 0).replace("0", s);
```
// Java <= 7을 사용하는 경우



```
String.join("", Collections.nCopies(n, s));
```
// java 8



```
"abc".repeat(12);
```
// Java 11 이상에서는 repeat​(int count)this



```
StringUtils.repeat("abc", 12);
```
// 아파치 코 몬즈



```
Strings.repeat("abc", 12);
```
// 구글 구아바



```
System.out.println(String.join("", Collections.nCopies(100, "hello")));
```
// Java 8 String.join은 다음과 관련하여 깔끔한 방법을 제공함. Collections.nCopies.



```
repeated = String.format(String.format("%%%ds", n), " ").replace(" ",s);
```
// 표준 String 함수 만 사용하고 명시적인 루프를 사용하지 않는 방법은 위와 같다.



```
Strings.repeat("-", 60);
```
// Apache Commons가 아닌 Google Guava를 사용하고 싶다면, 
// Guava Strings 클래스에서 repeat 메소드를 사용할 수 있다.



```
'abc'.repeat(-1);   // RangeError
'abc'.repeat(0);    // ''
'abc'.repeat(1);    // 'abc'
'abc'.repeat(2);    // 'abcabc'
'abc'.repeat(3.5);  // 'abcabcabc' (count will be converted to integer)
'abc'.repeat(1/0);  // RangeError

({ toString: () => 'abc', repeat: String.prototype.repeat }).repeat(2);
// 'abcabc' (repeat() is a generic method)
```
// RangeError: 반복 횟수는 양의 정수여야 함.
// RangeError: 반복 횟수는 무한대보다 작아야 하며, 최대 문자열 크기를 넘어선 안됨.
