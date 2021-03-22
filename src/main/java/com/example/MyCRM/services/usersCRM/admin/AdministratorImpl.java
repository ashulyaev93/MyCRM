package com.example.MyCRM.services.usersCRM.admin;

import com.example.MyCRM.services.usersCRM.admin.worksAdmin.*;
import com.example.MyCRM.services.usersCRM.admin.worksAdmin.entity.CrossFitTrain;
import com.example.MyCRM.services.usersCRM.admin.worksAdmin.entity.EmailMessage;
import com.example.MyCRM.services.usersCRM.admin.worksAdmin.entity.FacebookMessage;
import com.example.MyCRM.services.usersCRM.admin.worksAdmin.entity.SMSMessage;
import org.springframework.stereotype.Service;

@Service
public class AdministratorImpl implements Administrator{
    private CommunicationWorker worksWithMessageFirstMessanger;
    private CommunicationWorker worksWithMessageSecondMessanger;
    private CommunicationWorker worksWithMessageThirdMessanger;
    private TimeTableWorker addWorkoutFirst;

    public AdministratorImpl(){
        this.worksWithMessageFirstMessanger = new SMSMessage();
        this.worksWithMessageSecondMessanger = new EmailMessage();
        this.worksWithMessageThirdMessanger = new FacebookMessage();
        this.addWorkoutFirst = new CrossFitTrain();
    }


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
