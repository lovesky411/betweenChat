package util;

import java.awt.Container;
import java.awt.Toolkit;

import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 * GUI 관련 공통 유틸리티 메소드
 * @author 가승호
 * 작성일 : 2015-07-24
 */
public class GUIUtil {

	/**
	 * 화면 중앙 배치
	 */
	
	public static void setCenterScreen(Container container){
		
		/**
		 * 화면 중앙 배치
		 */
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		toolkit.getScreenSize();
		int x =	(toolkit.getScreenSize().width - container.getWidth()) / 2;
		int y = (toolkit.getScreenSize().height - container.getHeight()) / 2;
		
		/*int x, y; 위의 것처럼 간략이 하도록 하자.
		 * Dimension dimension = toolkit.getScreenSize();
		x =	(dimension.width - frame.getWidth()) / 2;
		y = (dimension.height - frame.getHeight()) / 2;*/
		container.setLocation(x, y);
		
	}

	public static void setFullScreen(Container container){
		
		/**
		 * 화면 풀 배치
		 */
		Toolkit toolkit = Toolkit.getDefaultToolkit();
	
		container.setSize(toolkit.getScreenSize());
	}
	
	public static final String THEME_SWING = "javax.swing.plaf.metal.MetalLookAndFeel";
	public static final String THEME_WINDOW = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
	public static final String THEME_UNIX = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
	public static final String THEME_NIMBUS = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";
	public static final String THEME_OS = UIManager.getSystemLookAndFeelClassName();
	
	
	/**
	 *  룩앤필(Look&Feel) 설정Configuration
	 */
	
	public static void setLookNFeel(Container container, String className){
		try {
			UIManager.setLookAndFeel(className);
		} catch(Exception e){
			e.printStackTrace();
		}
		SwingUtilities.updateComponentTreeUI(container);
		
	}
	
	
	
}
