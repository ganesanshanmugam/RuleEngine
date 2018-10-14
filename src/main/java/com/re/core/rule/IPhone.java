package com.re.core.rule;

import com.re.core.IRule;
import com.re.core.OSType;
import com.re.core.Phone;

public class IPhone implements IRule<Phone, Phone> {
    @Override
    public boolean matches(Phone phone) {
        return phone.getOsType().equals(OSType.IOS);
    }

    @Override
    public Phone process(Phone input) {
        input.setModel("IPhone X");
        return input;
    }
}
