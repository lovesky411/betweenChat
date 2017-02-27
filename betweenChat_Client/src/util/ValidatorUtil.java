/**
 * 
 */
package util;

/**
 * @FileName : ValidatorUtil.java
 * @Project : betweenChat_Client
 * @Date : 2017. 2. 26.
 * @author KSH
 */
public class ValidatorUtil {

	/**
	 * 정규표현식을 활용한 유효성 검증 공통 유틸
	 */
	public ValidatorUtil() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @Method Name : validID
	 * @Date : 2017. 2. 26.
	 * @Auther : KSH
	 * @Desc : 아이디 유효성 검증.
	 * 		   영문과 숫자 조합으로 8 ~ 10자 아이디 
	 * @param id
	 * @return
	 */
	public static boolean validID(String id){
		return id.matches("[a-zA-Z0-9]{8,10}");
	}
	
	/**
	 * @Method Name : validEmail
	 * @Date : 2017. 2. 26.
	 * @Auther : KSH
	 * @Desc : 이메일 유효성 검증
	 * @param email
	 * @return
	 */
	public static boolean validEmail(String email) {
		return email.matches("^[a-zA-Z0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)+$");
	}
	
	/**
	 * @Method Name : validPhoneNumber
	 * @Date : 2017. 2. 26.
	 * @Auther : KSH
	 * @Desc : 전화번호 유효성 검증
	 * @param number
	 * @return
	 */
	public static boolean validPhoneNumber(String number) {
		return number.matches("^0+([0-9]{1,2})-[0-9]{3,4}-[0-9]{4}+$");
	}
	
	
	/**
	 * @Method Name : validMobileNumber
	 * @Date : 2017. 2. 26.
	 * @Auther : KSH
	 * @Desc : 휴대폰번호 유효성 검증
	 * @param number
	 * @return
	 */
	public static boolean validMobileNumber(String number) {
		return number.matches("^01(0|1|[6-9])-[0-9]{3,4}-[0-9]{4}+$");
	}
	
	
	/**
	 * @Method Name : validSSN
	 * @Date : 2017. 2. 26.
	 * @Auther : KSH
	 * @Desc : 주민번호 유효성 검증
	 * @param ssn
	 * @return
	 */
	public static boolean validSSN(String ssn) {
		return ssn.matches("^[0-9]{6}-[1-8]+[0-9]{6}+$");
	}
	
	
}
