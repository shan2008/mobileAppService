package youshan.com;

/**
 * Created by syou on 2017/12/31.
 */
public interface PhoneInfoRepository {
    PhoneInfoEntity getPhonInfoById(int id);

    boolean deletePhoneInfoById(int id);
}
