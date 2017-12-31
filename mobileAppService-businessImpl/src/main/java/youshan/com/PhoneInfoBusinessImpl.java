package youshan.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by syou on 2017/12/31.
 */
@Component
public class PhoneInfoBusinessImpl implements PhoneInfoBusiness {
    @Autowired
    private PhoneInfoRepository phoneInfoRepository;

    @Override
    public PhoneInfoEntity getPhonInfoById(int id) {
        return null;
    }

    @Override
    public boolean deletePhoneInfoById(int id) {
        return false;
    }
}
