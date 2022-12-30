package info.vo;

import java.util.ArrayList;

//Data Access Object
public class StudentDAO {
	ArrayList<StudentVo> svoList = new ArrayList<StudentVo>();
	
	//insert: ArrayList에 학생정보객체(StudnetVo)를 추가하는 메소드
	public void insert(StudentVo svo) {
		svoList.add(svo);
	}
	//select() : 학생정보들이 저장된 ArrayList객체 참조값을 반환
	public ArrayList<StudentVo> select(){
		return svoList;
	}
}
