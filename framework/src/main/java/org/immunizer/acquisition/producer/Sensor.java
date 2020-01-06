package org.immunizer.acquisition.producer;

import org.immunizer.acquisition.Invocation;

public abstract class Sensor {

    private static Sensor singleton;
    
    protected Sensor() {}
    
    public static Sensor getSingleton() {
        if (singleton == null) {
            singleton = new KafkaSensor();
        }
        return singleton;
    }

    public abstract void send(Invocation invocation);
}