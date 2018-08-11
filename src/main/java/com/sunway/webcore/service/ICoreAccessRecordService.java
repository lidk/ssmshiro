package com.sunway.webcore.service;

import com.sunway.webbase.BaseService;
import com.sunway.webcore.dto.CoreAccessRecordDto;
import com.sunway.webcore.entity.CoreAccessRecord;

public interface ICoreAccessRecordService extends BaseService<CoreAccessRecord> {

	CoreAccessRecord DtotoEntity(CoreAccessRecordDto Dto);

	CoreAccessRecordDto EntitytoDto(CoreAccessRecord entity);

}
