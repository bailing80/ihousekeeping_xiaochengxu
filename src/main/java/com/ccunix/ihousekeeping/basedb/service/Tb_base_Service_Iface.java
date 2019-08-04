package com.ccunix.ihousekeeping.basedb.service;

import com.ccunix.ihousekeeping.basedb.domain.Tb_base;
import java.util.List;

public interface Tb_base_Service_Iface {
	public void insert_tb_base(Tb_base tb_base) throws Exception;

	public void update_tb_base(Tb_base tb_base) throws Exception;

	public void delete_tb_base(Tb_base tb_base) throws Exception;

	public List queryAll_tb_base(Tb_base tb_base) throws Exception;

	public List queryBy_tb_base(Tb_base tb_base) throws Exception;
}
