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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	
	JButton btnLogin, btnJoin, btnFind;
	
	JLabel lblTitle, lblId, lblPW;
	
	JTextField tfID = new JTextField(20);
	JTextField tfPW = new JTextField(20);
	
	GridBagLayout grid;
	GridBagConstraints grdBC;
	
	Color bgColor;
	Image image;
	
	ChatUI ui;
	
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
		btnFind = new JButton("아이디/비밀번호 찾기");
		btnJoin = new JButton("회원가입");
		
		lblId = new JLabel("ID");
		lblPW = new JLabel("PassWord");
		
		bgColor = Color.LIGHT_GRAY;
		
		
		grid = new GridBagLayout();
		grdBC = new GridBagConstraints();
		
		setComponents();
		
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
	   
	/**
	 * @Method Name : setComponents
	 * @Date : 2017. 2. 25.
	 * @Auther : KSH
	 * @Desc :
	 */
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
		
		addComponent(btnFind, 1, 15, 1, 1, 0, 0);
		addComponent(btnJoin, 2, 15, 1, 1, 0, 0);
		
		
	}
	
	
	public void setUI(ChatUI ui){
		this.ui = ui;
	}
	
	/**
	 * @Method Name : eventRegist
	 * @Date : 2017. 2. 27.
	 * @Auther : KSH
	 * @Desc :	이벤트 처리 메소드
	 */
	public void eventRegist(){
		
		/** login Button Click**/
		btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			
			}
		});
		
		/** Find Button Click **/
		btnFind.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		/** Join Button Click **/
		btnJoin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}
		   
}
