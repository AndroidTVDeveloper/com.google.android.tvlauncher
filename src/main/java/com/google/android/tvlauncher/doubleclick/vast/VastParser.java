package com.google.android.tvlauncher.doubleclick.vast;

import android.text.TextUtils;
import com.google.android.tvlauncher.doubleclick.proto.VideoCreative$VastXml$Builder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
public class VastParser {

    /* renamed from: a */
    public int f6432a;

    /* renamed from: b */
    public List f6433b = new ArrayList();

    /* renamed from: c */
    public cob f6434c;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.tvlauncher.doubleclick.vast.VastParser.a(java.lang.String, boolean):java.lang.String
     arg types: [java.lang.String, int]
     candidates:
      com.google.android.tvlauncher.doubleclick.vast.VastParser.a(cnf, cob):void
      com.google.android.tvlauncher.doubleclick.vast.VastParser.a(java.lang.String, boolean):java.lang.String */
    /* renamed from: a */
    public final void mo3365a(cnf cnf, cob cob) {
        this.f6434c = cob;
        cnf.mo3152a(mo3364a("VAST/Ad/%s/Creatives/Creative"), "AdID", "adId");
        cnf.mo3150a(mo3364a("VAST/Ad/%s/Creatives/Creative"), new cnv(cnf));
        cnf.mo3151a(mo3364a("VAST/Ad/%s/Survey"), "survey");
        cnf.mo3149a(m5277a("VAST/Ad/%s/Impression", true), cnh.f6114a);
        cnf.mo3151a(m5277a("VAST/Ad/%s/Impression", true), "url");
        cnf.mo3152a(m5277a("VAST/Ad/%s/Impression", true), "id", "id");
        cnf.mo3153b(m5277a("VAST/Ad/%s/Impression", true), "addImpression");
        cnf.mo3151a(m5277a("VAST/Ad/%s/VASTAdTagURI", true), "redirectUrl");
        cnf.mo3150a(mo3364a("VAST/Ad/%s/Creatives/Creative/Linear/Duration"), new cnw(cnf));
        cnf.mo3150a(mo3364a("VAST/Ad/%s/Creatives/Creative/Linear/AdParameters"), new cnx(cnf));
        cnf.mo3150a(mo3364a("VAST/Ad/%s/Extensions/Extension"), new cny(cnf));
        cnf.mo3150a(mo3364a("VAST/Ad/%s/Extensions/Extension/CustomTracking/Tracking"), new cnz(cnf));
        cnf.mo3151a(mo3364a("VAST/Ad/%s/Creatives/Creative/Linear/AdParameters"), "customParameters");
        cnf.mo3149a(mo3364a("VAST/Ad/%s/Creatives/Creative/Linear/TrackingEvents/Tracking"), cni.f6115a);
        cnf.mo3151a(m5277a("VAST/Ad/%s/Creatives/Creative/Linear/TrackingEvents/Tracking", true), "eventUrl");
        cnf.mo3152a(mo3364a("VAST/Ad/%s/Creatives/Creative/Linear/TrackingEvents/Tracking"), "event", "eventName");
        cnf.mo3153b(mo3364a("VAST/Ad/%s/Creatives/Creative/Linear/TrackingEvents/Tracking"), "addEventTracking");
        cnf.mo3150a(m5277a("VAST/Ad/%s/Creatives/Creative/Linear/VideoClicks/ClickThrough", true), new coa(cnf));
        cnf.mo3149a(m5277a("VAST/Ad/%s/Creatives/Creative/Linear/VideoClicks/ClickTracking", true), cnj.f6116a);
        cnf.mo3151a(m5277a("VAST/Ad/%s/Creatives/Creative/Linear/VideoClicks/ClickTracking", true), "eventUrl");
        cnf.mo3152a(m5277a("VAST/Ad/%s/Creatives/Creative/Linear/VideoClicks/ClickTracking", true), "id", "eventName");
        cnf.mo3153b(m5277a("VAST/Ad/%s/Creatives/Creative/Linear/VideoClicks/ClickTracking", true), "addClickTracking");
        cnf.mo3149a(m5277a("VAST/Ad/%s/Creatives/Creative/Linear/VideoClicks/CustomClick", true), cnk.f6117a);
        cnf.mo3151a(m5277a("VAST/Ad/%s/Creatives/Creative/Linear/VideoClicks/CustomClick", true), "eventUrl");
        cnf.mo3152a(m5277a("VAST/Ad/%s/Creatives/Creative/Linear/VideoClicks/CustomClick", true), "id", "eventName");
        cnf.mo3153b(m5277a("VAST/Ad/%s/Creatives/Creative/Linear/VideoClicks/CustomClick", true), "addCustomTracking");
        cnf.mo3149a(mo3364a("VAST/Ad/%s/Creatives/Creative/Linear/MediaFiles/MediaFile"), cnl.f6118a);
        cnf.mo3151a(m5277a("VAST/Ad/%s/Creatives/Creative/Linear/MediaFiles/MediaFile", true), "url");
        cnf.mo3152a(mo3364a("VAST/Ad/%s/Creatives/Creative/Linear/MediaFiles/MediaFile"), "delivery", "delivery");
        cnf.mo3152a(mo3364a("VAST/Ad/%s/Creatives/Creative/Linear/MediaFiles/MediaFile"), "type", "type");
        cnf.mo3152a(mo3364a("VAST/Ad/%s/Creatives/Creative/Linear/MediaFiles/MediaFile"), "bitrate", "bitrate");
        cnf.mo3152a(mo3364a("VAST/Ad/%s/Creatives/Creative/Linear/MediaFiles/MediaFile"), "width", "width");
        cnf.mo3152a(mo3364a("VAST/Ad/%s/Creatives/Creative/Linear/MediaFiles/MediaFile"), "height", "height");
        cnf.mo3152a(mo3364a("VAST/Ad/%s/Creatives/Creative/Linear/MediaFiles/MediaFile"), "scalable", "scalable");
        cnf.mo3152a(mo3364a("VAST/Ad/%s/Creatives/Creative/Linear/MediaFiles/MediaFile"), "apiFramework", "apiFramework");
        cnf.mo3152a(mo3364a("VAST/Ad/%s/Creatives/Creative/Linear/MediaFiles/MediaFile"), "maintainAspectRatio", "maintainAspectRatio");
        cnf.mo3153b(mo3364a("VAST/Ad/%s/Creatives/Creative/Linear/MediaFiles/MediaFile"), "addMedia");
        cnf.mo3149a(mo3364a("VAST/Ad/%s/Creatives/Creative/CompanionAds/Companion"), new cno(cnf));
        cnf.mo3152a(mo3364a("VAST/Ad/%s/Creatives/Creative/CompanionAds/Companion"), "width", "width");
        cnf.mo3152a(mo3364a("VAST/Ad/%s/Creatives/Creative/CompanionAds/Companion"), "height", "height");
        cnf.mo3152a(mo3364a("VAST/Ad/%s/Creatives/Creative/CompanionAds/Companion"), "expandedWidth", "expandedWidth");
        cnf.mo3152a(mo3364a("VAST/Ad/%s/Creatives/Creative/CompanionAds/Companion"), "expandedHeight", "expandedHeight");
        cnf.mo3152a(mo3364a("VAST/Ad/%s/Creatives/Creative/CompanionAds/Companion"), "apiFramework", "apiFramework");
        cnf.mo3151a(m5277a("VAST/Ad/%s/Creatives/Creative/CompanionAds/Companion/CompanionClickThrough", true), "destinationUrl");
        cnf.mo3151a(mo3364a("VAST/Ad/%s/Creatives/Creative/CompanionAds/Companion/HTMLResource"), "htmlResource");
        cnf.mo3151a(mo3364a("VAST/Ad/%s/Creatives/Creative/CompanionAds/Companion/IFrameResource"), "iframeResource");
        cnf.mo3151a(m5277a("VAST/Ad/%s/Creatives/Creative/CompanionAds/Companion/StaticResource", true), "staticResource");
        cnf.mo3152a(mo3364a("VAST/Ad/%s/Creatives/Creative/CompanionAds/Companion/StaticResource"), "creativeType", "type");
        cnf.mo3149a(mo3364a("VAST/Ad/%s/Creatives/Creative/CompanionAds/Companion/TrackingEvents/Tracking"), cnm.f6119a);
        cnf.mo3151a(m5277a("VAST/Ad/%s/Creatives/Creative/CompanionAds/Companion/TrackingEvents/Tracking", true), "eventUrl");
        cnf.mo3152a(mo3364a("VAST/Ad/%s/Creatives/Creative/CompanionAds/Companion/TrackingEvents/Tracking"), "event", "eventName");
        cnf.mo3153b(mo3364a("VAST/Ad/%s/Creatives/Creative/CompanionAds/Companion/TrackingEvents/Tracking"), "addEventTracking");
        cnf.mo3149a(mo3364a("VAST/Ad/%s/Creatives/Creative/NonLinearAds/NonLinear"), new cnp(cnf));
        cnf.mo3152a(mo3364a("VAST/Ad/%s/Creatives/Creative/NonLinearAds/NonLinear"), "scalable", "scalable");
        cnf.mo3152a(mo3364a("VAST/Ad/%s/Creatives/Creative/NonLinearAds/NonLinear"), "maintainAspectRatio", "maintainAspectRatio");
        cnf.mo3150a(mo3364a("VAST/Ad/%s/Creatives/Creative/NonLinearAds/NonLinear"), new cnq(cnf));
        cnf.mo3149a(mo3364a("VAST/Ad/%s/Creatives/Creative/NonLinearAds/TrackingEvents/Tracking"), cnn.f6120a);
        cnf.mo3151a(m5277a("VAST/Ad/%s/Creatives/Creative/NonLinearAds/TrackingEvents/Tracking", true), "eventUrl");
        cnf.mo3152a(mo3364a("VAST/Ad/%s/Creatives/Creative/NonLinearAds/TrackingEvents/Tracking"), "event", "eventName");
        cnf.mo3153b(mo3364a("VAST/Ad/%s/Creatives/Creative/NonLinearAds/TrackingEvents/Tracking"), "addNonLinearEventTracking");
        cnf.mo3150a(mo3364a("VAST/Ad/%s/Creatives/Creative/NonLinearAds/NonLinear/AdParameters"), new cnr(cnf));
        cnf.mo3150a(mo3364a("VAST/Ad/%s/Creatives/Creative/NonLinearAds/NonLinear/NonLinearClickThrough"), new cns(cnf));
    }

    public void addVideo(VideoCreative$VastXml$Builder videoCreative$VastXml$Builder) {
        videoCreative$VastXml$Builder.setVastVersion(this.f6432a);
        this.f6433b.add(videoCreative$VastXml$Builder);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.tvlauncher.doubleclick.vast.VastParser.a(java.lang.String, boolean):java.lang.String
     arg types: [java.lang.String, int]
     candidates:
      com.google.android.tvlauncher.doubleclick.vast.VastParser.a(cnf, cob):void
      com.google.android.tvlauncher.doubleclick.vast.VastParser.a(java.lang.String, boolean):java.lang.String */
    /* renamed from: a */
    public final String mo3364a(String str) {
        return m5277a(str, false);
    }

    /* renamed from: a */
    private final String m5277a(String str, boolean z) {
        if (this.f6432a == 1) {
            String str2 = "";
            String replace = str.replace("VAST/", "VideoAdServingTemplate/").replace("/Creatives/Creative", str2).replace("/VASTAdTagURI", "/VASTAdTagURL").replace("/StaticResource", str2).replace("/HTMLResource", "/Code");
            if (replace.endsWith("/Tracking")) {
                str = replace.replace("/Linear", str2);
            } else {
                if (this.f6434c == cob.INLINE) {
                    str2 = "/Video";
                }
                str = replace.replace("/Linear", str2);
            }
            if (z) {
                str = String.valueOf(str).concat("/URL");
            }
        }
        return String.format(str, this.f6434c.f6141c);
    }

    /* renamed from: b */
    public static int m5278b(String str) {
        long j;
        String[] split = str.split(":");
        int length = split.length;
        if (length == 3) {
            j = 0;
        } else if (length != 4) {
            return -1;
        } else {
            try {
                j = Math.round(Double.parseDouble(split[3]));
            } catch (NumberFormatException e) {
                return -1;
            }
        }
        return (int) (TimeUnit.HOURS.toMillis((long) Integer.parseInt(split[0])) + TimeUnit.MINUTES.toMillis((long) Integer.parseInt(split[1])) + Math.round(Double.parseDouble(split[2]) * 1000.0d) + j);
    }

    /* renamed from: c */
    public static final int m5279c(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException e) {
            }
        }
        return 0;
    }
}
