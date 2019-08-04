package com.ccunix.ihousekeeping.basedb.dao;

import java.util.List;

import com.ccunix.ihousekeeping.base.util.DataSourceType;
import com.ccunix.ihousekeeping.basedb.domain.Wangzhetiku;

@DataSourceType(DataSourceType.main)
public interface Wangzhetiku_Dao_Iface {
	public void insert_wangzhetiku(Wangzhetiku wangzhetiku) throws Exception;

	public void update_wangzhetiku(Wangzhetiku wangzhetiku) throws Exception;

	public void delete_wangzhetiku(Wangzhetiku wangzhetiku) throws Exception;

	public List queryAll_wangzhetiku(Wangzhetiku wangzhetiku) throws Exception;

	public List queryBy_wangzhetiku(Wangzhetiku wangzhetiku) throws Exception;
}
