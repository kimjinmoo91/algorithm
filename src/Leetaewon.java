
//---------------------------------------------------------------------------------------

//문제 설명 :
//        이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
//        별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.
//        제한 조건 :
//        n과 m은 각각 1000 이하인 자연수입니다



import java.util.Scanner;

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

//error : Output size differs = 실행한 결과값이 *****이 기대값**과 다르다.
// 출력을 반대로 해야 할 것 같다. 실행한 결과값이 ***이 기대값 *****과 다르다.
//음.. 그럼 변수를 봐야할 것 같다  첫 for문의 i -> a, 둘째 for문의 i->b로 변경했을 때 '출력한 내용이 너무 길다' 에러 발생.
// 그렇다면... for문의 int를 다시보자 -> 두번째 for문도 int i로 줘서 j로 변경했으나 실행시간이 10.0초 초과해서 중단됨.
// i < a;, j < b;로 변경을 했다. 변경된 부분에서 변수 i에 관해 언급이 됬다. 고친 변수에서 문제가 생겼다는 말인데,,아 ....
//두번째 for문은 변수를 j로 줬는데 변수 하나를 i에서 j로 안바꿨다. 실행한 결과값이 기대값과 다르다.. 이것은 바뀌었다는 말!!!
//아니... '	Output size differs' 거의 다왔다. 기다려 족쇄 곧 풀어줄게.
//이쯤 되면 잘 쓴거 같은데 결과 기대값이 다르다고?
//생각도 못한게 있었는데 ...출력문이 어디에 있냐 괄호 열고 닫고가 어디에 있느냐의 문제였다.. for문이나 변수가 아무리 고칠 부분이 없었다.
//그랬기 때문에 들여쓰기를 정말 많이 고쳤다. 어딘지를 모르겠어서 다 지우고 새로 처음부터 썼더니 들여쓰기의 문제였었다.. 최종..
//정말 많은 생각을 통해 해결하니 희열넘침. 밑은 완성본이다.




import java.util.Scanner;

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





//문제 설명 :
//        0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
//        numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.

//제한 사항 :
//      1 ≤ numbers의 길이 ≤ 9
//        0 ≤ numbers의 모든 원소 ≤ 9
//        numbers의 모든 원소는 서로 다릅니다.

        import java.util.*;

        class Solution {
             public int solution(int[] numbers) {
                  int answer = 45;

                 for (int i = 0; i < numbers.length; i++) {
                     answer -= numbers[i];
                 }
                 return answer;
             }
        }

// 아까 풀어보고 한참 뒤에 풀어봤는데,, 기억에 남는 이유가 있다. 확실한 공부법!!
// 문제를 풀고, 팀원들에게 문제풀이를 해주기로 했는데 내가 이해가 안되니 설명도 안되는 법.
// 내가 이해를 하면 설명의 질이 다른 것 같다.. 한번에 클리어해서 시원하다 족쇄여