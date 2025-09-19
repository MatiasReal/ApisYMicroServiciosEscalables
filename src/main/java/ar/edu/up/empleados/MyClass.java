package ar.edu.up.empleados;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyClass implements CommandLineRunner {

    @Value("${myapp.name}")
    private String appName;

    @Value("${myapp.version}")
    private int appVersion;

    @Override
    public void run(String[] args) throws Exception {
        System.out.println("Application Name: " + appName);
        System.out.println("Application Version: " + appVersion);
    }
}
