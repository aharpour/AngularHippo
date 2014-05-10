package nl.openweb.hippo.beans;

import java.util.Map;

import com.google.gson.annotations.Expose;

public class HstComponentConfig {

    @Expose
    private String template;

    @Expose
    private String controller;

    @Expose
    private Map<String, String> paramters;

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }

    public Map<String, String> getParamters() {
        return paramters;
    }

    public void setParamters(Map<String, String> paramters) {
        this.paramters = paramters;
    }

}
