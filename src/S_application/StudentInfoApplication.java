package S_application;

import S_school.*;
import S_school.report.GenerateGradeReport;
import S_utils.Define;

// 전반적인 생성 담당
public class StudentInfoApplication {
	
	School goodSchool = School.getInstance(); // 싱글턴 방식으로 학교 객체 리턴받고 필드에 대입
	Subject korean; // 국어과목 생성
	Subject math; // 수학과목 생성
	GenerateGradeReport gradeReport = new GenerateGradeReport(); // 출력할 정보창 생성
	
	public static void main(String[] args) {
		
		StudentInfoApplication test = new StudentInfoApplication();
		
		test.createSubject();
		test.createStudent();
		
		String report = test.gradeReport.getReport(); // 성적 결과 생성
		System.out.println(report);	// 결과 총 출력
	}
	
	// 과목생성
	public void createSubject() {
		korean = new Subject("국어", Define.KOREA);
		math = new Subject("수학", Define.MATH);
		
		// 학교에 과목을 넣어준다
		goodSchool.addSubject(korean);
		goodSchool.addSubject(math);
	}
	
	// 학생생성
	public void createStudent() {
		// 학생생성
		Student student1 = new Student(181213, "박지은", korean);
		Student student2 = new Student(181518, "차슬기", math);
		Student student3 = new Student(171230, "이현욱", korean);
		Student student4 = new Student(171255, "임지연", korean);
		Student student5 = new Student(171590, "김재현", math);
		
		// 학교에 등록
		goodSchool.addStudent(student1);
		goodSchool.addStudent(student2);
		goodSchool.addStudent(student3);
		goodSchool.addStudent(student4);
		goodSchool.addStudent(student5);
		
		// 수강신청
		korean.register(student1);
		korean.register(student2);
		korean.register(student3);
		korean.register(student4);
		korean.register(student5);
		
		math.register(student1);
		math.register(student2);
		math.register(student3);
		math.register(student4);
		math.register(student5);
		
		// 학생의 과목별 (국어, 수학) 점수추가
		addScoreForStudent(student1, korean, 95);
		addScoreForStudent(student1, math, 56);

		addScoreForStudent(student2, korean, 95);
		addScoreForStudent(student2, math, 95);
		
		addScoreForStudent(student3, korean, 100);
		addScoreForStudent(student3, math, 88);
		
		addScoreForStudent(student4, korean, 89);
		addScoreForStudent(student4, math, 95);
		
		addScoreForStudent(student5, korean, 85);
		addScoreForStudent(student5, math, 56);
	}
	
	// 학생마다 과목별(국어,수학) 점수 추가 
	public void addScoreForStudent(Student student, Subject subject, int point) {
		Score score = new Score(student.getStudentId(), subject, point);
		student.addSubjectScore(score);
	}
}
