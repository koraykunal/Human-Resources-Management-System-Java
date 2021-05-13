
public class Instructor extends User{
	private String lessonsGaving;
	public Instructor() {}
	public Instructor(String lessonsGaving) {
		this.lessonsGaving=lessonsGaving;
	}
	public String getLessonsGaving() {
		return lessonsGaving;
	}
	public void setLessonsGaving(String lessonsGaving) {
		this.lessonsGaving = lessonsGaving;
	}
}
