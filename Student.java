
/**
 * Student 클래스란 학생의 이름, ID, 그리고 담당 구구단을 저장하고
 * 구구단을 계산하여 출력하는 클래스이다.
 *
 * @author (,2025320057 홍권찬,)
 * @version (20260505)
 */
public class Student
{
    private String name;
    private String StudentId;
    private int gugudan;

    /**
     * 메소드 예제 -  학생의 이름과 학번을 초기화하는 생성자
     *
     * @param  name , studentId
     * @return 없음
     */
    public Student(String name, String StudentId){
        this.name=name;
        this.StudentId=StudentId;
    }

    /**
     * 메소드 예제 - 학생의 이름, 학번, 구구단을 초기화하는 생성자
     *
     *
     * @param  name, StudentId, gugudan
     * @return 없음
     */
    public Student(String name, String StudentId, int gugudan){
        this.name=name;
        this.StudentId=StudentId;
        this.gugudan=gugudan;
    }

    /**
     * 메소드 예제 - 객체에 저장된 구구단 값을 이용하여 1부터 9까지의 구구단을 출력한다.
     *
     * @param 
     * @return 없음
     */
    public void calculateGugu(){
        for(int i=1 ; i<=9; i++){
            System.out.print(gugudan+"x"+i+"="+gugudan*i+" ");
        }
        // System.out.println("");
    }    

    /**
     * 메소드 예제 - 입력받은 구구단 값을 이용하여 1부터 9까지의 구구단을 출력한다.
     *
     * @param  gugudan
     * @return  없음
     */
    public void calculateGugu(int gugudan){
        for(int i=1 ; i<=9; i++){
            System.out.print(gugudan+"x"+i+"="+gugudan*i+" ");
        }
        // System.out.println("");
    }

    /**
     * 메소드 예제 - 구구단 값을 설정한다.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public void setGugudan(int gugudan){
        this.gugudan=gugudan;
    }  

    /**
     * 학생의 이름을 반환한다.
     *
     * @return 학생 이름
     */
    public String getName(){
        return name;
    }

    /**
     * 설정된 구구단 값을 반환한다.
     *
     * @return 구구단 값
     */
    public int getGugudan(){
        return gugudan;
    }

}   
