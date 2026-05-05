
/**
 * Student 클래스란 학생의 이름, ID, 그리고 담당 구구단을 저장하고
 * 구구단을 계산하여 출력하는 클래스이다.
 *
 * @author (2023485096 이순영, 2025320057 홍권찬, 2025310070 와뇨니 에즈라 브래들리)
 * @version (20260505)
 */
public class Student
{
    private String name;
    private String studentId;
    private int gugudan;

    /**
     * 메소드 예제 -  학생의 이름과 학번을 초기화하는 생성자
     *
     * @param : name , studentId
     * @return : 없음
     */
    public Student(String name, String studentId){
        this.name=name;
        this.studentId=studentId;
    }

    /**
     * 메소드 예제 - 학생의 이름, 학번, 구구단을 초기화하는 생성자
     *
     * @param : name, StudentId, gugudan
     * @return : 없음
     */
    public Student(String name, String studentId, int gugudan){
        this.name=name;
        this.studentId=studentId;
        this.gugudan=gugudan;
    }

    /**
     * 학생의 이름을 반환한다.
     *
     * @param : 없음
     * @return : name
     */
    public String getName(){
        return name;
    }

    /**
     * 설정된 구구단 값을 반환한다.
     *
     * @param : 없음
     * @return : gugudan
     */
    public int getGugudan(){
        return gugudan;
    }

    /**
     * 메소드 예제 - 객체에 저장된 구구단 값을 이용하여 1부터 9까지의 구구단을 출력한다.
     *
     * @param : 없음
     * @return : 없음
     */
    public void calculateGugu(){
        for(int i=1 ; i<=9; i++){
            System.out.print(gugudan+"x"+i+"="+gugudan*i+" ");
        }
    }    

    /**
     * 메소드 예제 - 입력받은 구구단 값을 이용하여 1부터 9까지의 구구단을 출력한다.
     *
     * @param : gugudan
     * @return : 없음
     */
    public void calculateGugu(int gugudan){
        for(int i=1 ; i<=9; i++){
            System.out.print(gugudan+"x"+i+"="+gugudan*i+" ");
        }
    }

    /**
     * 메소드 예제 - 구구단 값을 설정한다.
     *
     * @param : gugudan
     * @return : 없음
     */
    public void setGugudan(int gugudan){
        this.gugudan=gugudan;
    }  
}   
