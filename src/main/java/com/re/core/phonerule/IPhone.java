package com.re.core.phonerule;

import com.re.core.IRule;

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
