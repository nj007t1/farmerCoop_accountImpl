package login;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SigninServlet.do")
public class SigninServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SigninServlet() {
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
		doPost(req, resp);
	}

	private boolean validateMail(String email) {

		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(email);

		return matcher.matches();

	}

	public static void main(String[] args) {
		String password = "aaaaaaaa";
		System.out.println(password.length());
		if (password.matches("^(?=.*\\d)(?=.*[a-zA-Z]).{8,20}$")) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF8");
		
		Map<String, String> errorMessage = new HashMap<>();
		request.setAttribute("ErrorMsg", errorMessage);
		
		String email = request.getParameter("email");
		if (email == null || email.trim().length() == 0) {
			errorMessage.put("email", "必須輸入電子信箱");
		} else if (!validateMail(email)) {
			errorMessage.put("email", "信箱格式不正確");
		}
		
		String password = request.getParameter("pswd");
		if (password == null || password.trim().length() == 0) {
			errorMessage.put("password", "必須輸入密碼");
		}
		String againpassword = request.getParameter("againpswd");
		if (againpassword == null || againpassword.trim().length() == 0) {
			errorMessage.put("againpassword", "必須輸入確認密碼");
		}
		if ((password.length() > 20) || (password.length() < 8)) {
			errorMessage.put("password", "密碼長度需8-20個字元");
		}
		if (!password.matches("^(?=.*\\d)(?=.*[a-zA-Z]).{8,20}$")) {
			errorMessage.put("password", "密碼須包含英文、數字");
		}
		if (!password.equals(againpassword)) {
			errorMessage.put("againpassword", "兩次密碼不一致");
		}

		MemberDAO dao = new MemberDAO();
		MemberBean userBean = dao.findByPrimaryKey(email);
		if (userBean != null) {
			errorMessage.put("email", "電子信箱重複,請重新輸入");
		}
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-ddHHmmss");//變成16字元的格式
		java.sql.Timestamp applyDate =  new  java.sql.Timestamp(System.currentTimeMillis());//取得現在時間
		String key =sdf.format(applyDate );//取得的時間轉換成字串
		String encrypt = SecurityUtils.encryptString(key,password);//時間與密碼進行加密
		
		
		if (!errorMessage.isEmpty()) {
			RequestDispatcher rd = request.getRequestDispatcher("/signin.jsp");
			rd.forward(request, response);
			return;
		}
		
		MemberBean user = new MemberBean(email, email, encrypt,applyDate);
		dao.insertUser(user);
		request.setAttribute("userBean", user);

		RequestDispatcher rd = request.getRequestDispatcher("/signinSuccess.jsp");
		rd.forward(request, response);
		return;
	}

}