//package kr.co.sist.view;
package kr.co.sist.jtg;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class AdminAccountStudentAccountCreateView extends JPanel{
	
	private JButton jbtnAdminAccountStudentAccountCreate;
    private JButton jbtnAdminAccountStudentAccountClose;
	
    public AdminAccountStudentAccountCreateView() {
    	setLayout(new BorderLayout());

        // ---------- 왼쪽 입력 패널 ----------
        JPanel jpAdminAccountStudentAccountCreateViewPanel = new JPanel(new GridBagLayout());
        jpAdminAccountStudentAccountCreateViewPanel.setBorder(new EmptyBorder(15, 15, 15, 15));
        jpAdminAccountStudentAccountCreateViewPanel.setMinimumSize(new Dimension(350, 400));
        jpAdminAccountStudentAccountCreateViewPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 4, 8, 4);
        gbc.anchor = GridBagConstraints.WEST;

        //JLabel, Field 사이즈 설정
        Dimension labelSize = new Dimension(100, 22);
        Dimension fieldSize = new Dimension(200, 22);

        //Component 생성
        //이름 Component 생성
        JLabel jlblAdminAccountStudentAccountNameTitle = new JLabel("이름");
        JTextField jtfAdminAccountStudentAccountNameText = new JTextField();
        jlblAdminAccountStudentAccountNameTitle.setPreferredSize(labelSize);
        jtfAdminAccountStudentAccountNameText.setPreferredSize(fieldSize);
        
        //비밀번호 Component 생성
        JLabel jlblAdminAccountStudentAccountPassTitle = new JLabel("비밀번호");
        JPasswordField jpfAdminAccountStudentAccountPassText = new JPasswordField();
        jlblAdminAccountStudentAccountPassTitle.setPreferredSize(labelSize);
        jpfAdminAccountStudentAccountPassText.setPreferredSize(fieldSize);

        //생년월일 Component 생성
        JLabel jlblAdminAccountStudentAccountBirthTitle = new JLabel("생년월일");
        JTextField jtfAdminAccountStudentAccountBirthText = new JTextField();
        jlblAdminAccountStudentAccountBirthTitle.setPreferredSize(labelSize);
        jtfAdminAccountStudentAccountBirthText.setPreferredSize(fieldSize);
        
        //전화번호 Component 생성
        JLabel jlblAdminAccountStudentAccountTelTitle = new JLabel("전화번호");
        JTextField jtfAdminAccountStudentAccountTelText = new JTextField();
        jlblAdminAccountStudentAccountTelTitle.setPreferredSize(labelSize);
        jtfAdminAccountStudentAccountTelText.setPreferredSize(fieldSize);

        //주소 Component 생성
        JLabel jlblAdminAccountStudentAccountAddressTitle = new JLabel("주소");
        JTextField jtfAdminAccountStudentAccountAddressText = new JTextField();
        jlblAdminAccountStudentAccountAddressTitle.setPreferredSize(labelSize);
        jtfAdminAccountStudentAccountAddressText.setPreferredSize(fieldSize);
        
        //과정명 Component 생성
        JLabel jlblAdminAccountStudentAccountCourseNameTitle = new JLabel("과정명");
        jlblAdminAccountStudentAccountCourseNameTitle.setPreferredSize(labelSize);
        String[] strAdminAccountStudentAccountCourseNameTitle = {" AWS와 Docker & Kubernetes", "Flutter Framework"};
        JComboBox<String> jcbAdminAccountStudentAccountCourseNameBox = new JComboBox<String>(strAdminAccountStudentAccountCourseNameTitle);
        jcbAdminAccountStudentAccountCourseNameBox.setPreferredSize(fieldSize);
        
        //강사 Component 생성
        JLabel jlblAdminAccountStudentAccountInstructorNameTitle = new JLabel("담당 강사");
        JTextField jtfAdminAccountStudentAccountInstructorNameText = new JTextField();
        jlblAdminAccountStudentAccountInstructorNameTitle.setPreferredSize(labelSize);
        jtfAdminAccountStudentAccountInstructorNameText.setPreferredSize(fieldSize);
        
        //상태 Component 생성
        JLabel jlblAdminAccountStudentAccountStatusTitle = new JLabel("상태");
        JTextField jtfAdminAccountStudentAccountStatusText = new JTextField();
        jlblAdminAccountStudentAccountStatusTitle.setPreferredSize(labelSize);
        jtfAdminAccountStudentAccountStatusText.setPreferredSize(fieldSize);
        
        //교육기간 Component 생성
        JLabel jlblAdminAccountStudentAccountCourseDateTitle = new JLabel("교육 기간");
        JTextField jtfAdminAccountStudentAccountCourseDateText = new JTextField();
        jlblAdminAccountStudentAccountCourseDateTitle.setPreferredSize(labelSize);
        jtfAdminAccountStudentAccountCourseDateText.setPreferredSize(fieldSize);
        
        //기수 Component 생성
        JLabel jlblAdminAccountStudentAccountCardinalTitle = new JLabel("기수");
        JTextField jtfAdminAccountStudentAccountCardinalText = new JTextField();
        jlblAdminAccountStudentAccountCardinalTitle.setPreferredSize(labelSize);
        jtfAdminAccountStudentAccountCardinalText.setPreferredSize(fieldSize);
        
        //Button 생성
        JPanel jpAdminAccountStudentAccountCreateViewButtonPanel = new JPanel();
        jpAdminAccountStudentAccountCreateViewButtonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        jbtnAdminAccountStudentAccountCreate = new JButton("생성");
        jbtnAdminAccountStudentAccountClose = new JButton("닫기");
        
        jpAdminAccountStudentAccountCreateViewButtonPanel.add(jbtnAdminAccountStudentAccountCreate);
        jpAdminAccountStudentAccountCreateViewButtonPanel.add(jbtnAdminAccountStudentAccountClose);
        
        //Component 배치
        //이름 Component 배치
        gbc.gridx = 0; gbc.gridy = 0;
        jpAdminAccountStudentAccountCreateViewPanel.add(jlblAdminAccountStudentAccountNameTitle, gbc);
        gbc.gridx = 1;
        jpAdminAccountStudentAccountCreateViewPanel.add(jtfAdminAccountStudentAccountNameText, gbc);
        
        //비밀번호 Component 배치
        gbc.gridx = 0; gbc.gridy = 1;
        jpAdminAccountStudentAccountCreateViewPanel.add(jlblAdminAccountStudentAccountPassTitle, gbc);
        gbc.gridx = 1;
        jpAdminAccountStudentAccountCreateViewPanel.add(jpfAdminAccountStudentAccountPassText, gbc);

        //생년월일 Component 배치
        gbc.gridx = 0; gbc.gridy = 2;
        jpAdminAccountStudentAccountCreateViewPanel.add(jlblAdminAccountStudentAccountBirthTitle, gbc);
        gbc.gridx = 1;
        jpAdminAccountStudentAccountCreateViewPanel.add(jtfAdminAccountStudentAccountBirthText, gbc);
        
        //전화번호 Component 배치
        gbc.gridx = 0; gbc.gridy = 3;
        jpAdminAccountStudentAccountCreateViewPanel.add(jlblAdminAccountStudentAccountTelTitle, gbc);
        gbc.gridx = 1;
        jpAdminAccountStudentAccountCreateViewPanel.add(jtfAdminAccountStudentAccountTelText, gbc);

        //주소 Component 배치
        gbc.gridx = 0; gbc.gridy = 4;
        jpAdminAccountStudentAccountCreateViewPanel.add(jlblAdminAccountStudentAccountAddressTitle, gbc);
        gbc.gridx = 1;
        jpAdminAccountStudentAccountCreateViewPanel.add(jtfAdminAccountStudentAccountAddressText, gbc);
        
        //과정명 Component 배치
        gbc.gridx = 0; gbc.gridy = 5;
        jpAdminAccountStudentAccountCreateViewPanel.add(jlblAdminAccountStudentAccountCourseNameTitle, gbc);
        gbc.gridx = 1;
        jpAdminAccountStudentAccountCreateViewPanel.add(jcbAdminAccountStudentAccountCourseNameBox, gbc);
        
        //담당강사 Component 배치
        gbc.gridx = 0; gbc.gridy = 6;
        jpAdminAccountStudentAccountCreateViewPanel.add(jlblAdminAccountStudentAccountInstructorNameTitle, gbc);
        gbc.gridx = 1;
        jpAdminAccountStudentAccountCreateViewPanel.add(jtfAdminAccountStudentAccountInstructorNameText, gbc);
        
        //교육기간 Component 배치
        gbc.gridx = 0; gbc.gridy = 7;
        jpAdminAccountStudentAccountCreateViewPanel.add(jlblAdminAccountStudentAccountCourseDateTitle, gbc);
        gbc.gridx = 1;
        jpAdminAccountStudentAccountCreateViewPanel.add(jtfAdminAccountStudentAccountCourseDateText, gbc);
        
        //상태 Component 배치
        gbc.gridx = 0; gbc.gridy = 8;
        jpAdminAccountStudentAccountCreateViewPanel.add(jlblAdminAccountStudentAccountStatusTitle, gbc);
        gbc.gridx = 1;
        jpAdminAccountStudentAccountCreateViewPanel.add(jtfAdminAccountStudentAccountStatusText, gbc);
        
        //기수 Component 배치
        gbc.gridx = 0; gbc.gridy = 9;
        jpAdminAccountStudentAccountCreateViewPanel.add(jlblAdminAccountStudentAccountCardinalTitle, gbc);
        gbc.gridx = 1;
        jpAdminAccountStudentAccountCreateViewPanel.add(jtfAdminAccountStudentAccountCardinalText, gbc);
        
        //버튼 Component 배치
        gbc.gridx = 0; gbc.gridy = 10;
        gbc.gridwidth = 2;  // 두 열을 합쳐서 버튼들을 가운데로 배치
        jpAdminAccountStudentAccountCreateViewPanel.add(jpAdminAccountStudentAccountCreateViewButtonPanel, gbc);

        //Panel 배치
        add(jpAdminAccountStudentAccountCreateViewPanel);
        
        //Button 이벤트 생성
        AdminAccountStudentAccountCreateEvt aasace = new AdminAccountStudentAccountCreateEvt(this); 
        jbtnAdminAccountStudentAccountCreate.addActionListener(aasace);
        jbtnAdminAccountStudentAccountClose.addActionListener(aasace);
        
    } //AdminAccountStudentAccountView

    //getter method
	public JButton getJbtnAdminAccountStudentAccountCreate() {
		return jbtnAdminAccountStudentAccountCreate;
	} //getJbtnAdminAccountStudentAccountCreate

	public JButton getJbtnAdminAccountStudentAccountClose() {
		return jbtnAdminAccountStudentAccountClose;
	} //getJbtnAdminAccountStudentAccountClose
	
} //class
