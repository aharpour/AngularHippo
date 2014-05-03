package nl.openweb.hippo.beans;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;

@Node(jcrType="angularhippo:textdocument")
public class TextDocument extends BaseDocument{
    
    public String getTitle() {
        return getProperty("angularhippo:title");
    }

    public String getSummary() {
        return getProperty("angularhippo:summary");
    }
    
    public HippoHtml getHtml(){
        return getHippoHtml("angularhippo:body");    
    }

}
