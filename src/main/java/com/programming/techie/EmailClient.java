package com.programming.techie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
class EmailClient {

    //  manual object creation
    // private BasicSpellChecker basicSpellChecker; 
    // private AdvancedSpellChecker advancedSpellChecker; 
    //  manual object creation
    // EmailClient(){
    //     this.basicSpellChecker=new BasicSpellChecker(); // tightly coupled with basic spell checker
           // this.advancedSpellChecker=new AdvancedSpellChecker();  // tightly coupled with advanced spell checker
    // }

    // loosely coupled  - use interface implementation
    // private SpellChecker spellChecker; 

    //  EmailClient(SpellChecker spellChecker){
        // this.spellChecker=spellChecker; // loosely coupled
    // }
    

    @Autowired
    @Qualifier("advancedSpellChecker")
    private SpellChecker spellChecker;

    void sendEmail(String emailMessage) {
        // basicSpellChecker.checkSpelling(emailMessage); // manual object creation 
        // advancedSpellChecker.checkSpelling(emailMessage); // manual object creation 
        // spellChecker.checkSpelling(emailMessage); // loosely coupled
        spellChecker.checkSpelling(emailMessage);
        // Logic to Send Email
    }
}
