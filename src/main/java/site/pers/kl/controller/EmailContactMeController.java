package site.pers.kl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import site.pers.kl.bean.ContactPerson;
import site.pers.kl.bean.message.Message;
import site.pers.kl.service.ContactPersonService;
import site.pers.kl.util.EmailUtil;

@Controller
public class EmailContactMeController {

    @Autowired
    private ContactPersonService contactPersonService;

    /**
     *
     * @param contactPerson
     */
    @RequestMapping("/contactMe")
    @ResponseBody
    public ModelAndView contactMe(ContactPerson contactPerson) {
        ModelAndView modelAndView = null;
        Message message = new Message();
        String realName = contactPerson.getpName().trim();
        String realEmail = contactPerson.getpEmail().trim();
        String realConnection = contactPerson.getpConnection().trim();
        String realMessage = contactPerson.getpMessage().trim();
        int res = 0;
        //String flag = "failure";
        //System.out.println(realName.equals(""));
        if(contactPerson != null) {
            if(!realName.equals("") && !realEmail.equals("") && !realMessage.equals("")) {
                res = contactPersonService.addContactMessage(contactPerson);
                System.out.println(res+ "-----------------------------------------------------------==================================");
                //flag = EmailUtil.sendMessageToMail(realMessage, realName, realEmail);
                if(res > 0) {
                    //message.getExtend().put("flag" , flag);
                    message.getExtend().put("addDB", "添加到数据库成功！");
                    modelAndView = new ModelAndView("success", "message", message);
                }
            }else {
                //message.getExtend().put("flag" , flag);
                message.getExtend().put("addDB", "添加到数据库失败！");
                modelAndView = new ModelAndView("success", "message", message);
            }
        }
        return modelAndView;
    }

}
