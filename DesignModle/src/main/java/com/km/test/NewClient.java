package com.km.test;

import com.km.test.dto.SignOrOpenNoticeDto;
import com.km.test.impl.BranchBank;
import com.km.test.impl.ECJD003;

public class NewClient {
    public static void main(String[] args) throws Exception {
//        RouteFlg routeFlg = new RouteFlg();
//        routeFlg.setOrgNo("北京分行");
        SignOrOpenNoticeDto signOrOpenNoticeDto = new SignOrOpenNoticeDto();
        OutTransFactory outTransFactory = new OutTransFactory();
        BranchBank branchBank = outTransFactory.createBranchBank("北京分行");
        BaseTrans baseTrans = new ECJD003();
        branchBank.setBaseTrans(baseTrans);
        Object o = branchBank.outTrans(signOrOpenNoticeDto);
    }
}
