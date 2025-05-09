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
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class AdminCourseCreateView extends JPanel{

	private JButton jbtnAdminCourseCreate;
	private JButton jbtnAdminCourseClose;
	
	public AdminCourseCreateView(){
		
		setLayout(new BorderLayout());
		
		// ---------- 왼쪽 입력 패널 ----------
        JPanel jpAdminCourseCreateViewPanel = new JPanel(new GridBagLayout());
        jpAdminCourseCreateViewPanel.setBorder(new EmptyBorder(15, 15, 15, 15));
        jpAdminCourseCreateViewPanel.setMinimumSize(new Dimension(350, 400));
        jpAdminCourseCreateViewPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 4, 8, 4);
        gbc.anchor = GridBagConstraints.WEST;

        //JLabel, Field 사이즈 설정
        Dimension labelSize = new Dimension(100, 22);
        Dimension fieldSize = new Dimension(200, 22);

        //Component 생성
        //기수 Component 생성
        JLabel jlblAdminCourseCardinalTitle = new JLabel("기수");
        JTextField jtfAdminCourseCardinalText = new JTextField();
        jlblAdminCourseCardinalTitle.setPreferredSize(labelSize);
        jtfAdminCourseCardinalText.setPreferredSize(fieldSize);
        
        //과정명 Component 생성
        JLabel jlblAdminCourseNameTitle = new JLabel("과정명");
        JTextField jtfAdminCourseNameText = new JTextField();
        jlblAdminCourseNameTitle.setPreferredSize(labelSize);
        jtfAdminCourseNameText.setPreferredSize(fieldSize);
        
        //진행상태 Component 생성
        JLabel jlblAdminCourseStatusTitle = new JLabel("진행상태");
        JTextField jtfAdminCourseStatusText = new JTextField();
        jlblAdminCourseStatusTitle.setPreferredSize(labelSize);
        jtfAdminCourseStatusText.setPreferredSize(fieldSize);
        
        //담당강사 Component 생성
        JLabel jlblAdminCourseInstructorNameTitle = new JLabel("담당강사");
        String[] strAdminCourseInstructorNameTitle = {
        		"곽우신", "곽우심", "박우신", "강우신"
        };
        JComboBox<String> jcbAdminCourseInstructorNameBox = new JComboBox<String>(strAdminCourseInstructorNameTitle);
        jlblAdminCourseInstructorNameTitle.setPreferredSize(labelSize);
        jcbAdminCourseInstructorNameBox.setPreferredSize(fieldSize);
        
        //시작일 Component 생성
        JLabel jlblAdminCourseStartdateTitle = new JLabel("시작일");
        JTextField jtfAdminCourseStartdateText = new JTextField();
        jlblAdminCourseStartdateTitle.setPreferredSize(labelSize);
        jtfAdminCourseStartdateText.setPreferredSize(fieldSize);
        
        //종료일 Component 생성
        JLabel jlblAdminCourseEnddateTitle = new JLabel("종료일");
        JTextField jtfAdminCourseEnddateText = new JTextField();
        jlblAdminCourseEnddateTitle.setPreferredSize(labelSize);
        jtfAdminCourseEnddateText.setPreferredSize(fieldSize);
        
        //Button 생성
        JPanel jpAdminCourseCreateViewButtonPanel = new JPanel();
        jpAdminCourseCreateViewButtonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        jbtnAdminCourseCreate = new JButton("등록");
        jbtnAdminCourseClose = new JButton("닫기");
        
        jpAdminCourseCreateViewButtonPanel.add(jbtnAdminCourseCreate);
        jpAdminCourseCreateViewButtonPanel.add(jbtnAdminCourseClose);
        
        //Component 배치
        //과정명 Component 배치
        gbc.gridx = 0; gbc.gridy = 0;
        jpAdminCourseCreateViewPanel.add(jlblAdminCourseNameTitle, gbc);
        gbc.gridx = 1;
        jpAdminCourseCreateViewPanel.add(jtfAdminCourseNameText, gbc);
        
        //기수 Component 배치
        gbc.gridx = 0; gbc.gridy = 1;
        jpAdminCourseCreateViewPanel.add(jlblAdminCourseCardinalTitle, gbc);
        gbc.gridx = 1;
        jpAdminCourseCreateViewPanel.add(jtfAdminCourseCardinalText, gbc);
        
        //진행상태 Component 배치
        gbc.gridx = 0; gbc.gridy = 2;
        jpAdminCourseCreateViewPanel.add(jlblAdminCourseStatusTitle, gbc);
        gbc.gridx = 1;
        jpAdminCourseCreateViewPanel.add(jtfAdminCourseStatusText, gbc);
        
        //담당강사 Component 배치
        gbc.gridx = 0; gbc.gridy = 3;
        jpAdminCourseCreateViewPanel.add(jlblAdminCourseInstructorNameTitle, gbc);
        gbc.gridx = 1;
        jpAdminCourseCreateViewPanel.add(jcbAdminCourseInstructorNameBox, gbc);
        
        //시작일 Component 배치
        gbc.gridx = 0; gbc.gridy = 4;
        jpAdminCourseCreateViewPanel.add(jlblAdminCourseStartdateTitle, gbc);
        gbc.gridx = 1;
        jpAdminCourseCreateViewPanel.add(jtfAdminCourseStartdateText, gbc);
        
        //종료일 Component 배치
        gbc.gridx = 0; gbc.gridy = 5;
        jpAdminCourseCreateViewPanel.add(jlblAdminCourseEnddateTitle, gbc);
        gbc.gridx = 1;
        jpAdminCourseCreateViewPanel.add(jtfAdminCourseEnddateText, gbc);
        
        //버튼 Component 배치
        gbc.gridx = 0; gbc.gridy = 6;
        gbc.gridwidth = 2;  // 두 열을 합쳐서 버튼들을 가운데로 배치
        jpAdminCourseCreateViewPanel.add(jpAdminCourseCreateViewButtonPanel, gbc);
        
        //Panel 배치
        setLayout(new BorderLayout());
        add(jpAdminCourseCreateViewPanel, BorderLayout.WEST);
        
        //Button 이벤트 생성
        AdminCourseCreateEvt acce = new AdminCourseCreateEvt(this);
        jbtnAdminCourseCreate.addActionListener(acce);
        jbtnAdminCourseClose.addActionListener(acce);

	} //AdminCourseCreateView

	//getter method
	public JButton getJbtnAdminCourseCreate() {
		return jbtnAdminCourseCreate;
	} //getJbtnAdminCourseCreate

	public JButton getJbtnAdminCourseClose() {
		return jbtnAdminCourseClose;
	} //getJbtnAdminCourseClose
	
} //class
