package site.pers.kl.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.pers.kl.bean.ContactPerson;
import site.pers.kl.dao.ContactPersonMapper;
import site.pers.kl.service.ContactPersonService;

@Service
public class ContactPersonServiceImpl implements ContactPersonService {

    @Autowired
    private ContactPersonMapper contactPersonMapper;

    /**
     * 添加联系人信息
     * @param contactPerson
     */
    @Override
    public int addContactMessage(ContactPerson contactPerson) {
        return contactPersonMapper.insert(contactPerson);
    }
}
