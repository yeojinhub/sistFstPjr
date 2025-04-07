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

public class AdminAccountInstructorAccountCreateEvt implements ActionListener {

	private AdminAccountInstructorAccountCreateView aaiacView;
	
	private JButton jbtnAdminAccountInstructorAccountCreate;
	private JButton jbtnAdminAccountInstructorAccountClose;
	
	public AdminAccountInstructorAccountCreateEvt(AdminAccountInstructorAccountCreateView aaiacView) {
		this.aaiacView=aaiacView;
		this.jbtnAdminAccountInstructorAccountCreate=aaiacView.getJbtnAdminAccountInstructorAccountCreate();
		this.jbtnAdminAccountInstructorAccountClose=aaiacView.getJbtnAdminAccountInstructorAccountClose();
	} //AdminAccountInstructorAccountCreateEvt
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		Object source = ae.getSource();
		
		if( source == jbtnAdminAccountInstructorAccountCreate ) {
			System.out.println("생성 버튼 실행");
			addMember();
		} //end if
		
		if( source == jbtnAdminAccountInstructorAccountClose ) {
			System.out.println("닫기 버튼 실행");
			Window adminAccountInstructorAccountCreateWindow = SwingUtilities.getWindowAncestor(aaiacView);
            if(adminAccountInstructorAccountCreateWindow instanceof JDialog) {
                ((JDialog) adminAccountInstructorAccountCreateWindow).dispose();
            } //end if
		} //end if
		
	} //actionPerformed
	
	private void inputFieldReset() {
		
		//입력 field 초기화
		aaiacView.getJtfAdminAccountInstructorAccountNameSet().setText("");
		aaiacView.getJpfAdminAccountInstructorAccountPassSet().setText("");
		aaiacView.getJtfAdminAccountInstructorAccountBirthSet().setText("");
		aaiacView.getJtfAdminAccountInstructorAccountTelSet().setText("");
		aaiacView.getJtfAdminAccountInstructorAccountAddressSet().setText("");
		
		//field focus
		aaiacView.getJtfAdminAccountInstructorAccountNameSet().requestFocus();
		
	} //inputFieldReset
	
	public void addMember() {
		
		//VO에 입력 값 저장
		AdminAccountInstructorAccountCreateVO aaiacVO = new AdminAccountInstructorAccountCreateVO();
		aaiacVO.setInst_name( aaiacView.getJtfAdminAccountInstructorAccountNameSet().getText().trim() );
		char[] instructorPasswordArray = aaiacView.getJpfAdminAccountInstructorAccountPassSet().getPassword();
		String strStudentPassword = new String(instructorPasswordArray).trim();
		aaiacVO.setInst_pass( strStudentPassword );
		String strInstructorBirth = new String( aaiacView.getJtfAdminAccountInstructorAccountBirthSet().getText().trim() );

		if( !strInstructorBirth.isEmpty() ) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			java.util.Date parsedDate;
			try {
				parsedDate = sdf.parse(strInstructorBirth);
				Date instructorBirthDate = new Date(parsedDate.getTime());
				aaiacVO.setInst_birth(instructorBirthDate);
			} catch (ParseException pe) {
				pe.printStackTrace();
			} //end try catch
		} else {
			aaiacVO.setInst_birth( null );
		} //end if else
		aaiacVO.setInst_tel( aaiacView.getJtfAdminAccountInstructorAccountTelSet().getText().trim() );
		aaiacVO.setInst_add( aaiacView.getJtfAdminAccountInstructorAccountAddressSet().getText().trim() );
		
		//메세지 생성
		AdminAccountInstructorAccountCreateService aaiacService = new AdminAccountInstructorAccountCreateService();
		String out_msg="강사 계정이 생성되지 않았습니다.";
		if( aaiacService.addInstructorAccountMember(aaiacVO) ) {
			out_msg="강사 계정이 생성되었습니다.";
		} //end if
		
		//입력 field 초기화
		inputFieldReset();
		
		//메세지 출력
		JOptionPane.showMessageDialog(aaiacView, out_msg);
		
	} //addMember

} //class
