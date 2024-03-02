package com.km.test.impl;

import com.km.test.BaseTrans;
import com.km.test.dto.ChnlApplReturnDto;
import com.km.test.dto.SignOrOpenNoticeDto;

public class ECJD003 implements BaseTrans<ChnlApplReturnDto, SignOrOpenNoticeDto> {
    @Override
    public ChnlApplReturnDto outTrans(SignOrOpenNoticeDto param) {
        System.out.println("ECJD003交易开始");
        System.out.println("ECJD003交易结束");
        return null;
    }
}
