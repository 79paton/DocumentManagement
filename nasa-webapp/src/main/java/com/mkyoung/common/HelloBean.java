package com.mkyoung.common;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Created by 79Paton on 14/02/2016.
 *
 *
 */

@ManagedBean
@SessionScoped
public class HelloBean {

    private static final long serialVersionUID = 1L;

    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
