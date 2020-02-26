package com.google.android.tvlauncher.doubleclick.proto;

/* compiled from: PG */
public final class VideoCreative$VastTracking$Builder extends dja implements dkl {
    private VideoCreative$VastTracking$Builder() {
        super(cmx.f6059d);
    }

    public /* synthetic */ VideoCreative$VastTracking$Builder(byte b) {
        super(cmx.f6059d);
    }

    public VideoCreative$VastTracking$Builder setEventName(String str) {
        if (this.f8673b) {
            mo4505b();
            this.f8673b = false;
        }
        cmx cmx = (cmx) this.f8672a;
        cmx cmx2 = cmx.f6059d;
        str.getClass();
        cmx.f6060a |= 1;
        cmx.f6061b = str;
        return this;
    }

    public VideoCreative$VastTracking$Builder setEventNameBytes(dik dik) {
        if (this.f8673b) {
            mo4505b();
            this.f8673b = false;
        }
        cmx cmx = (cmx) this.f8672a;
        cmx cmx2 = cmx.f6059d;
        cmx.f6061b = dik.mo4419d();
        cmx.f6060a |= 1;
        return this;
    }

    public VideoCreative$VastTracking$Builder setEventUrl(String str) {
        if (this.f8673b) {
            mo4505b();
            this.f8673b = false;
        }
        cmx cmx = (cmx) this.f8672a;
        cmx cmx2 = cmx.f6059d;
        str.getClass();
        cmx.f6060a |= 2;
        cmx.f6062c = str;
        return this;
    }

    public VideoCreative$VastTracking$Builder setEventUrlBytes(dik dik) {
        if (this.f8673b) {
            mo4505b();
            this.f8673b = false;
        }
        cmx cmx = (cmx) this.f8672a;
        cmx cmx2 = cmx.f6059d;
        cmx.f6062c = dik.mo4419d();
        cmx.f6060a |= 2;
        return this;
    }
}
