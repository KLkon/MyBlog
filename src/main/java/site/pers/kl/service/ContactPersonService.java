package site.pers.kl.service;

import org.springframework.beans.factory.annotation.Autowired;
import site.pers.kl.bean.ContactPerson;
import site.pers.kl.dao.ContactPersonMapper;

public interface ContactPersonService {
    //新添联系信息
    public int addContactMessage(ContactPerson contactPerson);
}
