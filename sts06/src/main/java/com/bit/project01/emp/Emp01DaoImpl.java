package com.bit.project01.emp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class Emp01DaoImpl extends JdbcDaoSupport implements Emp01Dao {

	private RowMapper<Emp01Vo> rowMapper=new RowMapper<Emp01Vo>() {

		@Override
		public Emp01Vo mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new Emp01Vo(
					rs.getInt(1),
					rs.getString(2),
					rs.getDate(4),
					rs.getInt(3)
					);
		}
		
	};
	
	
	@Override
	public List<Emp01Vo> selectAll() {
		String sql="select * from emp01";
		return getJdbcTemplate().query(sql, rowMapper);
	}
	
	
	@Override
	public void insertOne(String name, int pay) {
		String sql="insert into emp01 (name, pay, nalja, deptno) values (?,?,now(),1)";
		getJdbcTemplate().update(sql, new Object[] {name,pay});
	}


	@Override
	public Emp01Vo selectOne(int key) {
		String sql="select * from emp01 where sabun=?";
		return getJdbcTemplate().queryForObject(sql, rowMapper, key);
	}
//	queryForObject : 1개의 레코드를 가져와 자바 객체에 저장
//	queryForList : 2개 이상의 레코드를 가져와 자바 객체 List 에 저장
	

	@Override
	public void updateOne(int sabun, String name, int pay) {
		String sql="update emp01 set name=?, pay=? where sabun=?";
		getJdbcTemplate().update(sql,name,pay,sabun);
	}


	@Override
	public int deleteOne(int sabun) {
		String sql="delete from emp01 where sabun=?";
		getJdbcTemplate().update(sql, sabun);
		return 0;
	}
	
}
