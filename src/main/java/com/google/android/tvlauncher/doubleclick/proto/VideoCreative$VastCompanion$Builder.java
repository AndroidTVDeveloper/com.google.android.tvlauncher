package com.google.android.tvlauncher.doubleclick.proto;

/* compiled from: PG */
public final class VideoCreative$VastCompanion$Builder extends dja implements dkl {
    private VideoCreative$VastCompanion$Builder() {
        super(cmt.f6013m);
    }

    public /* synthetic */ VideoCreative$VastCompanion$Builder(byte b) {
        super(cmt.f6013m);
    }

    public VideoCreative$VastCompanion$Builder addAllEventTracking(Iterable iterable) {
        if (this.f8673b) {
            mo4505b();
            this.f8673b = false;
        }
        cmt cmt = (cmt) this.f8672a;
        cmt cmt2 = cmt.f6013m;
        cmt.mo3116a();
        dht.m6456a(iterable, cmt.f6025l);
        return this;
    }

    public VideoCreative$VastCompanion$Builder addEventTracking(VideoCreative$VastTracking$Builder videoCreative$VastTracking$Builder) {
        if (this.f8673b) {
            mo4505b();
            this.f8673b = false;
        }
        cmt cmt = (cmt) this.f8672a;
        cmx cmx = (cmx) videoCreative$VastTracking$Builder.mo4509g();
        cmt cmt2 = cmt.f6013m;
        cmx.getClass();
        cmt.mo3116a();
        cmt.f6025l.add(cmx);
        return this;
    }

    public VideoCreative$VastCompanion$Builder addEventTracking(cmx cmx) {
        if (this.f8673b) {
            mo4505b();
            this.f8673b = false;
        }
        cmt cmt = (cmt) this.f8672a;
        cmt cmt2 = cmt.f6013m;
        cmx.getClass();
        cmt.mo3116a();
        cmt.f6025l.add(cmx);
        return this;
    }

    public VideoCreative$VastCompanion$Builder setApiFramework(String str) {
        if (this.f8673b) {
            mo4505b();
            this.f8673b = false;
        }
        cmt cmt = (cmt) this.f8672a;
        cmt cmt2 = cmt.f6013m;
        str.getClass();
        cmt.f6014a |= 512;
        cmt.f6024k = str;
        return this;
    }

    public VideoCreative$VastCompanion$Builder setApiFrameworkBytes(dik dik) {
        if (this.f8673b) {
            mo4505b();
            this.f8673b = false;
        }
        cmt cmt = (cmt) this.f8672a;
        cmt cmt2 = cmt.f6013m;
        cmt.f6024k = dik.mo4419d();
        cmt.f6014a |= 512;
        return this;
    }

    public VideoCreative$VastCompanion$Builder setDestinationUrl(String str) {
        if (this.f8673b) {
            mo4505b();
            this.f8673b = false;
        }
        cmt cmt = (cmt) this.f8672a;
        cmt cmt2 = cmt.f6013m;
        str.getClass();
        cmt.f6014a |= 16;
        cmt.f6019f = str;
        return this;
    }

    public VideoCreative$VastCompanion$Builder setDestinationUrlBytes(dik dik) {
        if (this.f8673b) {
            mo4505b();
            this.f8673b = false;
        }
        cmt cmt = (cmt) this.f8672a;
        cmt cmt2 = cmt.f6013m;
        cmt.f6019f = dik.mo4419d();
        cmt.f6014a |= 16;
        return this;
    }

    public VideoCreative$VastCompanion$Builder setExpandedHeight(int i) {
        if (this.f8673b) {
            mo4505b();
            this.f8673b = false;
        }
        cmt cmt = (cmt) this.f8672a;
        cmt cmt2 = cmt.f6013m;
        cmt.f6014a |= 256;
        cmt.f6023j = i;
        return this;
    }

    public VideoCreative$VastCompanion$Builder setExpandedWidth(int i) {
        if (this.f8673b) {
            mo4505b();
            this.f8673b = false;
        }
        cmt cmt = (cmt) this.f8672a;
        cmt cmt2 = cmt.f6013m;
        cmt.f6014a |= 128;
        cmt.f6022i = i;
        return this;
    }

    public VideoCreative$VastCompanion$Builder setHeight(int i) {
        if (this.f8673b) {
            mo4505b();
            this.f8673b = false;
        }
        cmt cmt = (cmt) this.f8672a;
        cmt cmt2 = cmt.f6013m;
        cmt.f6014a |= 64;
        cmt.f6021h = i;
        return this;
    }

    public VideoCreative$VastCompanion$Builder setHtmlResource(String str) {
        if (this.f8673b) {
            mo4505b();
            this.f8673b = false;
        }
        cmt cmt = (cmt) this.f8672a;
        cmt cmt2 = cmt.f6013m;
        str.getClass();
        cmt.f6014a |= 1;
        cmt.f6015b = str;
        return this;
    }

    public VideoCreative$VastCompanion$Builder setHtmlResourceBytes(dik dik) {
        if (this.f8673b) {
            mo4505b();
            this.f8673b = false;
        }
        cmt cmt = (cmt) this.f8672a;
        cmt cmt2 = cmt.f6013m;
        cmt.f6015b = dik.mo4419d();
        cmt.f6014a |= 1;
        return this;
    }

    public VideoCreative$VastCompanion$Builder setIframeResource(String str) {
        if (this.f8673b) {
            mo4505b();
            this.f8673b = false;
        }
        cmt cmt = (cmt) this.f8672a;
        cmt cmt2 = cmt.f6013m;
        str.getClass();
        cmt.f6014a |= 2;
        cmt.f6016c = str;
        return this;
    }

    public VideoCreative$VastCompanion$Builder setIframeResourceBytes(dik dik) {
        if (this.f8673b) {
            mo4505b();
            this.f8673b = false;
        }
        cmt cmt = (cmt) this.f8672a;
        cmt cmt2 = cmt.f6013m;
        cmt.f6016c = dik.mo4419d();
        cmt.f6014a |= 2;
        return this;
    }

    public VideoCreative$VastCompanion$Builder setStaticResource(String str) {
        if (this.f8673b) {
            mo4505b();
            this.f8673b = false;
        }
        cmt cmt = (cmt) this.f8672a;
        cmt cmt2 = cmt.f6013m;
        str.getClass();
        cmt.f6014a |= 4;
        cmt.f6017d = str;
        return this;
    }

    public VideoCreative$VastCompanion$Builder setStaticResourceBytes(dik dik) {
        if (this.f8673b) {
            mo4505b();
            this.f8673b = false;
        }
        cmt cmt = (cmt) this.f8672a;
        cmt cmt2 = cmt.f6013m;
        cmt.f6017d = dik.mo4419d();
        cmt.f6014a |= 4;
        return this;
    }

    public VideoCreative$VastCompanion$Builder setType(String str) {
        if (this.f8673b) {
            mo4505b();
            this.f8673b = false;
        }
        cmt cmt = (cmt) this.f8672a;
        cmt cmt2 = cmt.f6013m;
        str.getClass();
        cmt.f6014a |= 8;
        cmt.f6018e = str;
        return this;
    }

    public VideoCreative$VastCompanion$Builder setTypeBytes(dik dik) {
        if (this.f8673b) {
            mo4505b();
            this.f8673b = false;
        }
        cmt cmt = (cmt) this.f8672a;
        cmt cmt2 = cmt.f6013m;
        cmt.f6018e = dik.mo4419d();
        cmt.f6014a |= 8;
        return this;
    }

    public VideoCreative$VastCompanion$Builder setWidth(int i) {
        if (this.f8673b) {
            mo4505b();
            this.f8673b = false;
        }
        cmt cmt = (cmt) this.f8672a;
        cmt cmt2 = cmt.f6013m;
        cmt.f6014a |= 32;
        cmt.f6020g = i;
        return this;
    }
}
