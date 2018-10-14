package com.re.core.rule;

import com.re.core.IRule;
import com.re.core.OSType;
import com.re.core.Phone;

public class Android implements IRule<Phone, Phone> {
    @Override
    public boolean matches(Phone phone) {
        return phone.getOsType().equals(OSType.ANDROID);
    }

    @Override
    public Phone process(Phone input) {
        input.setModel("Pixel");
        return input;
    }
}
