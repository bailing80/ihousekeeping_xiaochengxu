package com.ccunix.ihousekeeping.basedb.dao;

import java.util.List;

import com.ccunix.ihousekeeping.base.util.DataSourceType;
import com.ccunix.ihousekeeping.basedb.domain.Tb_submit;

@DataSourceType(DataSourceType.main)
public interface Tb_submit_Dao_Iface {
	public void insert_tb_submit(Tb_submit tb_submit) throws Exception;

	public void update_tb_submit(Tb_submit tb_submit) throws Exception;

	public void delete_tb_submit(Tb_submit tb_submit) throws Exception;

	public List queryAll_tb_submit(Tb_submit tb_submit) throws Exception;

	public List queryBy_tb_submit(Tb_submit tb_submit) throws Exception;
}
