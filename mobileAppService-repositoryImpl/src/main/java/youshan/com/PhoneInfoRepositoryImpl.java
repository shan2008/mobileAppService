package youshan.com;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by syou on 2017/12/31.
 */

@Component
public class PhoneInfoRepositoryImpl implements PhoneInfoRepository {
    @Override
    public PhoneInfoEntity getPhonInfoById(int id) {
        PhoneInfoEntity phoneInfoEntity = new PhoneInfoEntity();
        phoneInfoEntity.setId(1);
        phoneInfoEntity.setUserName("youshan");
        return phoneInfoEntity;
    }

    @Override
    public boolean deletePhoneInfoById(int id) {
        return true;
    }
}
