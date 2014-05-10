package nl.openweb.hippo.beans;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.hippoecm.hst.content.rewriter.ContentRewriter;
import org.hippoecm.hst.content.rewriter.impl.SimpleContentRewriter;
import org.hippoecm.hst.core.component.HstRequest;

import com.google.gson.annotations.Expose;

@Node(jcrType = "angularhippo:textdocument")
public class TextDocument extends BaseDocument implements LoadInterface {

    @Expose
    private String title;
    @Expose
    private String summary;
    @Expose
    private String html;

    public void load(HstRequest request) {
        this.title = getProperty("angularhippo:title");
        this.summary = getProperty("angularhippo:summary");
        HippoHtml hippoHtml = getHippoHtml("angularhippo:body");
        if (hippoHtml != null) {
            html = hippoHtml.getContent();

            ContentRewriter<String> contentRewriter = new SimpleContentRewriter();
            contentRewriter.setFullyQualifiedLinks(true);
            html = contentRewriter.rewrite(hippoHtml.getContent(), hippoHtml.getNode(), request.getRequestContext());

        }
    }

    public String getTitle() {
        return this.title;
    }

    public String getSummary() {
        return this.summary;
    }

    public String getHtml() {
        return html;
    }
}
