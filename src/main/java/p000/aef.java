package p000;

import android.graphics.Bitmap;

/* renamed from: aef */
/* compiled from: PG */
public final class aef implements C0524ti {

    /* renamed from: a */
    public final C0630xg f172a;

    /* renamed from: b */
    public final C0628xe f173b;

    public aef(C0630xg xgVar, C0628xe xeVar) {
        this.f172a = xgVar;
        this.f173b = xeVar;
    }

    /* renamed from: a */
    public final byte[] mo94a(int i) {
        C0628xe xeVar = this.f173b;
        if (xeVar != null) {
            return (byte[]) xeVar.mo6098a(i, byte[].class);
        }
        return new byte[i];
    }

    /* renamed from: a */
    public final void mo92a(Bitmap bitmap) {
        this.f172a.mo60a(bitmap);
    }

    /* renamed from: a */
    public final void mo93a(byte[] bArr) {
        C0628xe xeVar = this.f173b;
        if (xeVar != null) {
            xeVar.mo6102a(bArr);
        }
    }
}
