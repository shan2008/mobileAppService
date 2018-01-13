package youshan.com;

import javax.jws.WebService;

/**
 * Created by syou on 2017/12/31.
 */
@WebService
public interface MobileAppService {

   public PhoneInfoEntity getPhonInfoById(int id);

   public boolean deletePhoneInfoById(int id);
}
