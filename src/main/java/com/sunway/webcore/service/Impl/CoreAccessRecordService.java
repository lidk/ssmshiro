package com.sunway.webcore.service.Impl;

import org.springframework.stereotype.Service;

import com.sunway.webbase.BaseServiceImpl;
import com.sunway.webcore.dto.CoreAccessRecordDto;
import com.sunway.webcore.entity.CoreAccessRecord;
import com.sunway.webcore.service.ICoreAccessRecordService;

@Service
public class CoreAccessRecordService extends BaseServiceImpl<CoreAccessRecord>
		implements ICoreAccessRecordService {

	@Override
	public CoreAccessRecord DtotoEntity(CoreAccessRecordDto Dto) {
		CoreAccessRecord recode = null;
		if (Dto != null) {
			recode = new CoreAccessRecord();
			recode.setId(Dto.getId());
			recode.setUserId(Dto.getUserID());
			recode.setAccessIp(Dto.getAccessIP());
			recode.setAccessTime(Dto.getAccessTime());
			recode.setUserName(Dto.getUserName());
			recode.setAccessType(Dto.getAccessType());
		}
		return recode;
	}
	
	
	@Override
	public CoreAccessRecordDto EntitytoDto(CoreAccessRecord entity) {
		return null;
	}
}
