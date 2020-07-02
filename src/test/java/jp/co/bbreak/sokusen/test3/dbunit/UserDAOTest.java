package jp.co.bbreak.sokusen.test3.dbunit;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;

import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.operation.DatabaseOperation;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class UserDAOTest extends TestCase {
	@Before
	public void setUp() throws Exception {
		// DbUnit用のデータベース接続
		IDatabaseConnection dbConnection = null;
		Class.forName("org.h2.Driver");

		// testデータベースにsaユーザ（パスワードなし）でH2DBへ接続
		Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
		dbConnection = new DatabaseConnection(con);

		// テスト用データを読み込む
		IDataSet dataSet = new FlatXmlDataSet(
				new FileInputStream("src/test/resources/user_data.xml"));
		// テスト用データをテーブルに挿入する
		DatabaseOperation.CLEAN_INSERT.execute(dbConnection, dataSet);
	}

	@Test
	public void testFindByUserid() {
		UserDAO userDao = new UserDAO();
		User user = userDao.findByUserid("0001");

		// テスト結果の検証
		assertThat(user.getName(), is("テスト太郎"));
	}
}