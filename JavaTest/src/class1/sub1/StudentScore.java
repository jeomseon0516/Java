package class1.sub1;

public class StudentScore {
	private String studentName; // 학생 이름
	private String studentId; // 학생 아이디
	private String subject; // 과목명
	private double score; // 과목 점수
	
	public StudentScore(String studentName, String studentId, String subject, double score) {
		this.studentName = studentName;
		this.studentId = studentId;
		this.subject = subject;
		this.score = score;
	}
	
	public double getScore() { return score; }
	
	public void updateScore(double newScore) {
		if (newScore < 0 || newScore > 100) {
			System.out.println("잘못된 점수 입력");
			return;
		}
		
		System.out.println("점수 수정 완료");
		score = newScore;
	}
	
	public void printStudentInfo() {
		System.out.println("학생 이름 : " + studentName);
		System.out.println("학생 ID : " + studentId);
		System.out.println("과목명 : " + subject);
		System.out.println("점수 : " + score);
	}
}
