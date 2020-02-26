package com.google.android.tvlauncher.doubleclick.proto;

/* compiled from: PG */
public final class VideoCreative$VastTracking$Builder extends dja implements dkl {
    private VideoCreative$VastTracking$Builder() {
        super(cmx.d);
    }

    public /* synthetic */ VideoCreative$VastTracking$Builder(byte b) {
        super(cmx.d);
    }

    public VideoCreative$VastTracking$Builder setEventName(String str) {
        if (this.b) {
            b();
            this.b = false;
        }
        cmx cmx = (cmx) this.a;
        cmx cmx2 = cmx.d;
        str.getClass();
        cmx.a |= 1;
        cmx.b = str;
        return this;
    }

    public VideoCreative$VastTracking$Builder setEventNameBytes(dik dik) {
        if (this.b) {
            b();
            this.b = false;
        }
        cmx cmx = (cmx) this.a;
        cmx cmx2 = cmx.d;
        cmx.b = dik.d();
        cmx.a |= 1;
        return this;
    }

    public VideoCreative$VastTracking$Builder setEventUrl(String str) {
        if (this.b) {
            b();
            this.b = false;
        }
        cmx cmx = (cmx) this.a;
        cmx cmx2 = cmx.d;
        str.getClass();
        cmx.a |= 2;
        cmx.c = str;
        return this;
    }

    public VideoCreative$VastTracking$Builder setEventUrlBytes(dik dik) {
        if (this.b) {
            b();
            this.b = false;
        }
        cmx cmx = (cmx) this.a;
        cmx cmx2 = cmx.d;
        cmx.c = dik.d();
        cmx.a |= 2;
        return this;
    }
}
