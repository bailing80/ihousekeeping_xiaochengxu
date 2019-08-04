package com.ccunix.ihousekeeping.basedb.service;

import com.ccunix.ihousekeeping.basedb.domain.Tb_submit;
import java.util.List;

public interface Tb_submit_Service_Iface {
	public void insert_tb_submit(Tb_submit tb_submit) throws Exception;

	public void update_tb_submit(Tb_submit tb_submit) throws Exception;

	public void delete_tb_submit(Tb_submit tb_submit) throws Exception;

	public List queryAll_tb_submit(Tb_submit tb_submit) throws Exception;

	public List queryBy_tb_submit(Tb_submit tb_submit) throws Exception;
}
