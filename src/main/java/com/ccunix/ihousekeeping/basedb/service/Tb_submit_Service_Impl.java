package com.ccunix.ihousekeeping.basedb.service;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.basedb.domain.Tb_submit;
import com.ccunix.ihousekeeping.basedb.dao.Tb_submit_Dao_Iface;

@Service("Tb_submit_Service")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Tb_submit_Service_Impl extends BaseService implements Tb_submit_Service_Iface {
	@Resource
	public Tb_submit_Dao_Iface tb_submit_dao_iface;

	public void insert_tb_submit(Tb_submit tb_submit) throws Exception {
		tb_submit_dao_iface.insert_tb_submit(tb_submit);
	}

	public void update_tb_submit(Tb_submit tb_submit) throws Exception {
		tb_submit_dao_iface.update_tb_submit(tb_submit);
	}

	public void delete_tb_submit(Tb_submit tb_submit) throws Exception {
		tb_submit_dao_iface.delete_tb_submit(tb_submit);
	}

	public List queryAll_tb_submit(Tb_submit tb_submit) throws Exception {
		return tb_submit_dao_iface.queryAll_tb_submit(tb_submit);
	}

	public List queryBy_tb_submit(Tb_submit tb_submit) throws Exception {
		return tb_submit_dao_iface.queryBy_tb_submit(tb_submit);
	}
}