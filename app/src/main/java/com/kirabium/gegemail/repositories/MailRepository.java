package com.kirabium.gegemail.repositories;

import com.kirabium.gegemail.di.DI;
import com.kirabium.gegemail.model.Mail;
import com.kirabium.gegemail.service.DummyMailApiService;
import com.kirabium.gegemail.service.MailApiService;

import java.util.ArrayList;
import java.util.List;

public class MailRepository {
    private static final MailApiService service = DI.getMailApiService();

    public List<Mail> getMails(){
        return service.getMails();
    }

    public void deleteMail(Mail mail){
        service.deleteMail(mail);
    }

    public void addMail(Mail mail){
        service.createMail(mail);
    }

}
        git init
        git add .
        git commit -m "first commit"
        git branch -M main
        git remote add origin https://github.com/Kirabium/openclassrooms_mvvvm_webinar.git
        git push -u origin main
