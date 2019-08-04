package com.ccunix.ihousekeeping.basedb.service;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.basedb.domain.Tb_base;
import com.ccunix.ihousekeeping.basedb.dao.Tb_base_Dao_Iface;

@Service("Tb_base_Service")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Tb_base_Service_Impl extends BaseService implements Tb_base_Service_Iface {
	@Resource
	public Tb_base_Dao_Iface tb_base_dao_iface;

	public void insert_tb_base(Tb_base tb_base) throws Exception {
		tb_base_dao_iface.insert_tb_base(tb_base);
	}

	public void update_tb_base(Tb_base tb_base) throws Exception {
		tb_base_dao_iface.update_tb_base(tb_base);
	}

	public void delete_tb_base(Tb_base tb_base) throws Exception {
		tb_base_dao_iface.delete_tb_base(tb_base);
	}

	public List queryAll_tb_base(Tb_base tb_base) throws Exception {
		return tb_base_dao_iface.queryAll_tb_base(tb_base);
	}

	public List queryBy_tb_base(Tb_base tb_base) throws Exception {
		return tb_base_dao_iface.queryBy_tb_base(tb_base);
	}
}