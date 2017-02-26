/**
 * 
 */
package bin;

import javax.swing.JFrame;

import view.LoginPanel;

/**
 * @FileName : Between.java
 * @Project : betweenChat_Client
 * @Date : 2017. 2. 23.
 * @author KSH
 */
public class Between {

	static JFrame jf;
	static LoginPanel loginPanel;
	/**
	 * 
	 */
	public Between() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Method Name : main
	 * @Date : 2017. 2. 23.
	 * @Auther : KSH
	 * @Desc :
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jf = new JFrame();
		loginPanel = new LoginPanel();
		jf.setTitle("소곤소곤 Talk");
		jf.add(loginPanel);
		jf.setSize(500, 600);
		jf.setVisible(true);

	}

}
