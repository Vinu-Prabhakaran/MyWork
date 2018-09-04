package com.vinu.service.HolidayWebServiceSOAP;

import java.util.List;

import com.holidaywebservice.holidayservice_v2.*;

/**
 * wsimport -keep -s D:\WorkBench\MyEclipseworkSpace\HolidayWebservice  http://www.holidaywebservice.com/HolidayService_v2/HolidayService2.asmx?WSDL
 * Above command to create the necessary source programs from wsdl
 */
public class GetHolidayList 
{
    public static void main( String[] args )
    {
    	HolidayService2 holidayService= new HolidayService2();
    	HolidayService2Soap hService2Soap = holidayService.getHolidayService2Soap();
    	List<CountryCode> listCtryCode = hService2Soap.getCountriesAvailable().getCountryCode();
    	
    	
    	List<HolidayCode> listHldayCode =  hService2Soap.getHolidaysAvailable(Country.UNITED_STATES).getHolidayCode();
    	
    	
    	System.out.println("List of Countries Available");
    	for(CountryCode cCode:listCtryCode) {
    		System.out.println("CountryCode :" + cCode.getCode()+", Description :"+cCode.getDescription());
    	}
    	
    	System.out.println("*********List of Holidays for USA**************");
    	for(HolidayCode hCode : listHldayCode) {
    		System.out.println(hCode.getCode()+" => "+hCode.getDescription()+" , "+hService2Soap.getHolidayDate(Country.UNITED_STATES, hCode.getCode(), 2018));
    	}
    }
}
