package com.vinu.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
//import javax.jws.soap.SOAPBinding;
//import javax.jws.soap.SOAPBinding.Style;

@WebService
//@SOAPBinding(style=Style.RPC)
public class ShopInfo {

	@WebMethod
	@WebResult(partName="ShopPropertyLookUpResult")
	public String getShopInfo(@WebParam(partName="ShopPropertForLookUp") String infoRequired) throws InvalidInputException{
		
		String response=null;
		if(infoRequired.equalsIgnoreCase("shopname")) {
			response="Vinu's TestMart";
		}else if(infoRequired.equalsIgnoreCase("since")) {
			response="Since 2018";
		}else {
			throw new InvalidInputException("Invalid Property", infoRequired+" is not a valid input");
		}
		
		return response;
	}
}
