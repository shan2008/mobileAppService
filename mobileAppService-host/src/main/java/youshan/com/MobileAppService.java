package youshan.com;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * Created by syou on 2017/12/31.
 *整合默认是带注解发布,wsdl文件会给你加上Service name 注解可修改服务名称
 *
 */
@WebService(serviceName = "MobileAppService")
public interface MobileAppService {
   public @WebResult(name = "result") PhoneInfoEntity getPhonInfoById(@WebParam(name = "id") int id);
   public @WebResult(name = "result") boolean deletePhoneInfoById(@WebParam(name = "id") int id);
}
