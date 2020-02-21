package com.bit.project02.dept.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.bit.project02.dept.model.entity.DeptVo;

public class DeptDaoImpl1 implements DeptDao {
	@Autowired   // 이때, property 로 값을 넘길 필요가 없다
//		setter 만 된다 / 생성자는 안된다 → 어제 본 내용이랑 다르다 (다시 찾아보자)
		JdbcTemplate jdbcTemplate;
		private RowMapper<DeptVo> rowMapper;
		
		public DeptDaoImpl1() {
			rowMapper=new RowMapper<DeptVo>() {

				@Override
				public DeptVo mapRow(ResultSet rs, int rowNum) throws SQLException {
					return new DeptVo(
							rs.getInt(1),
							rs.getString(2),
							rs.getString(3)
							);
				}
				
			};
		}
		
		
		@Override
		public List<DeptVo> selectAll() {
			String sql="select * from dept01";
		return jdbcTemplate.query(sql, rowMapper);
	}


		@Override
		public void insertOne(String dname, String loc) {
			String sql="insert into dept01 (dname, loc) values (?,?)";
			jdbcTemplate.update(sql,dname,loc);
		}


		@Override
		public DeptVo selectOne(int key) {
			String sql="select * from dept01 where deptno=?";
			return jdbcTemplate.queryForObject(sql, rowMapper, key);
		}


		@Override
		public int updateOne(String dname, String loc, int deptno) {
			String sql="update dept01 set dname=?, loc=? where deptno=?";
			return jdbcTemplate.update(sql, dname, loc, deptno);
		}


		@Override
		public void deleteOne(int key) {
			// TODO Auto-generated method stub
			
		}

}






















