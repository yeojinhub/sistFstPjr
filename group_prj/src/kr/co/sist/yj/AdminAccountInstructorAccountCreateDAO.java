package kr.co.sist.yj;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AdminAccountInstructorAccountCreateDAO {

	private static AdminAccountInstructorAccountCreateDAO aaiacVO;

	private AdminAccountInstructorAccountCreateDAO() {

	} // AdminAccountInstructorAccountCreateDAO

	// SingleTon 생성
	public static AdminAccountInstructorAccountCreateDAO getInstance() {
		if (aaiacVO == null) {
			aaiacVO = new AdminAccountInstructorAccountCreateDAO();
		} // end if

		return aaiacVO;
	} // getInstance

	public void insertInstructorAccountMember(AdminAccountInstructorAccountCreateVO aaiacVO)
			throws SQLException, IOException {

		// 1. Driver 로딩
		// 2. Connection 연결
		Connection con = null;
		PreparedStatement pstmt = null;

		DbConnection dbConn = DbConnection.getInstance();

		try {
			con = dbConn.getConn();

			// 3. 쿼리문을 넣어서 쿼리문 생성객체 얻기
			StringBuilder strAddInstructorAccountMember = new StringBuilder();
			strAddInstructorAccountMember.append("	insert into instructor	")
					.append("	(inst_num,inst_pass,inst_name,inst_birth,inst_tel,inst_add)	").append("	values	")
					.append("	(seq_instructor.nextval,?,?,?,?,?)	");
			pstmt = con.prepareStatement(strAddInstructorAccountMember.toString());

			// 4. bind 변수에 값 할당
			int bindInd = 0;

			pstmt.setString(++bindInd, aaiacVO.getInst_pass());
			pstmt.setString(++bindInd, aaiacVO.getInst_name());
			Date birthDate = aaiacVO.getInst_birth();
			pstmt.setDate(++bindInd, birthDate);
			pstmt.setString(++bindInd, aaiacVO.getInst_tel());
			pstmt.setString(++bindInd, aaiacVO.getInst_add());

			// 5. 쿼리문 수행 후 결과 얻기
			pstmt.executeUpdate();

		} finally {
			// 6. 연결 끊기
			dbConn.closeDB(null, pstmt, con);
		} // end try finally

	} // insertInstructorAccountMember

} // class
