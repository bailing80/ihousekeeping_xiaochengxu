package com.ccunix.ihousekeeping.basedb.service;

import com.ccunix.ihousekeeping.basedb.domain.Wangzhetiku;
import java.util.List;

public interface Wangzhetiku_Service_Iface {
	public void insert_wangzhetiku(Wangzhetiku wangzhetiku) throws Exception;

	public void update_wangzhetiku(Wangzhetiku wangzhetiku) throws Exception;

	public void delete_wangzhetiku(Wangzhetiku wangzhetiku) throws Exception;

	public List queryAll_wangzhetiku(Wangzhetiku wangzhetiku) throws Exception;

	public List queryBy_wangzhetiku(Wangzhetiku wangzhetiku) throws Exception;
}
