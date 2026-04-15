package com.programming.techie;

//@Component
//@Primary // always injects this bean when more than 2 beans are there
class BasicSpellChecker implements SpellChecker {

    public void init() {
        System.out.println("init inside Basic Spell Checker");
    }

    public void checkSpelling(String emailMessage) {
        if (emailMessage != null) {
            System.out.println("Checking spelling using BasicSpellChecker...");
            System.out.println("Spell Checking Completed!!");
        } else {
            throw new RuntimeException("An exception occurred " +
                    "while checking Spelling");
        }
    }

    public void destroy() {
        System.out.println("destroy inside Basic Spell Checker");
    }
}
