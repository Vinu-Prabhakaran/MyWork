package com.vinu.ocachap1;

import java.util.*;	//Date class is present on both imports
import java.sql.*;

public class ImportConflicts {
	public static void main(String[] args) {
		java.sql.Date date = new java.sql.Date(123L);	//java.sql.Date used to remove ambiguity due to conflicting imports
	}
}