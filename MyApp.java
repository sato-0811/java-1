
/**
 * MyApp 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class MyApp
{
    public static void main(String [] args){
        Student s1 = new Student("JENNA",R005,4);
        Student s2 = new Student("JAMES",R009,9);
        Student s3 = new Student("JOHN",R010,7);
        Student s4 = new Student("MARIA",R029,2);
        
        //s1.JENNA학생 구구단 답하기
        System.out.println(s1.getName() + "에게" + s1.getGugudan() + "단을 답해주세요~");
        s1.calculateGugu();
        System.out.println();
        
        //s2.JAMES학생 구구단 답하기
        System.out.println(s2.getName() + "에게" + s2.getGugudan() + "단을 답해주세요~");
        s2.calculateGugu();
        System.out.println();
        
        //s3.JOHN학생 구구단 답하기
        System.out.println(s3.getName() + "에게" + s3.getGugudan() + "단을 답해주세요~");
        s3.calculateGugu();
        System.out.println();
        
        //s4.MARIA학생 구구단 답하기
        System.out.println(s4.getName() + "에게" + s4.getGugudan() + "단을 답해주세요~");
        s4.calculateGugu();
        System.out.println();
    }
}