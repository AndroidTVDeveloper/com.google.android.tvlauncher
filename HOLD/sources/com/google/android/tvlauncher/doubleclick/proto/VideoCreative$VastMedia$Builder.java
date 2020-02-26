package com.google.android.tvlauncher.doubleclick.proto;

/* compiled from: PG */
public final class VideoCreative$VastMedia$Builder extends dja implements dkl {
    private VideoCreative$VastMedia$Builder() {
        super(cmv.k);
    }

    public /* synthetic */ VideoCreative$VastMedia$Builder(byte b) {
        super(cmv.k);
    }

    public VideoCreative$VastMedia$Builder setApiFramework(String str) {
        if (this.b) {
            b();
            this.b = false;
        }
        cmv cmv = (cmv) this.a;
        cmv cmv2 = cmv.k;
        str.getClass();
        cmv.a |= 256;
        cmv.j = str;
        return this;
    }

    public VideoCreative$VastMedia$Builder setApiFrameworkBytes(dik dik) {
        if (this.b) {
            b();
            this.b = false;
        }
        cmv cmv = (cmv) this.a;
        cmv cmv2 = cmv.k;
        cmv.j = dik.d();
        cmv.a |= 256;
        return this;
    }

    public VideoCreative$VastMedia$Builder setBitrate(int i) {
        if (this.b) {
            b();
            this.b = false;
        }
        cmv cmv = (cmv) this.a;
        cmv cmv2 = cmv.k;
        cmv.a |= 8;
        cmv.e = i;
        return this;
    }

    public VideoCreative$VastMedia$Builder setDelivery(String str) {
        if (this.b) {
            b();
            this.b = false;
        }
        cmv cmv = (cmv) this.a;
        cmv cmv2 = cmv.k;
        str.getClass();
        cmv.a |= 1;
        cmv.b = str;
        return this;
    }

    public VideoCreative$VastMedia$Builder setDeliveryBytes(dik dik) {
        if (this.b) {
            b();
            this.b = false;
        }
        cmv cmv = (cmv) this.a;
        cmv cmv2 = cmv.k;
        cmv.b = dik.d();
        cmv.a |= 1;
        return this;
    }

    public VideoCreative$VastMedia$Builder setHeight(int i) {
        if (this.b) {
            b();
            this.b = false;
        }
        cmv cmv = (cmv) this.a;
        cmv cmv2 = cmv.k;
        cmv.a |= 32;
        cmv.g = i;
        return this;
    }

    public VideoCreative$VastMedia$Builder setMaintainAspectRatio(boolean z) {
        if (this.b) {
            b();
            this.b = false;
        }
        cmv cmv = (cmv) this.a;
        cmv cmv2 = cmv.k;
        cmv.a |= 128;
        cmv.i = z;
        return this;
    }

    public VideoCreative$VastMedia$Builder setScalable(boolean z) {
        if (this.b) {
            b();
            this.b = false;
        }
        cmv cmv = (cmv) this.a;
        cmv cmv2 = cmv.k;
        cmv.a |= 64;
        cmv.h = z;
        return this;
    }

    public VideoCreative$VastMedia$Builder setType(String str) {
        if (this.b) {
            b();
            this.b = false;
        }
        cmv cmv = (cmv) this.a;
        cmv cmv2 = cmv.k;
        str.getClass();
        cmv.a |= 2;
        cmv.c = str;
        return this;
    }

    public VideoCreative$VastMedia$Builder setTypeBytes(dik dik) {
        if (this.b) {
            b();
            this.b = false;
        }
        cmv cmv = (cmv) this.a;
        cmv cmv2 = cmv.k;
        cmv.c = dik.d();
        cmv.a |= 2;
        return this;
    }

    public VideoCreative$VastMedia$Builder setUrl(String str) {
        if (this.b) {
            b();
            this.b = false;
        }
        cmv cmv = (cmv) this.a;
        cmv cmv2 = cmv.k;
        str.getClass();
        cmv.a |= 4;
        cmv.d = str;
        return this;
    }

    public VideoCreative$VastMedia$Builder setUrlBytes(dik dik) {
        if (this.b) {
            b();
            this.b = false;
        }
        cmv cmv = (cmv) this.a;
        cmv cmv2 = cmv.k;
        cmv.d = dik.d();
        cmv.a |= 4;
        return this;
    }

    public VideoCreative$VastMedia$Builder setWidth(int i) {
        if (this.b) {
            b();
            this.b = false;
        }
        cmv cmv = (cmv) this.a;
        cmv cmv2 = cmv.k;
        cmv.a |= 16;
        cmv.f = i;
        return this;
    }
}
