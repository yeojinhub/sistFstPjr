package kr.co.sist.yj;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class AdminAccountStudentAccountCreateEvt implements ActionListener {
	
	private AdminAccountStudentAccountCreateView stuCreateView;
	
	private JButton stuCreateButton;
    private JButton stuCloseButton;
    
    public AdminAccountStudentAccountCreateEvt(AdminAccountStudentAccountCreateView stuCreateView) {
    	
    	this.stuCreateView=stuCreateView;
    	this.stuCreateButton=stuCreateView.getStuCreateButton();
    	this.stuCloseButton=stuCreateView.getStuCloseButton();
    	
    } //AdminAccountStudentAccountCreateEvt

	private void inputFieldReset() {
		
		//입력 field 초기화
		stuCreateView.getStuNameTextSet().setText("");
		stuCreateView.getStuPassTextSet().setText("");
		stuCreateView.getStuBirthTextSet().setText("");
		stuCreateView.getStuTelTextSet().setText("");
		stuCreateView.getStuStatusTextSet().setText("");
		
		//field focus
		stuCreateView.getStuNameTextSet().requestFocus();
		
	} //inputFieldReset
	
	public void addMember() {
		
		//VO에 입력 값 저장
		AdminAccountStudentAccountInfoVO stuVO = new AdminAccountStudentAccountInfoVO();
		stuVO.setStuName( stuCreateView.getStuNameTextSet().getText().trim() );
		char[] studentPasswordArray = stuCreateView.getStuPassTextSet().getPassword();
		String strStudentPassword = new String(studentPasswordArray).trim();
		stuVO.setStuPass( strStudentPassword );
		String strStudentBirth = new String( stuCreateView.getStuBirthTextSet().getText().trim() );

		if( !strStudentBirth.isEmpty() ) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			java.util.Date parsedDate;
			try {
				parsedDate = sdf.parse(strStudentBirth);
				Date studentBirthDate = new Date(parsedDate.getTime());
				stuVO.setStuBirth(studentBirthDate);
			} catch (ParseException pe) {
				pe.printStackTrace();
			} //end try catch
		} else {
			stuVO.setStuBirth( null );
		} //end if else
		stuVO.setStuTel( stuCreateView.getStuTelTextSet().getText().trim() );
		stuVO.setStuAdd( stuCreateView.getStuAddTextSet().getText().trim() );
		stuVO.setStuStatus( stuCreateView.getStuStatusTextSet().getText().trim() );
		
		//메세지 생성
		boolean flag = false;
		switch(JOptionPane.showConfirmDialog(stuCreateView, "학생 계정을 생성 하시겠습니까?", "생성 확인", JOptionPane.YES_NO_OPTION)) {
		case JOptionPane.OK_OPTION : {
			AdminAccountStudentAccountInfoService stuService = new AdminAccountStudentAccountInfoService();
			flag = stuService.addStudentAccountMember(stuVO);
			if(flag) {
				JOptionPane.showMessageDialog(stuCreateView, "학생 계정을 생성했습니다.");
			} else {
				JOptionPane.showMessageDialog(stuCreateView, "학생 계정 생성을 취소하였습니다.");
			} //end if else
			break;
		} //end case
		} //end switch case
		
		//입력 field 초기화
		inputFieldReset();
		
	} //addMember
	
	private void closeCreateJDialog() {
		
		Window adminAccountStudentAccountCreateWindow = SwingUtilities.getWindowAncestor(stuCreateView);
		if(adminAccountStudentAccountCreateWindow instanceof JDialog) {
			((JDialog) adminAccountStudentAccountCreateWindow).dispose();
		} //end if
		
	} //closeCreateJDialog

	@Override
	public void actionPerformed(ActionEvent ae) {
		Object source=ae.getSource();
		
		if( source == stuCreateButton ) {
			System.out.println("생성 버튼 실행");
			addMember();
		} //end if
		
		if( source == stuCloseButton ) {
			System.out.println("닫기 버튼 실행");
			closeCreateJDialog();
		} //end if
		
	} //actionPerformed
	
} //class
