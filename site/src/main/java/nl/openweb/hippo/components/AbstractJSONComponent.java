package nl.openweb.hippo.components;

import java.util.HashMap;
import java.util.Map;

import nl.openweb.hippo.beans.HstComponentConfig;

import org.hippoecm.hst.component.support.bean.BaseHstComponent;
import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.component.HstResponse;
import org.hippoecm.hst.site.HstServices;

import com.google.gson.Gson;

public abstract class AbstractJSONComponent extends BaseHstComponent {

    private static final String PARAM_ANGULAR_CONTROLLER = "angularController";
    private static final String JSON_TEMPLATE = "jsp/json.jsp";
    private Gson gson = HstServices.getComponentManager().getComponent("gsonExposeAnnotation");

    @Override
    public void doBeforeRender(HstRequest request, HstResponse response) {
        response.setRenderPath(JSON_TEMPLATE);
        request.setAttribute("model", gson.toJson(getModel(request)));
        request.setAttribute("config", gson.toJson(getHstComponentConfiguration(request)));
        request.setAttribute("childContentNames", response.getChildContentNames());
    }

    private HstComponentConfig getHstComponentConfiguration(HstRequest request) {
        HstComponentConfig result = new HstComponentConfig();
        result.setTemplate("/web/" + getComponentConfiguration().getRenderPath());
        Map<String, String> componentParameters = new HashMap<String, String>(getComponentParameters());
        result.setController(componentParameters.remove(PARAM_ANGULAR_CONTROLLER));
        result.setParamters(componentParameters);
        return result;
    }

    protected abstract Map<String, Object> getModel(HstRequest request);
        
}
