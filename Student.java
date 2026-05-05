
/**
 * Student 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class Student
{
    private String name;
    private int StudentId;
    private int gugudan;

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  name , studentId
     * @return 없음
     */
    public Student(String name, int StudentId){
        this.name=name;
        this.StudentId=StudentId;
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  name, StudentId, gugudan
     * @return 없음
     */
    public Student(String name, int StudentId, int gugudan){
        this.name=name;
        this.StudentId=StudentId;
        this.gugudan=gugudan;
    }
    
    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param 
     * @return 없음
     */
    public void calculateGugu(){
        for(int i=1 ; i<=9; i++){
            System.out.print(gugudan+"x"+i+"="+gugudan*i);
        }
    }    
    
    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  gugudan
     * @return  없음
     */
    public void calculateGugudan(int gugudan){
        for(int i=1 ; i<=9; i++){
            System.out.print(gugudan+"x"+i+"="+gugudan*i);
        }
    }
    
    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public void setGugudan(int gugudan){
        this.gugudan=gugudan;
        }   
}