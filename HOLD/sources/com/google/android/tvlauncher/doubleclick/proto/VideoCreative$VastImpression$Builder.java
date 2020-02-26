package com.google.android.tvlauncher.doubleclick.proto;

/* compiled from: PG */
public final class VideoCreative$VastImpression$Builder extends dja implements dkl {
    private VideoCreative$VastImpression$Builder() {
        super(cmu.d);
    }

    public /* synthetic */ VideoCreative$VastImpression$Builder(byte b) {
        super(cmu.d);
    }

    public VideoCreative$VastImpression$Builder setId(String str) {
        if (this.b) {
            b();
            this.b = false;
        }
        cmu cmu = (cmu) this.a;
        cmu cmu2 = cmu.d;
        str.getClass();
        cmu.a |= 1;
        cmu.b = str;
        return this;
    }

    public VideoCreative$VastImpression$Builder setIdBytes(dik dik) {
        if (this.b) {
            b();
            this.b = false;
        }
        cmu cmu = (cmu) this.a;
        cmu cmu2 = cmu.d;
        cmu.b = dik.d();
        cmu.a |= 1;
        return this;
    }

    public VideoCreative$VastImpression$Builder setUrl(String str) {
        if (this.b) {
            b();
            this.b = false;
        }
        cmu cmu = (cmu) this.a;
        cmu cmu2 = cmu.d;
        str.getClass();
        cmu.a |= 2;
        cmu.c = str;
        return this;
    }

    public VideoCreative$VastImpression$Builder setUrlBytes(dik dik) {
        if (this.b) {
            b();
            this.b = false;
        }
        cmu cmu = (cmu) this.a;
        cmu cmu2 = cmu.d;
        cmu.c = dik.d();
        cmu.a |= 2;
        return this;
    }
}
