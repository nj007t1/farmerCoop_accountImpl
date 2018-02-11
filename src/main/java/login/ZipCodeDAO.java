package login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ZipCodeDAO {

	DataSource ds = null;

	public ZipCodeDAO() {
		try {
			Context context = new InitialContext();
			ds = (DataSource) context.lookup("java:comp/env/jdbc/sUserDataBase");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	public List<ZipCodeBean> zipCodeList() {
		List<ZipCodeBean> list = new ArrayList<>();
		String sql = "SELECT * FROM szip";
		ZipCodeBean zb = null;
		try (Connection con = ds.getConnection(); PreparedStatement ps = con.prepareStatement(sql);) {
			try (ResultSet rs = ps.executeQuery();) {
				while (rs.next()) {
					zb = new ZipCodeBean();
					zb.setZipCode(rs.getString(1));
					zb.setZipCountyName(rs.getString(2));
					zb.setZipTownName(rs.getString(3));
					list.add(zb);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return list;
	}
}
