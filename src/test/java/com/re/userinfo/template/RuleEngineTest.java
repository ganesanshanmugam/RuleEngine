package com.re.userinfo.template;

import com.re.core.RuleEngine;
import com.re.core.phonerule.Android;
import com.re.core.phonerule.IPhone;
import com.re.core.phonerule.OSType;
import com.re.core.phonerule.Phone;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RuleEngineTest {


    private RuleEngine<Phone> ruleEngine;

    @Test
    public void thatShouldReturnIPhoneXModelWhenRequestContainsIOSModel() {
        Phone phone = ruleEngine.runRule(new Phone(OSType.IOS), "");
        assertThat(phone.getModel(), is("IPhone X"));
    }

    @Test
    public void thatShouldReturnPixelModelWhenRequestContainsIOSModel() {
        Phone phone = ruleEngine.runRule(new Phone(OSType.ANDROID), "");
        assertThat(phone.getModel(), is("Pixel"));
    }

    @Test(expected = RuntimeException.class)
    public void thatShouldReturnExceptionWhenRequestContainsUndefinedIOSModel() {
        ruleEngine.runRule(new Phone(OSType.WINDOWS), "");
    }

    @Before
    public void init() {
        ruleEngine = new RuleEngine();
        ruleEngine.register(new IPhone());
        ruleEngine.register(new Android());
    }
}
