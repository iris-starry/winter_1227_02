package info.view;

import java.util.ArrayList;
import info.vo.StudentVo;

//학생 정보를 출력하는 Object
public class StudentView {
	public void View(ArrayList<StudentVo> svoList) {
		
		//개선된(enhanced) for문
		for(StudentVo svo : svoList) {
			System.out.print("성명: "+svo.getName()+"\t");
			System.out.print("학번: "+svo.getStuId()+"\t");
			System.out.print("학년: "+svo.getGrade()+"\t");
			System.out.print("전공: "+svo.getMajor()+"\n");
			System.out.print("핸드폰: "+svo.getMobile()+"\n");
		
		}
		
	}
}
