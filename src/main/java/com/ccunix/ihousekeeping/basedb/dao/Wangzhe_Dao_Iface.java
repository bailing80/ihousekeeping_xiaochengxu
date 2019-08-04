package com.ccunix.ihousekeeping.basedb.dao;

import java.util.List;

import com.ccunix.ihousekeeping.base.util.DataSourceType;
import com.ccunix.ihousekeeping.basedb.domain.Wangzhe;

@DataSourceType(DataSourceType.main)
public interface Wangzhe_Dao_Iface {
	public void insert_wangzhe(Wangzhe wangzhe) throws Exception;

	public void update_wangzhe(Wangzhe wangzhe) throws Exception;

	public void delete_wangzhe(Wangzhe wangzhe) throws Exception;

	public List queryAll_wangzhe(Wangzhe wangzhe) throws Exception;

	public List queryBy_wangzhe(Wangzhe wangzhe) throws Exception;
}
