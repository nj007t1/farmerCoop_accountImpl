package login;

public class LoginService {
	public MemberBean checkLoginInfo(String email, String password) {
		MemberDAO dao = new MemberDAO();
		// 用email取得Member
		MemberBean mb = dao.findByEmail(email);
		// 檢查user是否存在
		if (mb == null) {
			return mb;
		}
		// 檢查password是否正確 //getUserApplyDate 取得現在申請時間 //
		String encrypt = SecurityUtils.getEncryptPassword(password, mb.getUserApplyDate());
		if (!encrypt.equals(mb.getUserPasswd())) {
			return null;
		}
		return mb;
		
//		// 檢查user是否存在
//		if (mb != null) {
//			// 檢查password是否正確 //getUserApplyDate 取得現在申請時間 //
//			String encrypt = SecurityUtils.getEncryptPassword(password, mb.getUserApplyDate());
//			if (encrypt.equals(mb.getUserPasswd())) {
//				return mb;
//			}
//			
//			throw new UnsupportedOperationException("not valid password");
//		}
//		
//		throw new UnsupportedOperationException("user not found");


	}
}
