package com.example.MyCRM.services.usersCRM.admin;

import com.example.MyCRM.services.usersCRM.admin.worksAdmin.*;
import com.example.MyCRM.services.usersCRM.admin.worksAdmin.entity.CrossFitTrain;
import com.example.MyCRM.services.usersCRM.admin.worksAdmin.entity.EmailMessage;
import com.example.MyCRM.services.usersCRM.admin.worksAdmin.entity.FacebookMessage;
import com.example.MyCRM.services.usersCRM.admin.worksAdmin.entity.SMSMessage;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class AdministratorImpl implements Administrator{
    private final CommunicationWorker worksWithMessageFirstMessanger;
    private final CommunicationWorker worksWithMessageSecondMessanger;
    private final CommunicationWorker worksWithMessageThirdMessanger;
    private final TimeTableWorker addWorkoutFirst;

    @Override
    public String sendMessage(String client, String inputText, String messanger) {
        String messageFirstMessanger = worksWithMessageFirstMessanger.worksWithMessage(client, inputText, messanger);
        String messageSecondMessanger = worksWithMessageSecondMessanger.worksWithMessage(client, inputText, messanger);
        String messageThirdMessanger = worksWithMessageThirdMessanger.worksWithMessage(client, inputText, messanger);
        return messageFirstMessanger + " " + messageSecondMessanger + " " + messageThirdMessanger;
    }

    @Override
    public String editTimeTable(String date, String createWorkout) {
        String workout = addWorkoutFirst.addWorkout(date, createWorkout);
        return workout;
    }
}
