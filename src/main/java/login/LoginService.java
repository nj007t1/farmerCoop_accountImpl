package login;

public class LoginService {
	public MemberBean checkPassword(String email , String password){
		
		MemberDAO dao = new MemberDAO();
		MemberBean mb = dao.select(email);
		
		if(mb != null && password.equals(mb.user_PASSWD)){
			return mb;
		}
		return null;
	}
}
