package aqy.service;

public class CheckMsg {
	public static void main(String[] args) {
		String mobileNumber = "15651761087";//手机号码
		String code = "1266";//验证码
		try {
			String str = MobileMessageCheck.checkMsg(mobileNumber,code);
			if("success".equals(str)){
				System.out.println("验证成功！");
			}else{
				System.out.println("验证失败！");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
