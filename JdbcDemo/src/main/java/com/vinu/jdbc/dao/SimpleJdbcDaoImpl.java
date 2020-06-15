/**
 * 
 */
package com.vinu.jdbc.dao;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

/**
 * @author Vinu Prabhakaran
 *         on Jun 14, 2020
 *
 */
public class SimpleJdbcDaoImpl extends SimpleJdbcDaoSupport {
	
	public String getStudentNameForId(Integer studId) {

		String query="SELECT studname FROM student where studid = :id";
		SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("id", studId);
		return (String) this.getSimpleJdbcTemplate().queryForList(query, namedParameters).get(0).get("studname");
	}
	
}
