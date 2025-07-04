package tests;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import utilities.DBUtil;

public class DBTest {

	public static void main(String[] args) throws SQLException {
		
		List<Map<String, String>> data = DBUtil.readData(Queries.TOP10_HORROR_MOVIES);
		
		System.out.println(data);
		
		System.out.println(data.get(0).get("title"));

	}

}
