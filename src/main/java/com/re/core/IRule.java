package com.re.core;

public interface IRule<I, O> {

    boolean matches(I i);

    O process(I input);
}
