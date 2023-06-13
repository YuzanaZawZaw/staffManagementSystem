package com.sms.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
//import com.sms.model.Certificate;
import com.sms.model.Staff;

public class StaffDao {
	private JdbcTemplate myJdbcTemplate;
	public void setMyJdbcTemplate(JdbcTemplate myJdbcTemplate) {
		this.myJdbcTemplate = myJdbcTemplate;
	}
	public void saveStaff(Staff s){
		String sql="insert into staff values("
				+ "null,?,?,?,?)";
		this.myJdbcTemplate.update(sql,
				s.getStaffName(),
				s.getStaffDob(),
				s.getStaffExp(),
				s.getStaffCert()
				);
	}
	public List<Staff> getAll(){
		String sql="select * from staff";
		return this.myJdbcTemplate.query(sql,new StaffRowMapper());
	}
	public Staff getStaffById(int id){
		String sql="select * "
				+ "from staff "
				+ "where staff_id=?";
		return this.myJdbcTemplate.queryForObject(
				sql, 
				new Object[]{id},
				new StaffRowMapper());
	}
	
	
	public void updateStaff(Staff s){
		String sql="update staff "
				+ "set staff_name=?,staff_dob=?"
				+ "staff_exp=?,staff_cert_id=? "
				+ "where staff_id=?";
		
		this.myJdbcTemplate.update(sql,
				s.getStaffName(),
				s.getStaffDob(),
				s.getStaffExp(),
				s.getStaffCert(),
				s.getStaffId());
	}
	public void deleteStaff(int id){
		String sql="delete from staff "
				+ "where staff_id=?";
		this.myJdbcTemplate.update(sql,new Object[]{id});
	}
	
	private class StaffRowMapper implements RowMapper<Staff>{
		@Override
		public Staff mapRow(ResultSet rs, int index) throws SQLException {
			Staff s=new Staff();
			s.setStaffId(rs.getInt(1));
			s.setStaffName(rs.getString(2));
			s.setStaffDob(rs.getDate(3));
			s.setStaffExp(rs.getInt(4));
			//s.setStaffCert(rs.getObject(5));
			
			return s;
		}
	}
}
