package com.re.core.phonerule;

import com.re.core.IRule;

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
