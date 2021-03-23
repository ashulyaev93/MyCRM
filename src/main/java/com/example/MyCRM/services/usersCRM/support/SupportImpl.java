package com.example.MyCRM.services.usersCRM.support;

import com.example.MyCRM.services.usersCRM.support.worksSupport.EnginHelpUsersWorker;
import com.example.MyCRM.services.usersCRM.support.worksSupport.EnginWorksWorker;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class SupportImpl implements Support{

    private final EnginWorksWorker problemsWithCRM;
    private final EnginHelpUsersWorker answerQuestionForCRM;

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
