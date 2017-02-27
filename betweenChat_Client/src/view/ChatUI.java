/**
 * 
 */
package view;

import java.awt.CardLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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
	private JPanel backgroundPanel;
	
	
	private static final String serverIP = "127.0.0.1";
	private static final int serverPort = 5500;
	
	
	

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
	public ChatUI(String title) {
		super(title);
	}

	/**
	 * @return the cardLayout
	 */
	public CardLayout getCardLayout() {
		return cardLayout;
	}


	/**
	 * @param cardLayout the cardLayout to set
	 */
	public void setCardLayout(CardLayout cardLayout) {
		this.cardLayout = cardLayout;
	}


	/**
	 * @return the loginPanel
	 */
	public LoginPanel getLoginPanel() {
		return loginPanel;
	}


	/**
	 * @param loginPanel the loginPanel to set
	 */
	public void setLoginPanel(LoginPanel loginPanel) {
		this.loginPanel = loginPanel;
	}


	/**
	 * @return the cardPanel
	 */
	public JPanel getCardPanel() {
		return cardPanel;
	}


	/**
	 * @param cardPanel the cardPanel to set
	 */
	public void setCardPanel(JPanel cardPanel) {
		this.cardPanel = cardPanel;
	}


	/**
	 * @return the serverip
	 */
	public static String getServerip() {
		return serverIP;
	}


	/**
	 * @return the serverport
	 */
	public static int getServerport() {
		return serverPort;
	}


	public void setComponents(){
		backgroundPanel.setLayout(cardLayout);
		backgroundPanel.add(loginPanel, "LoginPanel");
		
		
	}


	
	

	
	//조건에 따른 패널 보여주기 설정
	public void showPanel(String panelName){
		switch (panelName) {
		case "loginPanel":
			cardLayout.show(backgroundPanel, "loginPanel");
			break;
		case "registerPanel":
			cardLayout.show(backgroundPanel, "registerPanel");
			break;
		case "waitRoomPanel":
			cardLayout.show(backgroundPanel, "waitRoomPanel");
			break;
		case "chatRoomPanel":
			cardLayout.show(backgroundPanel, "chatRoomPanel");
			break;
		case "findIdPwPanel":
			cardLayout.show(backgroundPanel, "findIdPwPanel");
			break;
		

		default:
			break;
		}
		
	}
	
	public void eventRegist(){
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e){

			}
			
		});
	}
	
	
	
	
	
	
}
