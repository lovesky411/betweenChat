/**
 * 
 */
package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 * @FileName : ServerFrame.java
 * @Project : betweenChat_Server
 * @Date : 2017. 2. 27.
 * @author KSH
 */
public class ServerFrame {
	
	JTable chatRoomTable;
	JList<String> allUserList;
	JList<String> loginUserList;
	
	JPanel pnlTable, pnlAllUser, PanelLoginUser, PanelNotice;
	JLabel lblNotice, lblStatus;
	JTextField TfNotice;
	JButton btnNotice, btnShow, btnDelete, btnChatRoomOut;
	
	GridBagLayout grid;
	GridBagConstraints constraints;
	

	
	public ServerFrame() {
		this("서버 관리 프로그램");
	}

	public ServerFrame(String title) {
		// 
	}

}
