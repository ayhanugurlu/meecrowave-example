package coim.au.example.service;

import javax.enterprise.context.ApplicationScoped;

/**
 * Created by Ayhan.Ugurlu on 02/02/2018
 */
@ApplicationScoped
public class ApplicationScopeService {

    private int counter = 0;

    public int increment() {
        return counter++;
    }

}
