// Auto generated from com.company.OptionalForFactory by Soabase MonadicFor annotation processor
package com.company;

import io.soabase.halva.any.AnyVal;
import io.soabase.halva.comprehension.MonadicForImpl;
import java.lang.Boolean;
import java.lang.SuppressWarnings;
import java.util.Optional;
import java.util.function.Supplier;

public class OptionalFor {
    private final MonadicForImpl<Optional> delegate;

    private OptionalFor(MonadicForImpl<Optional> delegate) {
        this.delegate = delegate;
    }

    public static OptionalFor start() {
        return new OptionalFor(new MonadicForImpl<>(new OptionalForFactory()));
    }

    public <A> OptionalFor forComp(AnyVal<A> any, Supplier<? extends Optional<A>> supplier) {
        delegate.forComp(any, supplier);
        return this;
    }

    @SuppressWarnings("unchecked")
    public <A> Optional<A> yield(Supplier<A> supplier) {
        return delegate.yield(supplier);
    }

    public <R> OptionalFor letComp(AnyVal<R> any, Supplier<R> supplier) {
        delegate.letComp(any, supplier);
        return this;
    }

    public OptionalFor filter(Supplier<Boolean> supplier) {
        delegate.filter(supplier);
        return this;
    }
}
