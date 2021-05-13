
public class Student extends User{
	private int studentNumber;
	private String[] lessonHas;
	public Student() {}
	public Student(int studentNumber,String[] lessonsHas) {
		this.lessonHas=lessonsHas;
		this.studentNumber=studentNumber;
	}
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String[] getLessonHas() {
		return lessonHas;
	}
	public void setLessonHas(String[] lessonHas) {
		this.lessonHas = lessonHas;
	}
}
