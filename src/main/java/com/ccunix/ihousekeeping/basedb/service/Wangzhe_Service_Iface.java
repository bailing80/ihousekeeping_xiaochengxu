package com.ccunix.ihousekeeping.basedb.service;

import com.ccunix.ihousekeeping.basedb.domain.Wangzhe;
import java.util.List;

public interface Wangzhe_Service_Iface {
	public void insert_wangzhe(Wangzhe wangzhe) throws Exception;

	public void update_wangzhe(Wangzhe wangzhe) throws Exception;

	public void delete_wangzhe(Wangzhe wangzhe) throws Exception;

	public List queryAll_wangzhe(Wangzhe wangzhe) throws Exception;

	public List queryBy_wangzhe(Wangzhe wangzhe) throws Exception;
}
