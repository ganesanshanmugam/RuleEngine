package com.re.userinfo.template;

import com.re.core.OSType;
import com.re.core.Phone;
import com.re.core.RuleEngine;
import com.re.core.rule.Android;
import com.re.core.rule.IPhone;

public class RuleEngineTester {
    public static void main(String[] args) {
        RuleEngine ruleEngine = new RuleEngine();
        ruleEngine.register(new IPhone());
        ruleEngine.register(new Android());

        System.out.println(ruleEngine.runRule(new Phone(OSType.IOS)));
        System.out.println(ruleEngine.runRule(new Phone(OSType.ANDROID)));
        System.out.println(ruleEngine.runRule(new Phone(OSType.WINDOWS)));
    }
}
