
/**
 * MyApp 클래스란 여러 Student 객체를 생성하고,각 학생이 담당하는 구구단을 순서대로 출력하도록 제어한다.
 *
 * @author (2023485096 이순영, 2025320057 홍권찬, 2025310070 와뇨니 에즈라 브래들리)
 * @version (20260505)
 */
public class MyApp
{
    public static void main(String [] args){
        Student s1 = new Student("JENNA","R005",4);
        Student s2 = new Student("JAMES","R009",9);
        Student s3 = new Student("JOHN","R010",7);
        Student s4 = new Student("MARIA","R029",2);
        
        //s1.JENNA학생 구구단 답하기
        System.out.println(s1.getName() + "에게 " + s1.getGugudan() + "단을 답해주세요~");
        s1.calculateGugu();
        
        System.out.println("");
        System.out.println("");
        
        //s2.JAMES학생 구구단 답하기
        System.out.println(s2.getName() + "에게 " + s2.getGugudan() + "단을 답해주세요~");
        s2.calculateGugu();
        
        System.out.println("");
        System.out.println("");
        
        //s3.JOHN학생 구구단 답하기
        System.out.println(s3.getName() + "에게 " + s3.getGugudan() + "단을 답해주세요~");
        s3.calculateGugu();

        System.out.println("");
        System.out.println("");
        
        //s4.MARIA학생 구구단 답하기
        System.out.println(s4.getName() + "에게 " + s4.getGugudan() + "단을 답해주세요~");
        s4.calculateGugu();

        
        System.out.println("");
        System.out.println("");
    }
}