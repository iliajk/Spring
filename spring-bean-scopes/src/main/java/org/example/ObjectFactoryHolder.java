package org.example;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.stereotype.Component;

@Component
public class ObjectFactoryHolder {
    private final ObjectFactory<PrototypeComponent> prototypeComponentObjectFactory;
    private final ObjectFactory<FirstSingleton> firstSingletonObjectFactory;
    private final ObjectFactory<SecondSingleton> secondSingletonObjectFactory;

    public ObjectFactoryHolder(ObjectFactory<PrototypeComponent> prototypeComponentObjectFactory,
                               ObjectFactory<FirstSingleton> firstSingletonObjectFactory,
                               ObjectFactory<SecondSingleton> secondSingletonObjectFactory) {
        this.prototypeComponentObjectFactory = prototypeComponentObjectFactory;
        this.firstSingletonObjectFactory = firstSingletonObjectFactory;
        this.secondSingletonObjectFactory = secondSingletonObjectFactory;
    }
    public FirstSingleton getFirstSingleton() {
        return firstSingletonObjectFactory.getObject();
    }
    public SecondSingleton getSecondSingleton() {
        return secondSingletonObjectFactory.getObject();
    }
    public PrototypeComponent getPrototypeComponent() {
        return prototypeComponentObjectFactory.getObject();
    }
}
