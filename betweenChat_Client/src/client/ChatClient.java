/**
 * 
 */
package client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import view.ChatUI;

/**
 * @FileName : ChatClient.java
 * @Project : betweenChat_Client
 * @Date : 2017. 2. 27.
 * @author KSH
 * @Desc : 채팅 클라이언트
 * 		클라이언트와 통신을 하기 위한 클래스
 */
public class ChatClient {
	
	private String serverIP;
	private int port;
	private Socket socket;
	private DataInputStream in;
	private DataOutputStream out;
	/**
	 * @return the serverIP
	 */
	public String getServerIP() {
		return serverIP;
	}

	/**
	 * @param serverIP the serverIP to set
	 */
	public void setServerIP(String serverIP) {
		this.serverIP = serverIP;
	}

	/**
	 * @return the port
	 */
	public int getPort() {
		return port;
	}

	/**
	 * @param port the port to set
	 */
	public void setPort(int port) {
		this.port = port;
	}

	/**
	 * @return the socket
	 */
	public Socket getSocket() {
		return socket;
	}

	/**
	 * @param socket the socket to set
	 */
	public void setSocket(Socket socket) {
		this.socket = socket;
	}

	/**
	 * @return the in
	 */
	public DataInputStream getIn() {
		return in;
	}

	/**
	 * @param in the in to set
	 */
	public void setIn(DataInputStream in) {
		this.in = in;
	}


	/**
	 * @return the out
	 */
	public DataOutputStream getOut() {
		return out;
	}


	/**
	 * @param out the out to set
	 */
	public void setOut(DataOutputStream out) {
		this.out = out;
	}


	/**
	 * @return the stop
	 */
	public boolean isStop() {
		return stop;
	}


	/**
	 * @param stop the stop to set
	 */
	public void setStop(boolean stop) {
		this.stop = stop;
	}


	/**
	 * @return the ui
	 */
	public ChatUI getUi() {
		return ui;
	}


	/**
	 * @param ui the ui to set
	 */
	public void setUi(ChatUI ui) {
		this.ui = ui;
	}


	private boolean stop;
	
	private ChatUI ui;
	

	/**
	 * 
	 */
	public ChatClient() {
		this("localhost", 2568);
	}


	/**
	 * @param string
	 * @param i
	 */
	public ChatClient(String serverIP, int port) {
		this.serverIP = serverIP;
		this.port = port;
	}

	
	
	/**
	 * @Method Name : connect
	 * @Date : 2017. 2. 27.
	 * @Auther : KSH
	 * @Desc : 서버 연결
	 * @throws UnknownHostException
	 * @throws IOException
	 */
	public void connect() throws UnknownHostException, IOException{
		socket = new Socket(serverIP, port);
		out = new DataOutputStream(socket.getOutputStream());
		in = new DataInputStream(socket.getInputStream());
	}
	
	/**
	 * @Method Name : disconnect
	 * @Date : 2017. 2. 27.
	 * @Auther : KSH
	 * @Desc : 서버 연결 끊기
	 */
	public void disconnect(){
		try{
			if (in != null) in.close();
			if (out != null) out.close();
			if (socket != null) socket.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @Method Name : sendMessage
	 * @Date : 2017. 2. 27.
	 * @Auther : KSH
	 * @Desc : 서버로 메시지 전송
	 * @param message
	 * @throws IOException
	 */
	public void sendMessage(String message) throws IOException{
		out.writeUTF(message);
	}
	
	
	/**
	 * @Method Name : receiveMessage
	 * @Date : 2017. 2. 27.
	 * @Auther : KSH
	 * @Desc : 서버로부터 응답 결과 메시지 수신
	 * @throws IOException
	 */
	public void receiveMessage() throws IOException{
		
	}
	
	
	
}
