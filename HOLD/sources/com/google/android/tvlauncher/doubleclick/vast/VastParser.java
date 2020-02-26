package com.google.android.tvlauncher.doubleclick.vast;

import android.text.TextUtils;
import com.google.android.tvlauncher.doubleclick.proto.VideoCreative$VastXml$Builder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
public class VastParser {
    public int a;
    public List b = new ArrayList();
    public cob c;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.tvlauncher.doubleclick.vast.VastParser.a(java.lang.String, boolean):java.lang.String
     arg types: [java.lang.String, int]
     candidates:
      com.google.android.tvlauncher.doubleclick.vast.VastParser.a(cnf, cob):void
      com.google.android.tvlauncher.doubleclick.vast.VastParser.a(java.lang.String, boolean):java.lang.String */
    public final void a(cnf cnf, cob cob) {
        this.c = cob;
        cnf.a(a("VAST/Ad/%s/Creatives/Creative"), "AdID", "adId");
        cnf.a(a("VAST/Ad/%s/Creatives/Creative"), new cnv(cnf));
        cnf.a(a("VAST/Ad/%s/Survey"), "survey");
        cnf.a(a("VAST/Ad/%s/Impression", true), cnh.a);
        cnf.a(a("VAST/Ad/%s/Impression", true), "url");
        cnf.a(a("VAST/Ad/%s/Impression", true), "id", "id");
        cnf.b(a("VAST/Ad/%s/Impression", true), "addImpression");
        cnf.a(a("VAST/Ad/%s/VASTAdTagURI", true), "redirectUrl");
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/Linear/Duration"), new cnw(cnf));
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/Linear/AdParameters"), new cnx(cnf));
        cnf.a(a("VAST/Ad/%s/Extensions/Extension"), new cny(cnf));
        cnf.a(a("VAST/Ad/%s/Extensions/Extension/CustomTracking/Tracking"), new cnz(cnf));
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/Linear/AdParameters"), "customParameters");
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/Linear/TrackingEvents/Tracking"), cni.a);
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/Linear/TrackingEvents/Tracking", true), "eventUrl");
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/Linear/TrackingEvents/Tracking"), "event", "eventName");
        cnf.b(a("VAST/Ad/%s/Creatives/Creative/Linear/TrackingEvents/Tracking"), "addEventTracking");
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/Linear/VideoClicks/ClickThrough", true), new coa(cnf));
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/Linear/VideoClicks/ClickTracking", true), cnj.a);
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/Linear/VideoClicks/ClickTracking", true), "eventUrl");
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/Linear/VideoClicks/ClickTracking", true), "id", "eventName");
        cnf.b(a("VAST/Ad/%s/Creatives/Creative/Linear/VideoClicks/ClickTracking", true), "addClickTracking");
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/Linear/VideoClicks/CustomClick", true), cnk.a);
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/Linear/VideoClicks/CustomClick", true), "eventUrl");
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/Linear/VideoClicks/CustomClick", true), "id", "eventName");
        cnf.b(a("VAST/Ad/%s/Creatives/Creative/Linear/VideoClicks/CustomClick", true), "addCustomTracking");
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/Linear/MediaFiles/MediaFile"), cnl.a);
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/Linear/MediaFiles/MediaFile", true), "url");
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/Linear/MediaFiles/MediaFile"), "delivery", "delivery");
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/Linear/MediaFiles/MediaFile"), "type", "type");
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/Linear/MediaFiles/MediaFile"), "bitrate", "bitrate");
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/Linear/MediaFiles/MediaFile"), "width", "width");
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/Linear/MediaFiles/MediaFile"), "height", "height");
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/Linear/MediaFiles/MediaFile"), "scalable", "scalable");
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/Linear/MediaFiles/MediaFile"), "apiFramework", "apiFramework");
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/Linear/MediaFiles/MediaFile"), "maintainAspectRatio", "maintainAspectRatio");
        cnf.b(a("VAST/Ad/%s/Creatives/Creative/Linear/MediaFiles/MediaFile"), "addMedia");
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/CompanionAds/Companion"), new cno(cnf));
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/CompanionAds/Companion"), "width", "width");
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/CompanionAds/Companion"), "height", "height");
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/CompanionAds/Companion"), "expandedWidth", "expandedWidth");
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/CompanionAds/Companion"), "expandedHeight", "expandedHeight");
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/CompanionAds/Companion"), "apiFramework", "apiFramework");
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/CompanionAds/Companion/CompanionClickThrough", true), "destinationUrl");
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/CompanionAds/Companion/HTMLResource"), "htmlResource");
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/CompanionAds/Companion/IFrameResource"), "iframeResource");
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/CompanionAds/Companion/StaticResource", true), "staticResource");
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/CompanionAds/Companion/StaticResource"), "creativeType", "type");
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/CompanionAds/Companion/TrackingEvents/Tracking"), cnm.a);
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/CompanionAds/Companion/TrackingEvents/Tracking", true), "eventUrl");
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/CompanionAds/Companion/TrackingEvents/Tracking"), "event", "eventName");
        cnf.b(a("VAST/Ad/%s/Creatives/Creative/CompanionAds/Companion/TrackingEvents/Tracking"), "addEventTracking");
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/NonLinearAds/NonLinear"), new cnp(cnf));
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/NonLinearAds/NonLinear"), "scalable", "scalable");
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/NonLinearAds/NonLinear"), "maintainAspectRatio", "maintainAspectRatio");
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/NonLinearAds/NonLinear"), new cnq(cnf));
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/NonLinearAds/TrackingEvents/Tracking"), cnn.a);
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/NonLinearAds/TrackingEvents/Tracking", true), "eventUrl");
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/NonLinearAds/TrackingEvents/Tracking"), "event", "eventName");
        cnf.b(a("VAST/Ad/%s/Creatives/Creative/NonLinearAds/TrackingEvents/Tracking"), "addNonLinearEventTracking");
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/NonLinearAds/NonLinear/AdParameters"), new cnr(cnf));
        cnf.a(a("VAST/Ad/%s/Creatives/Creative/NonLinearAds/NonLinear/NonLinearClickThrough"), new cns(cnf));
    }

    public void addVideo(VideoCreative$VastXml$Builder videoCreative$VastXml$Builder) {
        videoCreative$VastXml$Builder.setVastVersion(this.a);
        this.b.add(videoCreative$VastXml$Builder);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.tvlauncher.doubleclick.vast.VastParser.a(java.lang.String, boolean):java.lang.String
     arg types: [java.lang.String, int]
     candidates:
      com.google.android.tvlauncher.doubleclick.vast.VastParser.a(cnf, cob):void
      com.google.android.tvlauncher.doubleclick.vast.VastParser.a(java.lang.String, boolean):java.lang.String */
    public final String a(String str) {
        return a(str, false);
    }

    private final String a(String str, boolean z) {
        if (this.a == 1) {
            String str2 = "";
            String replace = str.replace("VAST/", "VideoAdServingTemplate/").replace("/Creatives/Creative", str2).replace("/VASTAdTagURI", "/VASTAdTagURL").replace("/StaticResource", str2).replace("/HTMLResource", "/Code");
            if (replace.endsWith("/Tracking")) {
                str = replace.replace("/Linear", str2);
            } else {
                if (this.c == cob.INLINE) {
                    str2 = "/Video";
                }
                str = replace.replace("/Linear", str2);
            }
            if (z) {
                str = String.valueOf(str).concat("/URL");
            }
        }
        return String.format(str, this.c.c);
    }

    public static int b(String str) {
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

    public static final int c(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException e) {
            }
        }
        return 0;
    }
}
