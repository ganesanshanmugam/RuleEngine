package com.re.core;

import java.util.ArrayList;
import java.util.List;

public class RuleEngine {

    static List<IRule> ruleList = new ArrayList<IRule>();


    public Phone runRule(Phone phone) {

        return ruleList.stream()
                .filter(rule -> rule.matches(phone))
                .map(rule -> (Phone) rule.process(phone))
                .findFirst().orElseThrow(() -> new RuntimeException("No Match rule found"));
    }

    public RuleEngine register(IRule<Phone, Phone> iRule) {
        ruleList.add(iRule);
        return this;
    }


}
