package nl.openweb.hippo.components;

import java.util.HashMap;
import java.util.Map;

import nl.openweb.hippo.beans.LoadInterface;

import org.hippoecm.hst.content.beans.standard.HippoBean;
import org.hippoecm.hst.core.component.HstRequest;

public class JSONComponent extends AbstractJSONComponent {

    @Override
    protected Map<String, Object> getModel(HstRequest request) {
        Map<String, Object> result = new HashMap<String, Object>();
        HippoBean contentBean = getContentBean(request, HippoBean.class);
        if (contentBean instanceof LoadInterface) {
            ((LoadInterface) contentBean).load(request);
        }
        result.put("document", contentBean);
        return result;
    }

}
