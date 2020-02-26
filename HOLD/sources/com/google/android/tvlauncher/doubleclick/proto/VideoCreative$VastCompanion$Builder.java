package com.google.android.tvlauncher.doubleclick.proto;

/* compiled from: PG */
public final class VideoCreative$VastCompanion$Builder extends dja implements dkl {
    private VideoCreative$VastCompanion$Builder() {
        super(cmt.m);
    }

    public /* synthetic */ VideoCreative$VastCompanion$Builder(byte b) {
        super(cmt.m);
    }

    public VideoCreative$VastCompanion$Builder addAllEventTracking(Iterable iterable) {
        if (this.b) {
            b();
            this.b = false;
        }
        cmt cmt = (cmt) this.a;
        cmt cmt2 = cmt.m;
        cmt.a();
        dht.a(iterable, cmt.l);
        return this;
    }

    public VideoCreative$VastCompanion$Builder addEventTracking(VideoCreative$VastTracking$Builder videoCreative$VastTracking$Builder) {
        if (this.b) {
            b();
            this.b = false;
        }
        cmt cmt = (cmt) this.a;
        cmx cmx = (cmx) videoCreative$VastTracking$Builder.g();
        cmt cmt2 = cmt.m;
        cmx.getClass();
        cmt.a();
        cmt.l.add(cmx);
        return this;
    }

    public VideoCreative$VastCompanion$Builder addEventTracking(cmx cmx) {
        if (this.b) {
            b();
            this.b = false;
        }
        cmt cmt = (cmt) this.a;
        cmt cmt2 = cmt.m;
        cmx.getClass();
        cmt.a();
        cmt.l.add(cmx);
        return this;
    }

    public VideoCreative$VastCompanion$Builder setApiFramework(String str) {
        if (this.b) {
            b();
            this.b = false;
        }
        cmt cmt = (cmt) this.a;
        cmt cmt2 = cmt.m;
        str.getClass();
        cmt.a |= 512;
        cmt.k = str;
        return this;
    }

    public VideoCreative$VastCompanion$Builder setApiFrameworkBytes(dik dik) {
        if (this.b) {
            b();
            this.b = false;
        }
        cmt cmt = (cmt) this.a;
        cmt cmt2 = cmt.m;
        cmt.k = dik.d();
        cmt.a |= 512;
        return this;
    }

    public VideoCreative$VastCompanion$Builder setDestinationUrl(String str) {
        if (this.b) {
            b();
            this.b = false;
        }
        cmt cmt = (cmt) this.a;
        cmt cmt2 = cmt.m;
        str.getClass();
        cmt.a |= 16;
        cmt.f = str;
        return this;
    }

    public VideoCreative$VastCompanion$Builder setDestinationUrlBytes(dik dik) {
        if (this.b) {
            b();
            this.b = false;
        }
        cmt cmt = (cmt) this.a;
        cmt cmt2 = cmt.m;
        cmt.f = dik.d();
        cmt.a |= 16;
        return this;
    }

    public VideoCreative$VastCompanion$Builder setExpandedHeight(int i) {
        if (this.b) {
            b();
            this.b = false;
        }
        cmt cmt = (cmt) this.a;
        cmt cmt2 = cmt.m;
        cmt.a |= 256;
        cmt.j = i;
        return this;
    }

    public VideoCreative$VastCompanion$Builder setExpandedWidth(int i) {
        if (this.b) {
            b();
            this.b = false;
        }
        cmt cmt = (cmt) this.a;
        cmt cmt2 = cmt.m;
        cmt.a |= 128;
        cmt.i = i;
        return this;
    }

    public VideoCreative$VastCompanion$Builder setHeight(int i) {
        if (this.b) {
            b();
            this.b = false;
        }
        cmt cmt = (cmt) this.a;
        cmt cmt2 = cmt.m;
        cmt.a |= 64;
        cmt.h = i;
        return this;
    }

    public VideoCreative$VastCompanion$Builder setHtmlResource(String str) {
        if (this.b) {
            b();
            this.b = false;
        }
        cmt cmt = (cmt) this.a;
        cmt cmt2 = cmt.m;
        str.getClass();
        cmt.a |= 1;
        cmt.b = str;
        return this;
    }

    public VideoCreative$VastCompanion$Builder setHtmlResourceBytes(dik dik) {
        if (this.b) {
            b();
            this.b = false;
        }
        cmt cmt = (cmt) this.a;
        cmt cmt2 = cmt.m;
        cmt.b = dik.d();
        cmt.a |= 1;
        return this;
    }

    public VideoCreative$VastCompanion$Builder setIframeResource(String str) {
        if (this.b) {
            b();
            this.b = false;
        }
        cmt cmt = (cmt) this.a;
        cmt cmt2 = cmt.m;
        str.getClass();
        cmt.a |= 2;
        cmt.c = str;
        return this;
    }

    public VideoCreative$VastCompanion$Builder setIframeResourceBytes(dik dik) {
        if (this.b) {
            b();
            this.b = false;
        }
        cmt cmt = (cmt) this.a;
        cmt cmt2 = cmt.m;
        cmt.c = dik.d();
        cmt.a |= 2;
        return this;
    }

    public VideoCreative$VastCompanion$Builder setStaticResource(String str) {
        if (this.b) {
            b();
            this.b = false;
        }
        cmt cmt = (cmt) this.a;
        cmt cmt2 = cmt.m;
        str.getClass();
        cmt.a |= 4;
        cmt.d = str;
        return this;
    }

    public VideoCreative$VastCompanion$Builder setStaticResourceBytes(dik dik) {
        if (this.b) {
            b();
            this.b = false;
        }
        cmt cmt = (cmt) this.a;
        cmt cmt2 = cmt.m;
        cmt.d = dik.d();
        cmt.a |= 4;
        return this;
    }

    public VideoCreative$VastCompanion$Builder setType(String str) {
        if (this.b) {
            b();
            this.b = false;
        }
        cmt cmt = (cmt) this.a;
        cmt cmt2 = cmt.m;
        str.getClass();
        cmt.a |= 8;
        cmt.e = str;
        return this;
    }

    public VideoCreative$VastCompanion$Builder setTypeBytes(dik dik) {
        if (this.b) {
            b();
            this.b = false;
        }
        cmt cmt = (cmt) this.a;
        cmt cmt2 = cmt.m;
        cmt.e = dik.d();
        cmt.a |= 8;
        return this;
    }

    public VideoCreative$VastCompanion$Builder setWidth(int i) {
        if (this.b) {
            b();
            this.b = false;
        }
        cmt cmt = (cmt) this.a;
        cmt cmt2 = cmt.m;
        cmt.a |= 32;
        cmt.g = i;
        return this;
    }
}
