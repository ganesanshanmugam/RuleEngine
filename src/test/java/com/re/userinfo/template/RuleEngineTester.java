package com.re.userinfo.template;

import com.re.core.RuleEngine;
import com.re.core.phonerule.Android;
import com.re.core.phonerule.IPhone;
import com.re.core.phonerule.OSType;
import com.re.core.phonerule.Phone;

public class RuleEngineTester {
    public static void main(String[] args) {
        RuleEngine<Phone> ruleEngine = new RuleEngine();
        ruleEngine.register(new IPhone());
        ruleEngine.register(new Android());

        System.out.println(ruleEngine.runRule(new Phone(OSType.IOS), "No Match phonerule found"));
        System.out.println(ruleEngine.runRule(new Phone(OSType.ANDROID), "No Match phonerule found"));
        System.out.println(ruleEngine.runRule(new Phone(OSType.WINDOWS), "No Match phonerule found"));
    }
}
