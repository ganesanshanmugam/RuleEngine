package com.re.core;

import java.util.ArrayList;
import java.util.List;

public class RuleEngine<M> {

    static List<IRule> ruleList = new ArrayList<IRule>();


    public M runRule(M model, String message) {

        return ruleList.stream()
                .filter(rule -> rule.matches(model))
                .map(rule -> (M) rule.process(model))
                .findFirst().orElseThrow(() -> new RuntimeException(message));
    }

    public RuleEngine register(IRule<M, M> iRule) {
        ruleList.add(iRule);
        return this;
    }


}
