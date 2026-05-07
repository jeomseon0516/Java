package class1.sub5;

public class Subject {
	private String subName; // 과목 이름
	private Student[] students; // 과목을 수강하는 학생 배열
	private int studentCount; // 현재 수강 중인 학생 수
	
	public Subject(String subName) {
		this.subName = subName;
		students = new Student[10];
		studentCount = 0;
	}
	
	public String getSubName() { return subName; }
	
	public void addStudent(Student student) {
		for (Student s : students) { // 중복 확인
			if (s != student) continue;
			
			System.out.println(student.getName() + "은/는 이미 수강 중입니다.");
			return;
		}
		
		studentCount++; // 수강중인 학생수 증가
		if (studentCount > students.length) { // 현재 수강중인 학생의 수가 배열의 길이보다 큰 경우
			Student[] newStudents = new Student[studentCount]; // 새로운 배열 생성
			
			for (int i = 0; i < students.length; i++) { // 현재 배열의 수만큼 배열 요소 조회
				newStudents[i] = students[i]; // 새로운 배열로 기존 배열의 값 복사
			}
			
			students = newStudents; // 새로운 배열로 초기화
		}
		
		students[studentCount - 1] = student; // 새로 수강할 과목 초기화
	}
	
	public void printSubjectInfo() {
		System.out.println("과목명 : " + subName);
		
		System.out.print("수강생 : ");
		for (Student student : students) {
			if (student == null) break;
			
			System.out.print(student.getName() + ", ");
		}
		System.out.println();
	}
}
