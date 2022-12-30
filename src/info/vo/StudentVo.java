package info.vo;

public class StudentVo {
	//성명, 학번, 학년, 전공, 전화번호
	private String name;
	private int stuId;
	private int grade;
	private String major;
	private String mobile;
	
	//setter: 필드 값 설정
	//getter: 필드 값 반환
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	@Override
	public String toString() {
		return "StudentVo [name=" + name + ", stuId=" + stuId + ", grade=" + grade + ", major=" + major + ", mobile="
				+ mobile + "]";
	}
	
	
	
}
