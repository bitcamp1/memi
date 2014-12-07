package com.memi.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("mainOpenPageController")
public class MainOpenController {
	//공지,단가표
	@RequestMapping(value="/board/danga.do",method=RequestMethod.GET)public String goDanga(){return "board/danga";}//단가
	@RequestMapping(value="/board/gongji.do",method=RequestMethod.GET)public String goGongi(){return "board/gongji";}//공지
	@RequestMapping(value="/board/gesi.do",method=RequestMethod.GET)public String goGesi(){return "board/gesi";}//게시
	
	//조회
	@RequestMapping(value="/srch/whole.do",method=RequestMethod.GET)public String srchWhole(){return "srch/whole";}//전체조회
	@RequestMapping(value="/srch/goods.do",method=RequestMethod.GET)public String srchJego(){return "srch/jego";}//상품조회
	@RequestMapping(value="/srch/sale.do",method=RequestMethod.GET)public String srchSale(){return "srch/sale";}//판매조회
	@RequestMapping(value="/srch/cred.do",method=RequestMethod.GET)public String srchCred(){return "srch/cred";}//신용조회
	
	//재고
	@RequestMapping(value="/logis/jego.do",method=RequestMethod.GET)public String logJego(){return "logis/jego";}//재고 
	@RequestMapping(value="/logis/ipgo.do",method=RequestMethod.GET)public String logIpgo(){return "logis/ipgo";}//입고 
	@RequestMapping(value="/logis/chgo.do",method=RequestMethod.GET)public String logChgo(){return "logis/chgo";}//출고 
	@RequestMapping(value="/logis/hoisu.do",method=RequestMethod.GET)public String logHoisu(){return "logis/hoisu";}//회수 
	@RequestMapping(value="/logis/loss.do",method=RequestMethod.GET)public String logLoss(){return "logis/loss";}//분실 
	@RequestMapping(value="/logis/back.do",method=RequestMethod.GET)public String logBack(){return "logis/back";}//반품 
	@RequestMapping(value="/logis/paper.do",method=RequestMethod.GET)public String logPaper(){return "logis/paper";}//명세서 
	
	//판매
	@RequestMapping(value="/sale/open.do",method=RequestMethod.GET)public String open(){return "sale/open";}//개통
	@RequestMapping(value="/sale/gaopen.do",method=RequestMethod.GET)public String gaopen(){return "sale/gaopen";}//가개통
	@RequestMapping(value="/sale/gita.do",method=RequestMethod.GET)public String gita(){return "sale/gita";}//기타판매
	@RequestMapping(value="/sale/mibi.do",method=RequestMethod.GET)public String mibi(){return "sale/mibi";}//미비서류
	@RequestMapping(value="/sale/return.do",method=RequestMethod.GET)public String bannap(){return "sale/rturn";}//반납
	
	//정산
	@RequestMapping(value="/cal/mycalc.do",method=RequestMethod.GET)public String myCalc(){return "calc/mycalc";}//내정산
	@RequestMapping(value="/cal/whansoo.do",method=RequestMethod.GET)public String whansoo(){return "calc/whansoo";}//환수환급
	@RequestMapping(value="/cal/soonap.do",method=RequestMethod.GET)public String soonap(){return "calc/soonap";}//요금수납
	@RequestMapping(value="/cal/ipkum.do",method=RequestMethod.GET)public String ipkum(){return "calc/ipkum";}//입출금
	@RequestMapping(value="/cal/misoo.do",method=RequestMethod.GET)public String misoo(){return "calc/misoo";}//미수금
	
	//고객
	@RequestMapping(value="/cus/cust.do",method=RequestMethod.GET)public String goCust(){return "mg/cust";}//고객관리
	
	//관리자
	@RequestMapping(value="/mgr/info.do",method=RequestMethod.GET)public String mgInfo(){return "mg/info";}//관리자정보
	@RequestMapping(value="/mgr/fee.do",method=RequestMethod.GET)public String mgFee(){return "mg/fee";}//요금관리
	@RequestMapping(value="/mgr/mgid.do",method=RequestMethod.GET)public String mgId(){return "mg/mgid";}//관리자ID
	@RequestMapping(value="/mgr/ipgocho.do",method=RequestMethod.GET)public String mgIpgocho(){return "mg/ipgocho";}//입고처
	@RequestMapping(value="/mgr/panmecho.do",method=RequestMethod.GET)public String mgPanmecho(){return "mg/panmecho";}//판매처
	@RequestMapping(value="/mgr/qna.do",method=RequestMethod.GET)public String mgQna(){return "mg/qna";}//질문과답
	@RequestMapping(value="/mgr/req.do",method=RequestMethod.GET)public String mgReq(){return "mg/req";}//요구사항
	@RequestMapping(value="/mgr/tax.do",method=RequestMethod.GET)public String mgTax(){return "mg/tax";}//세금
	@RequestMapping(value="/mgr/price.do",method=RequestMethod.GET)public String mgPrice(){return "mg/price";}//단말기가격

	
	
}
