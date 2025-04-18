package kr.co.sist.ldu;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;




@SuppressWarnings("serial")
public class InstructorLoginView extends JFrame {


	private JTextField jtId;
	private JPasswordField jpfPass;
	private JButton jbtnLogin;

	
	public InstructorLoginView() {
		super("Best Campus-강사용");
		setIconImage(Toolkit.getDefaultToolkit().getImage(InstructorLoginView.class.getResource("/kr/co/sist/ldu/images/logo.png")));
		setFont(new Font("Arial", Font.BOLD, 12));
		setForeground(new Color(0, 0, 0));
		setTitle("Best Campus");
		getContentPane().setBackground(new Color(255, 255, 255));
		getContentPane().setLayout(null);
		
		JLabel jlblId = new JLabel("ID");
		jlblId.setFont(new Font("Arial", Font.BOLD, 12));
		jlblId.setBounds(30, 196, 48, 21);
		getContentPane().add(jlblId);
		
		JLabel jlblPassword = new JLabel("Password");
		jlblPassword.setFont(new Font("Arial", Font.BOLD, 12));
		jlblPassword.setBounds(30, 227, 58, 21);
		getContentPane().add(jlblPassword);
		
		jtId = new JTextField();
		jtId.setForeground(new Color(0, 0, 0));
		jtId.setBounds(96, 196, 209, 21);
		getContentPane().add(jtId);
		jtId.setColumns(10);
		
		jpfPass = new JPasswordField();
		jpfPass.setToolTipText("");
		jpfPass.setBounds(96, 227, 209, 21);
		getContentPane().add(jpfPass);
		
		jbtnLogin = new JButton("Login");
		
		jbtnLogin.setFont(new Font("Arial", Font.BOLD, 12));
		jbtnLogin.setBounds(317, 196, 97, 53);
		getContentPane().add(jbtnLogin);
		
		InstructorLoginEvt ile = new InstructorLoginEvt(this);
		jbtnLogin.addActionListener(ile);
		
		JLabel jlblLogo = new JLabel("New label");
		jlblLogo.setIcon(new ImageIcon(InstructorLoginView.class.getResource("/kr/co/sist/ldu/images/icon.png")));
		jlblLogo.setBounds(57, 74, 326, 39);
		getContentPane().add(jlblLogo);
		
		setBounds(100,100,450,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public JTextField getJtId() {
		return jtId;
	}

	public void setJtId(JTextField textField) {
		this.jtId = textField;
	}

	public JPasswordField getJpfPass() {
		return jpfPass;
	}

	public void setJpfPass(JPasswordField passwordField) {
		this.jpfPass = passwordField;
	}

	public JButton getJbtnLogin() {
		return jbtnLogin;
	}

	public void setJbtnLogin(JButton jbLogin) {
		this.jbtnLogin = jbLogin;
	}

	
	
}
