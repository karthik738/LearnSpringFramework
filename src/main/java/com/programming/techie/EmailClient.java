package com.programming.techie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
class EmailClient {

    // // manual object creation
    // private BasicSpellChecker basicSpellChecker; 
    // // manual object creation
    // EmailClient(){
    //     this.basicSpellChecker=new BasicSpellChecker();
    // }

    @Autowired
    @Qualifier("advancedSpellChecker")
    private SpellChecker spellChecker;

    void sendEmail(String emailMessage) {
        // basicSpellChecker.checkSpelling(emailMessage); // manual object creation 
        spellChecker.checkSpelling(emailMessage);
        // Logic to Send Email
    }
}
