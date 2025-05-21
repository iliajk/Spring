package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Worker {
    //@Autowired
    //@Qualifier("simpleLogicClass")
    private final LogicClass logicClass;

    //@Autowired
    //@Qualifier("logicClassData")
    private final LogicClass dataLogicClass;

    //@Autowired
    private final DataComponent dataComponent;
    //@Autowired
    //public void setDataComponent(DataComponent dataComponent) {
    //    this.dataComponent = dataComponent;
    //}

    @Autowired
    public Worker(@Qualifier("simpleLogicClass") LogicClass logicClass, @Qualifier("logicClassData") LogicClass dataLogicClass, DataComponent dataComponent) {
        this.logicClass = logicClass;
        this.dataLogicClass = dataLogicClass;
        this.dataComponent = dataComponent;
    }

    public void call(){
        logicClass.SimpleLogic();
        dataLogicClass.SimpleLogic();
        dataComponent.work();
    }
}
