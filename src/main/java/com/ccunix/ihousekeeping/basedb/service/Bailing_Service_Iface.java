package com.ccunix.ihousekeeping.basedb.service;

import com.ccunix.ihousekeeping.basedb.domain.Bailing;
import java.util.List;

public interface Bailing_Service_Iface {
	public void insert_bailing(Bailing bailing) throws Exception;

	public void update_bailing(Bailing bailing) throws Exception;

	public void delete_bailing(Bailing bailing) throws Exception;

	public List queryAll_bailing(Bailing bailing) throws Exception;

	public List queryBy_bailing(Bailing bailing) throws Exception;
}
