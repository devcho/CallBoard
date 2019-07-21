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
* 2. Comment	 : controller?ùò Í≥µÌÜµ ?Ç¨?ï≠ ?è¨?ï®(base) 
* 3. ?ûë?Ñ±?ùº	 : 2014. 12. 21
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
	* 2. Comment	 : ?îîÎ≤ÑÍ∑∏ Î°úÍ∑∏ ?ûë?Ñ±
	* 3. ?ûë?Ñ±?ùº	 : 2014. 12. 21
	* </pre>
	* @author wclee
	* @param debugMsg Î°úÍ∑∏ Î©îÏÑ∏Ïß?
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
	* 2. Comment	 : info Î°úÍ∑∏ ?ûë?Ñ±
	* 3. ?ûë?Ñ±?ùº	 : 2014. 12. 21
	* </pre>
	* @author wclee
	* @param infoMsg Î°úÍ∑∏ Î©îÏÑ∏Ïß?
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
	* 2. Comment	 : warn Î°úÍ∑∏ ?ûë?Ñ±
	* 3. ?ûë?Ñ±?ùº	 : 2014. 12. 21
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
	* 2. Comment	 : error Î°úÍ∑∏ ?ûë?Ñ±
	* 3. ?ûë?Ñ±?ùº	 : 2014. 12. 21
	* </pre>
	* @author wclee
	* @param errMsg ?óê?ü¨ Î©îÏÑ∏Ïß?
	* @return 
	* @throws 
	*/
	protected void errorLog(String errMsg){
		logger.error(errMsg);
	}

	/** 
	* <pre>
	* 1. MethodName : errorLog
	* 2. Comment	 : error Î°úÍ∑∏ ?ûë?Ñ±
	* 3. ?ûë?Ñ±?ùº	 : 2014. 12. 21
	* </pre>
	* @author wclee
	* @param errorMsg ?óê?ü¨Î©îÏÑ∏Ïß?
	* @param throwable ?òà?ô∏ 
	* @return 
	* @throws 
	*/
	protected void errorLog(String errMsg, Throwable e){
		logger.error(errMsg, e);
	}

	/** 
	* <pre>
	* 1. MethodName : fatalLog
	* 2. Comment	 : fatal Î°úÍ∑∏ ?ûë?Ñ±
	* 3. ?ûë?Ñ±?ùº	 : 2014. 12. 21
	* </pre>
	* @author wclee
	* @param fatalMsg Î°úÍ∑∏ Î©îÏÑ∏Ïß?
	* @return 
	* @throws 
	*/
	protected void fatalLog(String fatalMsg) {
		logger.fatal(fatalMsg);
	}

	/** 
	* <pre>
	* 1. MethodName : getHeaders
	* 2. Comment	 : request header?ì§(Î≥µÏàò) Í∞??†∏?ò§Í∏?
	* 3. ?ûë?Ñ±?ùº	 : 2014. 12. 21
	* </pre>
	* @author wclee
	* @param HttpServletRequest ?ó§?çî
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
	* 2. Comment	 : request header Í∞??†∏?ò§Í∏?
	* 3. ?ûë?Ñ±?ùº	 : 2014. 12. 21
	* </pre>
	* @author wclee
	* @param HttpServletRequest ?ó§?çî
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
	* 3. ?ûë?Ñ±?ùº	 : 2014. 12. 21
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
