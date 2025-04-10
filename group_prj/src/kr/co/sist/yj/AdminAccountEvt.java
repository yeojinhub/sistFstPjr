//package kr.co.sist.evt;
package kr.co.sist.yj;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

//import kr.co.sist.view.AdminAccountView;

public class AdminAccountEvt implements ActionListener {

	@SuppressWarnings("unused")
	private AdminAccountView aaView;

	private JPanel jpAdminAccountViewCardPanel;
	private CardLayout clAdminAccountCard;

	private JButton jbtnAdminAccountStudentAccount;
	private JButton jbtnAdminAccountInstructorAccount;
	private JButton jbtnAdminAccountAdminAccount;

	public AdminAccountEvt(AdminAccountView aaView) {
		this.aaView = aaView;
		this.jpAdminAccountViewCardPanel = aaView.getJpAdminAccountViewCardPanel();
		this.clAdminAccountCard = aaView.getClAdminAccountViewCard();
		this.jbtnAdminAccountStudentAccount = aaView.getJbtnAdminAccountStudentAccount();
		this.jbtnAdminAccountInstructorAccount = aaView.getJbtnAdminAccountInstructorAccount();
		this.jbtnAdminAccountAdminAccount = aaView.getJbtnAdminAccountAdminAccount();
	} // AdminAccountEvt

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == jbtnAdminAccountStudentAccount) {
			clAdminAccountCard.show(jpAdminAccountViewCardPanel, "StudentAccountView");
			System.out.println("수강생계정관리 버튼 실행");
		} // end if
		if (ae.getSource() == jbtnAdminAccountInstructorAccount) {
			clAdminAccountCard.show(jpAdminAccountViewCardPanel, "InstructorAccountView");
			System.out.println("강사계정관리 버튼 실행");
		} // end if
		if (ae.getSource() == jbtnAdminAccountAdminAccount) {
			clAdminAccountCard.show(jpAdminAccountViewCardPanel, "AdminAccountView");
			System.out.println("관리자계정관리 버튼 실행");
		} // end if
	} // actionPerformed

} // class
