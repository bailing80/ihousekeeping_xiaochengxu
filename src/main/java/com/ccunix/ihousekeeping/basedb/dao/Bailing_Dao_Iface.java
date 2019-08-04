package com.ccunix.ihousekeeping.basedb.dao;

import java.util.List;

import com.ccunix.ihousekeeping.base.util.DataSourceType;
import com.ccunix.ihousekeeping.basedb.domain.Bailing;

@DataSourceType(DataSourceType.main)
public interface Bailing_Dao_Iface {
	public void insert_bailing(Bailing bailing) throws Exception;

	public void update_bailing(Bailing bailing) throws Exception;

	public void delete_bailing(Bailing bailing) throws Exception;

	public List queryAll_bailing(Bailing bailing) throws Exception;

	public List queryBy_bailing(Bailing bailing) throws Exception;
}
