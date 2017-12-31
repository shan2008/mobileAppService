package youshan.com;

import javax.jws.WebService;

/**
 * Created by syou on 2017/12/31.
 */
@WebService
public interface MobileAppService {

    PhoneInfoEntity getPhonInfoById(int id);

    boolean deletePhoneInfoById(int id);
}
