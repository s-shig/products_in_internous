package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.BlogDto;

public class BlogDao {
	private static String driverName = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost/blogdb";
	private static String user = "root";
	private static String password = "mysql";
	static Connection conn = null;
	static PreparedStatement stmt = null;

	private static Connection getConnection() {
		try {
			Class.forName(driverName);
			conn = (Connection) DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			throw new IllegalArgumentException(e);
		}
		return conn;
	}

	private static void allClose(PreparedStatement stmt, Connection conn) {
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
//ユーザー認証
	public BlogDto findUser(String id) {
		BlogDto user = new BlogDto();

		try {
			conn = getConnection();

			stmt = conn.prepareStatement("SELECT * FROM blog WHERE userid = ?");
			stmt.setString(1, id);
			ResultSet rs = stmt.executeQuery();

			if (!rs.next()) {
				return null;
			}

			user.setUserid(rs.getString("userid"));
			user.setPassword(rs.getString("password"));

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			allClose(stmt, conn);
		}
		return user;

	}
//ユーザー登録
	public void regUser(String id, String password) {

        try {
            conn = getConnection();

            stmt = conn.prepareStatement("INSERT INTO blog (userid, password) VALUES (?, ?)");
            stmt.setString(1, id);
            stmt.setString(2, password);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            allClose(stmt, conn);
        }
//        return result;

    }
//IDからコラムリスト取得
	public ArrayList<String> getBlogList(String id) {
      ArrayList<String> list = new ArrayList<String>();

        try {
            conn = getConnection();


            stmt = conn.prepareStatement("SELECT * FROM blog WHERE colum IS NOT NULL AND userid = ?");
            stmt.setString(1, id);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
            	list.add(rs.getString("colum"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            allClose(stmt, conn);
        }
        return list;

    }
//	IDからNOリスト取得
	public ArrayList<Integer> getNo(String id) {
		ArrayList<Integer> nolist = new ArrayList<Integer>();

		try {
			conn = getConnection();


			stmt = conn.prepareStatement("SELECT * FROM blog WHERE colum IS NOT NULL AND userid = ?");
			stmt.setString(1, id);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				nolist.add(rs.getInt("no"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			allClose(stmt, conn);
		}
		return nolist;

	}
//	noからコラム編集
	public void EditComp(String afcolum,int columNo) {
		try {
			conn = getConnection();

			stmt = conn.prepareStatement("UPDATE blog SET colum=? WHERE no=?");
            stmt.setString(1, afcolum);
			stmt.setInt(2, columNo);
			stmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			allClose(stmt, conn);
		}
	}
//	noからコラム削除
	public void DeleteComp(int no) {

        try {
            conn = getConnection();

            stmt = conn.prepareStatement("DELETE FROM blog WHERE no=?");
            stmt.setInt(1, no);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            allClose(stmt, conn);
        }

    }

//	記事投稿
	public void PostColum(String id, String colum) {

      try {
          conn = getConnection();

          stmt = conn.prepareStatement("INSERT INTO blog (userid, colum) VALUES (?, ?)");
          stmt.setString(1, id);
          stmt.setString(2, colum);
          stmt.executeUpdate();

      } catch (SQLException e) {
          e.printStackTrace();
      } finally {
          allClose(stmt, conn);
      }
	}

}
