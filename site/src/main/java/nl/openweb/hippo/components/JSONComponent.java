package nl.openweb.hippo.components;

import java.util.HashMap;
import java.util.Map;

import nl.openweb.hippo.beans.LoadInterface;

import org.hippoecm.hst.component.support.bean.BaseHstComponent;
import org.hippoecm.hst.content.beans.standard.HippoBean;
import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.component.HstResponse;
import org.hippoecm.hst.site.HstServices;

import com.google.gson.Gson;

public class JSONComponent extends BaseHstComponent {

    private static final String JSON_TEMPLATE = "jsp/json.jsp";
    private Gson gson = HstServices.getComponentManager().getComponent("gsonExposeAnnotation");

    @Override
    public void doBeforeRender(HstRequest request, HstResponse response) {
        Object bean = getModel(request);
        response.setRenderPath(JSON_TEMPLATE);
        request.setAttribute("json", gson.toJson(bean));
    }

    private Map<String, Object> getModel(HstRequest request) {
        Map<String, Object> result = new HashMap<String, Object>();
        HippoBean contentBean = getContentBean(request, HippoBean.class);
        if (contentBean instanceof LoadInterface) {
            ((LoadInterface) contentBean).load(request);
        }
        result.put("template", request.getRequestContext().getResolvedSiteMapItem().getHstComponentConfiguration()
                .getRenderPath());
        result.put("document", contentBean);
        return result;
    }
}
