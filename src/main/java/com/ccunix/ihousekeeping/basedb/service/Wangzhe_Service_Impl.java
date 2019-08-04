package com.ccunix.ihousekeeping.basedb.service;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.basedb.domain.Wangzhe;
import com.ccunix.ihousekeeping.basedb.dao.Wangzhe_Dao_Iface;

@Service("Wangzhe_Service")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Wangzhe_Service_Impl extends BaseService implements Wangzhe_Service_Iface {
	@Resource
	public Wangzhe_Dao_Iface wangzhe_dao_iface;

	public void insert_wangzhe(Wangzhe wangzhe) throws Exception {
		wangzhe_dao_iface.insert_wangzhe(wangzhe);
	}

	public void update_wangzhe(Wangzhe wangzhe) throws Exception {
		wangzhe_dao_iface.update_wangzhe(wangzhe);
	}

	public void delete_wangzhe(Wangzhe wangzhe) throws Exception {
		wangzhe_dao_iface.delete_wangzhe(wangzhe);
	}

	public List queryAll_wangzhe(Wangzhe wangzhe) throws Exception {
		return wangzhe_dao_iface.queryAll_wangzhe(wangzhe);
	}

	public List queryBy_wangzhe(Wangzhe wangzhe) throws Exception {
		return wangzhe_dao_iface.queryBy_wangzhe(wangzhe);
	}
}