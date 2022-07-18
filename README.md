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
            } // for문 루프가 한번식 돌기 전마다 str[i]를 answer 에 적용합니다.
            return answer;
    }
// 이런식으로 계속 루프가 돌면 문제에서 원하는 문자가 answer에 저장되고 answer을 return 합니다.
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
