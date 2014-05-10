package nl.openweb.hippo.beans;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSetBean;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.hippoecm.hst.content.rewriter.ContentRewriter;
import org.hippoecm.hst.content.rewriter.impl.SimpleContentRewriter;
import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.linking.HstLink;
import org.hippoecm.hst.core.request.HstRequestContext;

import com.google.gson.annotations.Expose;

@Node(jcrType = "angularhippo:newsdocument")
public class NewsDocument extends BaseDocument implements LoadInterface {

    @Expose
    private String title;
    @Expose
    private String summary;

    @Expose
    private Calendar date;
    @Expose
    private String formatedDate;

    @Expose
    private String html;

    @Expose
    private String image;
    @Expose
    private String imageDescription;
    @Expose
    private String imageFileName;

    public void load(HstRequest request) {
        this.title = getProperty("angularhippo:title");
        this.summary = getProperty("angularhippo:summary");

        this.date = getProperty("angularhippo:date");
        if (getDate() != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy hh:mm a");
            this.formatedDate = sdf.format(date.getTime());
        }

        HippoHtml hippoHtml = getHippoHtml("angularhippo:body");
        if (hippoHtml != null) {
            html = hippoHtml.getContent();

            ContentRewriter<String> contentRewriter = new SimpleContentRewriter();
            contentRewriter.setFullyQualifiedLinks(true);
            html = contentRewriter.rewrite(hippoHtml.getContent(), hippoHtml.getNode(), request.getRequestContext());

        }

        HippoGalleryImageSetBean imageSetBean = getLinkedBean("angularhippo:image", HippoGalleryImageSetBean.class);
        if (imageSetBean != null) {
            HstRequestContext requestContext = request.getRequestContext();
            HstLink link = requestContext.getHstLinkCreator().create(imageSetBean, requestContext);
            image = link.toUrlForm(requestContext, true);
            this.imageDescription = imageSetBean.getDescription();
            this.imageFileName = imageSetBean.getFileName();
        }

    }

    public String getTitle() {
        return this.title;
    }

    public String getSummary() {
        return this.summary;
    }

    public Calendar getDate() {
        return date;
    }

    public String getHtml() {
        return html;
    }

    /**
     * Get the imageset of the newspage
     *
     * @return the imageset of the newspage
     */
    public String getImageDescription() {
        return imageDescription;
    }

    public String getImage() {
        return image;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public String getFormatedDate() {
        return this.formatedDate;
    }
}
