package com.CallBoard.myapp.infra.commons.core;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

/** 
* <pre>
* 1. ClassName : BaseController
* 2. Comment	 : controller? κ³΅ν΅ ?¬?­ ?¬?¨(base) 
* 3. ??±?Ό	 : 2014. 12. 21
* </pre>
* @author wclee
* @extends 
* @implements 
* @throws 
*/
@Controller
public abstract class BaseController {
	
	private Logger logger = Logger.getLogger(getClass());

	/** 
	* <pre>
	* 1. MethodName : debugLog
	* 2. Comment	 : ?λ²κ·Έ λ‘κ·Έ ??±
	* 3. ??±?Ό	 : 2014. 12. 21
	* </pre>
	* @author wclee
	* @param debugMsg λ‘κ·Έ λ©μΈμ§?
	* @return 
	* @throws 
	*/
	protected void debugLog(String debugMsg){
		if(logger.isDebugEnabled()){
			logger.debug(debugMsg);
		}
	}

	/** 
	* <pre>
	* 1. MethodName : infoLog
	* 2. Comment	 : info λ‘κ·Έ ??±
	* 3. ??±?Ό	 : 2014. 12. 21
	* </pre>
	* @author wclee
	* @param infoMsg λ‘κ·Έ λ©μΈμ§?
	* @return 
	* @throws 
	*/
	protected void infoLog(String infoMsg){
		if(logger.isInfoEnabled()){
			logger.info(infoMsg);
		}
	}

	/** 
	* <pre>
	* 1. MethodName : warnLog
	* 2. Comment	 : warn λ‘κ·Έ ??±
	* 3. ??±?Ό	 : 2014. 12. 21
	* </pre>
	* @author wclee
	* @param debugMsg
	* @return 
	* @throws 
	*/
	protected void warnLog(String warnMsg) {
		logger.warn(warnMsg);
	}

	/** 
	* <pre>
	* 1. MethodName : errorLog
	* 2. Comment	 : error λ‘κ·Έ ??±
	* 3. ??±?Ό	 : 2014. 12. 21
	* </pre>
	* @author wclee
	* @param errMsg ??¬ λ©μΈμ§?
	* @return 
	* @throws 
	*/
	protected void errorLog(String errMsg){
		logger.error(errMsg);
	}

	/** 
	* <pre>
	* 1. MethodName : errorLog
	* 2. Comment	 : error λ‘κ·Έ ??±
	* 3. ??±?Ό	 : 2014. 12. 21
	* </pre>
	* @author wclee
	* @param errorMsg ??¬λ©μΈμ§?
	* @param throwable ??Έ 
	* @return 
	* @throws 
	*/
	protected void errorLog(String errMsg, Throwable e){
		logger.error(errMsg, e);
	}

	/** 
	* <pre>
	* 1. MethodName : fatalLog
	* 2. Comment	 : fatal λ‘κ·Έ ??±
	* 3. ??±?Ό	 : 2014. 12. 21
	* </pre>
	* @author wclee
	* @param fatalMsg λ‘κ·Έ λ©μΈμ§?
	* @return 
	* @throws 
	*/
	protected void fatalLog(String fatalMsg) {
		logger.fatal(fatalMsg);
	}

	/** 
	* <pre>
	* 1. MethodName : getHeaders
	* 2. Comment	 : request header?€(λ³΅μ) κ°?? Έ?€κΈ?
	* 3. ??±?Ό	 : 2014. 12. 21
	* </pre>
	* @author wclee
	* @param HttpServletRequest ?€?
	* @return headers
	* @throws Exception
	*/
	protected Map<String, String> getHeaders(HttpServletRequest request) throws Exception {
		Map<String, String> headers = new HashMap<String, String>();
		Enumeration<?> eheaders = request.getHeaderNames();
		while (eheaders.hasMoreElements()) {
			String key = (String) eheaders.nextElement();
			String value = request.getHeader(key);
			headers.put(key, value);
		}
		return headers;
	}

	/** 
	* <pre>
	* 1. MethodName : getHeader
	* 2. Comment	 : request header κ°?? Έ?€κΈ?
	* 3. ??±?Ό	 : 2014. 12. 21
	* </pre>
	* @author wclee
	* @param HttpServletRequest ?€?
	* @return request.getHeader(headerName)
	* @throws Exception
	*/
	protected String getHeader(HttpServletRequest request, String headerName) throws Exception {
		return request.getHeader(headerName);
	}
	
	/**
	 * <pre>
	 * alert and go returnUri	
	 * </pre>
	 * @param alertMsg
	 * @param returnUri
	 * @return
	 * @throws Exception
	 */
	/** 
	* <pre>
	* 1. MethodName : alert
	* 2. Comment	 : alert and go returnUri
	* 3. ??±?Ό	 : 2014. 12. 21
	* </pre>
	* @author wclee
	* @param returnUri
	* @param model
	* @return /common/alert
	* @throws Exception
	*/
	public String alert(String alertMsg, String returnUri, ModelMap model) throws Exception {
		model.addAttribute("alertMsg", alertMsg);
		model.addAttribute("returnUri", returnUri);
		return "/common/alert";
	}
}
