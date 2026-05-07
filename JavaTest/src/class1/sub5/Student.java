package class1.sub5;

public class Student {
	private String name; // 학생 이름
	private String studentId; // 학생 아이디
	private Subject[] subjects; // 학생이 수강하는 과목 배열
	private int[] scores; // 학생의 각 과목 성적 배열
	private int subjectCount; // 현재 수강 중인 과목 수
	
	public Student(String name, String studentId) {
		this.name = name;
		this.studentId = studentId;
		subjects = new Subject[10];
		scores = new int[10];
		subjectCount = 0;
	}
	
	public String getName() { return name; }
	
	public void enrollSubject(Subject sub) {
		for (Subject s : subjects) { // 중복 확인
			if (s != sub) continue;
			
			System.out.println(sub.getSubName() + "는/은 이미 수강중인 과목입니다.");
			return;
		}
		
		subjectCount++; // 수강중인 과목 개수 증가
		sub.addStudent(this); // 과목에도 수강한다고 알려주기
		
		if (subjectCount > subjects.length) { // 현재 수강중인 과목의 수가 배열의 최대 길이 초과시
			Subject[] newSubjects = new Subject[subjectCount]; // 현재 수강중인 과목의 수만큼 새로운 과목 배열 생성
			int[] newScores = new int[subjectCount]; // 현재 수강중인 과목의 수만큼 새로운 점수 배열 생성
			
			for (int i = 0; i < subjects.length; i++) { // 이전에 수강중이던 과목의 수만큼 배열 조회
				newSubjects[i] = subjects[i]; // 이전 배열에서 새로운 배열로 값 복사
				newScores[i] = scores[i]; // 이전 배열에서 새로운 배열로 값 복사
			}
			
			subjects = newSubjects; // 새로운 배열로 초기화
			scores = newScores; // 새로운 배열로 초기화
		}

		int index = subjectCount - 1; // 새로 추가된 과목의 인덱스
		subjects[index] = sub; // 과목 초기화
		scores[index] = 0; // 과목 점수 0으로 초기화
		
		System.out.printf("%s - %s 과목 신청완료\n", name, sub.getSubName());
	}
	
	public void setScore(Subject sub, int score) {
		int index = -1; // 인덱스 초기화
		
		for (int i = 0; i < subjectCount; i++) { // 조회할 과목의 인덱스 찾기
			if (subjects[i] == null) break;
			
			if (subjects[i] == sub) {
				index = i;
				break;
			}
		}
		
		if (index > -1) { // 과목을 수강중인 경우
			scores[index] = score;
			System.out.printf("%s - %s 점수 입력 완료\n", name, sub.getSubName());
		} else { // 과목을 수강중이지 않은 경우
			System.out.println("현재 수강중인 과목에 " + sub.getSubName() + "이/가 없습니다.");
		}
	}
	
	public void printStudentInfo() {
		System.out.println("학생명 : " + name);
		System.out.println("아이디 : " + studentId);
		System.out.println("성적");
		
		for (int i = 0; i < subjectCount; i++) {
			if (subjects[i] == null) break;
			
			System.out.printf(" - %s:%d\n", subjects[i].getSubName(), scores[i]);
		}
	}
}
