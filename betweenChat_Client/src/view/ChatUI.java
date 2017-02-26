/**
 * 
 */
package view;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @FileName : ChatUI.java
 * @Project : betweenChat_Client
 * @Date : 2017. 2. 26.
 * @author KSH
 */
public class ChatUI extends JFrame {
	
	private CardLayout cardLayout;
	private LoginPanel loginPanel; //로그인 패널
	
	
	private JPanel cardPanel;
	

	/**
	 * 생성자
	 */
	public ChatUI() {
		// TODO Auto-generated constructor stub
		this("소곤소곤.. 우리끼리 이야기 나누자요");
		
	}

	/**
	 * @param string
	 */
	public ChatUI(String string) {
		// TODO Auto-generated constructor stub
	}

}
