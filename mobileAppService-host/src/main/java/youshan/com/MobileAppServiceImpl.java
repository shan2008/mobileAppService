package youshan.com;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

/**
 * Created by syou on 2017/12/31.
 */
@Component
public class MobileAppServiceImpl implements MobileAppService {
    @Autowired
    private PhoneInfoBusiness  phoneInfoBusiness;
    @Override
    public PhoneInfoEntity getPhonInfoById(int id) {
        return phoneInfoBusiness.getPhonInfoById(id);
    }

    @Override
    public boolean deletePhoneInfoById(int id) {
        return phoneInfoBusiness.deletePhoneInfoById(id);
    }
}
