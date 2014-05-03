package nl.openweb.hippo.beans;

import java.util.Calendar;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSetBean;

@Node(jcrType="angularhippo:newsdocument")
public class NewsDocument extends BaseDocument{

    public String getTitle() {
        return getProperty("angularhippo:title");
    }
    
    public String getSummary() {
        return getProperty("angularhippo:summary");
    }
    
    public Calendar getDate() {
        return getProperty("angularhippo:date");
    }

    public HippoHtml getHtml(){
        return getHippoHtml("angularhippo:body");    
    }

    /**
     * Get the imageset of the newspage
     *
     * @return the imageset of the newspage
     */
    public HippoGalleryImageSetBean getImage() {
        return getLinkedBean("angularhippo:image", HippoGalleryImageSetBean.class);
    }


}
