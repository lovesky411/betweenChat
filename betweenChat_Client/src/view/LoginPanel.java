/**
 * 
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @FileName : LoginFrame.java
 * @Project : betweenChat_Client
 * @Date : 2017. 2. 23.
 * @author KSH
 */
/**
 * @FileName : LoginPanel.java
 * @Project : betweenChat_Client
 * @Date : 2017. 2. 23.
 * @author KSH
 */
public class LoginPanel extends JPanel {
	JPanel pnlMain;
	
	JButton btnLogin;
	
	JLabel lblTitle, lblFind, lblJoin, lblId, lblPW;
	
	JTextField tfID = new JTextField(20);
	JTextField tfPW = new JTextField(20);
	
	GridBagLayout grid;
	GridBagConstraints grdBC;
	
	Color bgColor;
	Image image;
	
	
	/**
	 * 생성자
	 */
	public LoginPanel() {
		this("소곤소곤Talk...");
		this.setBackground(bgColor);	
		this.setSize(500, 700);
		
		//변수 생성
		constV();
		setComponents();
	
		
	}


	/**
	 * @param string
	 */
	public LoginPanel(String string) {
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * @Method Name : constV
	 * @Date : 2017. 2. 23.
	 * @Auther : KSH
	 * @Desc : 변수 생성
	 */
	private void constV(){
		pnlMain = new JPanel();
		
		lblTitle = new JLabel("소곤소곤");
		btnLogin = new JButton("Login");
		
		lblId = new JLabel("ID");
		lblPW = new JLabel("PassWord");
		
		lblFind = new JLabel("아이디/비밀번호 찾기");
		lblJoin = new JLabel("회원가입");
		bgColor = Color.LIGHT_GRAY;
		
		
		grid = new GridBagLayout();
		grdBC = new GridBagConstraints();
		
	}
	

	/**
	 * @Method Name : addComponent
	 * @Date : 2017. 2. 24.
	 * @Auther : KSH
	 * @Desc :
	 */
	private void addComponent(Component com, int gridx, int gridy, int gridWidth, int gridHeight, double weightx,
		         double weighty) {
		   grdBC.gridx = gridx;
		   grdBC.gridy = gridy;
		   grdBC.gridwidth = gridWidth;
		   grdBC.gridheight = gridHeight;
		   grdBC.weightx = weightx;
		   grdBC.weighty = weighty;
		      
		   grid.setConstraints(com, grdBC);
		      
		      add(com); // 컴포넌트를 Panel에 부착한다.
		   }
	   
	public void setComponents(){
		setLayout(grid);
		grdBC.fill = GridBagConstraints.BOTH;
		grdBC.insets = new Insets(3, 5,3,5);
		

		addComponent(new JLabel(" "), 1, 9, 1, 1, 0.5, 0);
		addComponent(lblId, 1, 9, 1, 1, 0, 0);
		addComponent(tfID, 2, 9, 1, 1, 0, 0);
		
		addComponent(btnLogin, 3, 9, 2, 2, 0, 0);	
		
		addComponent(lblPW, 1, 11, 1, 1, 0, 0);
		addComponent(tfPW, 2, 11, 1, 1, 1.0, 0);
		
		addComponent(new JLabel(" "), 1, 13, 1, 1, 0.5, 0);
		
		addComponent(new JLabel(" "), 0, 15, 1, 2, 0.5, 0);
		
		addComponent(lblFind, 1, 15, 1, 1, 0, 0);
		addComponent(lblJoin, 2, 15, 1, 1, 0, 0);
		
		
	}
		   
}
