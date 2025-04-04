package kr.co.sist.kti;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class StudentExamScoreView extends JDialog {

	private JLabel jlblNameSet, jlblTeacherNameSet, jlblEndCourseSet, jlblScoreSet, jlblMyAnswerSet, jlblAnswerAvgSet;
	private JComboBox jcbSubjectSet;
	private JButton jbtnExit;

	public StudentExamScoreView() {
		setTitle("Best Campus - 성적표");
		
		// #. 백그라운드 색상 설정 및 수동배치 설정
		getContentPane().setBackground(new Color(255, 255, 255));
		getContentPane().setLayout(null);

		// #. 컴포넌트 추가 및 설정
		JPanel jpMain = new JPanel();
		jpMain.setBackground(new Color(255, 255, 255));
		jpMain.setBounds(6, 76, 420, 370);
		jpMain.setBorder(new TitledBorder(""));
		getContentPane().add(jpMain);
		jpMain.setLayout(null);
		
		JPanel jpTitle = new JPanel();
		jpTitle.setBackground(new Color(255, 255, 255));
		jpTitle.setBounds(6, 7, 420, 60);
		getContentPane().add(jpTitle);
		jpTitle.setBorder(new TitledBorder(""));
		jpTitle.setLayout(new BorderLayout(0, 0));

		JLabel jlblTitle = new JLabel("성적표");
		jpTitle.add(jlblTitle, BorderLayout.CENTER);
		jlblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		jlblTitle.setFont(new Font("맑은 고딕", Font.BOLD, 28));
		jlblTitle.setBackground(Color.WHITE);

		JLabel jlblName = new JLabel("학생명");
		jlblName.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		jlblName.setHorizontalAlignment(SwingConstants.CENTER);
		jlblName.setBounds(50, 50, 100, 25);
		jpMain.add(jlblName);

		JLabel jlblTeacher = new JLabel("담당강사");
		jlblTeacher.setHorizontalAlignment(SwingConstants.CENTER);
		jlblTeacher.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		jlblTeacher.setBounds(50, 90, 100, 25);
		jpMain.add(jlblTeacher);

		JLabel jlblEndCourse = new JLabel("교육종료");
		jlblEndCourse.setHorizontalAlignment(SwingConstants.CENTER);
		jlblEndCourse.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		jlblEndCourse.setBounds(50, 130, 100, 25);
		jpMain.add(jlblEndCourse);

		JLabel jlblSubject = new JLabel("과목");
		jlblSubject.setHorizontalAlignment(SwingConstants.CENTER);
		jlblSubject.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		jlblSubject.setBounds(50, 170, 100, 25);
		jpMain.add(jlblSubject);

		JLabel jlblScore = new JLabel("성적");
		jlblScore.setHorizontalAlignment(SwingConstants.CENTER);
		jlblScore.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		jlblScore.setBounds(50, 210, 100, 25);
		jpMain.add(jlblScore);

		JLabel jlblMyAnswer = new JLabel("정답수");
		jlblMyAnswer.setHorizontalAlignment(SwingConstants.CENTER);
		jlblMyAnswer.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		jlblMyAnswer.setBounds(50, 250, 100, 25);
		jpMain.add(jlblMyAnswer);

		JLabel jlblAnswerAvg = new JLabel("평균");
		jlblAnswerAvg.setHorizontalAlignment(SwingConstants.CENTER);
		jlblAnswerAvg.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		jlblAnswerAvg.setBounds(50, 290, 100, 25);
		jpMain.add(jlblAnswerAvg);

		jlblNameSet = new JLabel("강태일");
		jlblNameSet.setHorizontalAlignment(SwingConstants.CENTER);
		jlblNameSet.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		jlblNameSet.setBounds(260, 50, 100, 25);
		jpMain.add(jlblNameSet);

		jlblTeacherNameSet = new JLabel("곽우신");
		jlblTeacherNameSet.setHorizontalAlignment(SwingConstants.CENTER);
		jlblTeacherNameSet.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		jlblTeacherNameSet.setBounds(260, 90, 100, 25);
		jpMain.add(jlblTeacherNameSet);

		jlblEndCourseSet = new JLabel("2025-07-25");
		jlblEndCourseSet.setHorizontalAlignment(SwingConstants.CENTER);
		jlblEndCourseSet.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		jlblEndCourseSet.setBounds(260, 130, 100, 25);
		jpMain.add(jlblEndCourseSet);

		jlblScoreSet = new JLabel("A");
		jlblScoreSet.setHorizontalAlignment(SwingConstants.CENTER);
		jlblScoreSet.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		jlblScoreSet.setBounds(260, 210, 100, 25);
		jpMain.add(jlblScoreSet);

		jlblMyAnswerSet = new JLabel("9/10");
		jlblMyAnswerSet.setHorizontalAlignment(SwingConstants.CENTER);
		jlblMyAnswerSet.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		jlblMyAnswerSet.setBounds(260, 250, 100, 25);
		jpMain.add(jlblMyAnswerSet);

		jlblAnswerAvgSet = new JLabel("7/10");
		jlblAnswerAvgSet.setHorizontalAlignment(SwingConstants.CENTER);
		jlblAnswerAvgSet.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		jlblAnswerAvgSet.setBounds(260, 290, 100, 25);
		jpMain.add(jlblAnswerAvgSet);

		jcbSubjectSet = new JComboBox();
		jcbSubjectSet.setModel(new DefaultComboBoxModel(new String[] { "", "Java", "Oracle", "HTML" }));
		jcbSubjectSet.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		jcbSubjectSet.setBounds(270, 170, 80, 25);
		jpMain.add(jcbSubjectSet);

		jbtnExit = new JButton("닫기");
		jbtnExit.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		jbtnExit.setBackground(new Color(235, 235, 255));
		jbtnExit.setBounds(165, 456, 100, 45);
		getContentPane().add(jbtnExit);

		// #. 이벤트 설정
		// #-1. 람다식으로 종료버튼 이벤트 처리
		jbtnExit.addActionListener(e -> dispose());
		
		// #. 모달 설정
		setModal(true);

		// #. 위치 및 사이즈 설
		setBounds(100, 100, 450, 550);

		// #. 가시화
		setVisible(true);

		// #. 종료 설정
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}// StudentExamScoreView
	
	// Getter Method
	public JLabel getJlblNameSet() {
		return jlblNameSet;
	}

	public JLabel getJlblTeacherNameSet() {
		return jlblTeacherNameSet;
	}

	public JLabel getJlblEndCourseSet() {
		return jlblEndCourseSet;
	}

	public JLabel getJlblScoreSet() {
		return jlblScoreSet;
	}

	public JLabel getJlblMyAnswerSet() {
		return jlblMyAnswerSet;
	}

	public JLabel getJlblAnswerAvgSet() {
		return jlblAnswerAvgSet;
	}

	public JComboBox getJcbSubjectSet() {
		return jcbSubjectSet;
	}

	public JButton getJbtnExit() {
		return jbtnExit;
	}
	
}// class
