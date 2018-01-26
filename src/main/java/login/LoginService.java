package login;

public class LoginService {
	public MemberBean checkPassword(String email , String password){
		
		MemberDAO dao = new MemberDAO();
		MemberBean mb = dao.select(email);
		
		if(mb != null && password.equals(mb.USER_PASSWD)){
			return mb;
		}
		return null;
	}
}
