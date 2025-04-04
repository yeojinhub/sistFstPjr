package kr.co.sist.yj;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class AdminAccountInstructorAccountModifyEvt implements ActionListener {

	@SuppressWarnings("unused")
	private AdminAccountInstructorAccountModifyView aaiamv;
	
	private JButton jbtnAdminAccountInstructorAccountModify;
	private JButton jbtnAdminAccountInstructorAccountClose;
	
	public AdminAccountInstructorAccountModifyEvt(AdminAccountInstructorAccountModifyView aaiamv){
		this.aaiamv=aaiamv;
		this.jbtnAdminAccountInstructorAccountModify=aaiamv.getJbtnAdminAccountInstructorAccountModify();
		this.jbtnAdminAccountInstructorAccountClose=aaiamv.getJbtnAdminAccountInstructorAccountClose();
	} //AdminAccountInstructorAccountModifyEvt
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		Object source = ae.getSource();
		
		if( source == jbtnAdminAccountInstructorAccountModify ) {
			System.out.println("수정 버튼 실행");
		} //end if
		if( source == jbtnAdminAccountInstructorAccountClose ) {
			System.out.println("닫기 버튼 실행");
		} //end if
	} //actionPerformed

} //class
