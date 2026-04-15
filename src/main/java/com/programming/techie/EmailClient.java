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

    // constructor injection
    //  EmailClient(SpellChecker spellChecker){
        // this.spellChecker=spellChecker; // loosely coupled
    // }
    

    @Autowired // field injection 
    @Qualifier("advancedSpellChecker")
    private SpellChecker spellChecker;

    
    // here we can change the type of spellChecker and resolve autowiring issue by Type
    // @AutoWired
    // public void setSpellChecker(BasicSpellChecker spellChecker){
    //     this.spellChecker=spellChecker;
    // }

    // // here we can change the name of spellChecker and resolve autowiring issue by Name
    // @AutoWired
    // public void setSpellChecker(SpellChecker advancedSpellChecker){
    //     this.spellChecker=advancedSpellChecker;
    // }

    @AutoWired // using setter injection
    public void setSpellChecker(SpellChecker spellChecker){
        this.spellChecker=spellChecker;
    }

    public SpellChecker getSpellChecker(){
        return spellChecker;
    }

    void sendEmail(String emailMessage) {
        // basicSpellChecker.checkSpelling(emailMessage); // manual object creation 
        // advancedSpellChecker.checkSpelling(emailMessage); // manual object creation 
        // spellChecker.checkSpelling(emailMessage); // loosely coupled
        spellChecker.checkSpelling(emailMessage);
        // Logic to Send Email
    }
}
