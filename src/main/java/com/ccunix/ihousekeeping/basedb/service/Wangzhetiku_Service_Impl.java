package com.ccunix.ihousekeeping.basedb.service;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.basedb.domain.Wangzhetiku;
import com.ccunix.ihousekeeping.basedb.dao.Wangzhetiku_Dao_Iface;

@Service("Wangzhetiku_Service")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Wangzhetiku_Service_Impl extends BaseService implements Wangzhetiku_Service_Iface {
	@Resource
	public Wangzhetiku_Dao_Iface wangzhetiku_dao_iface;

	public void insert_wangzhetiku(Wangzhetiku wangzhetiku) throws Exception {
		wangzhetiku_dao_iface.insert_wangzhetiku(wangzhetiku);
	}

	public void update_wangzhetiku(Wangzhetiku wangzhetiku) throws Exception {
		wangzhetiku_dao_iface.update_wangzhetiku(wangzhetiku);
	}

	public void delete_wangzhetiku(Wangzhetiku wangzhetiku) throws Exception {
		wangzhetiku_dao_iface.delete_wangzhetiku(wangzhetiku);
	}

	public List queryAll_wangzhetiku(Wangzhetiku wangzhetiku) throws Exception {
		return wangzhetiku_dao_iface.queryAll_wangzhetiku(wangzhetiku);
	}

	public List queryBy_wangzhetiku(Wangzhetiku wangzhetiku) throws Exception {
		return wangzhetiku_dao_iface.queryBy_wangzhetiku(wangzhetiku);
	}
}