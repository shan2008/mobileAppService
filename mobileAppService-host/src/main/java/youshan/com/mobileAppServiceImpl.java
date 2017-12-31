package youshan.com;
import org.springframework.stereotype.Service;

/**
 * Created by syou on 2017/12/31.
 */

@Service
public class MobileAppServiceImpl implements MobileAppService {
    private final PhoneInfoBusiness  phoneInfoBusiness;

    public MobileAppServiceImpl(PhoneInfoBusiness phoneInfoBusiness){
        this.phoneInfoBusiness=phoneInfoBusiness;
    }

    @Override
    public PhoneInfoEntity getPhonInfoById(int id) {
        return phoneInfoBusiness.getPhonInfoById(id);
    }

    @Override
    public boolean deletePhoneInfoById(int id) {
        return phoneInfoBusiness.deletePhoneInfoById(id);
    }
}
