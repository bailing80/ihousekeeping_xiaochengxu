package com.ccunix.ihousekeeping.basedb.service;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.basedb.domain.Bailing;
import com.ccunix.ihousekeeping.basedb.dao.Bailing_Dao_Iface;

@Service("Bailing_Service")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Bailing_Service_Impl extends BaseService implements Bailing_Service_Iface {
	@Resource
	public Bailing_Dao_Iface bailing_dao_iface;

	public void insert_bailing(Bailing bailing) throws Exception {
		bailing_dao_iface.insert_bailing(bailing);
	}

	public void update_bailing(Bailing bailing) throws Exception {
		bailing_dao_iface.update_bailing(bailing);
	}

	public void delete_bailing(Bailing bailing) throws Exception {
		bailing_dao_iface.delete_bailing(bailing);
	}

	public List queryAll_bailing(Bailing bailing) throws Exception {
		return bailing_dao_iface.queryAll_bailing(bailing);
	}

	public List queryBy_bailing(Bailing bailing) throws Exception {
		return bailing_dao_iface.queryBy_bailing(bailing);
	}
}