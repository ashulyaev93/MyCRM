package com.example.MyCRM.services.usersCRM.support;

import com.example.MyCRM.services.usersCRM.support.worksSupport.EnginHelpUsersWorker;
import com.example.MyCRM.services.usersCRM.support.worksSupport.EnginWorksWorker;
import com.example.MyCRM.services.usersCRM.support.worksSupport.entity.AddClientContract;
import com.example.MyCRM.services.usersCRM.support.worksSupport.entity.DownloadClientCard;
import org.springframework.stereotype.Service;

@Service
public class SupportImpl implements Support{

    private EnginWorksWorker problemsWithCRM;
    private EnginHelpUsersWorker answerQuestionForCRM;

    public SupportImpl(){
        this.problemsWithCRM = new DownloadClientCard();
        this.answerQuestionForCRM = new AddClientContract();
    }

    @Override
    public String settingCRM(String addDiscription, String setting, String deleteError) {
        String err = problemsWithCRM.problems(addDiscription, setting, deleteError);
        return err;
    }

    @Override
    public String consultation(String callUp, String sendMessage) {
        String consult = answerQuestionForCRM.answerQuestion(callUp, sendMessage);
        return consult;
    }
}
