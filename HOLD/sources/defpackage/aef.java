package defpackage;

import android.graphics.Bitmap;

/* renamed from: aef  reason: default package */
/* compiled from: PG */
public final class aef implements ti {
    public final xg a;
    public final xe b;

    public aef(xg xgVar, xe xeVar) {
        this.a = xgVar;
        this.b = xeVar;
    }

    public final byte[] a(int i) {
        xe xeVar = this.b;
        if (xeVar != null) {
            return (byte[]) xeVar.a(i, byte[].class);
        }
        return new byte[i];
    }

    public final void a(Bitmap bitmap) {
        this.a.a(bitmap);
    }

    public final void a(byte[] bArr) {
        xe xeVar = this.b;
        if (xeVar != null) {
            xeVar.a(bArr);
        }
    }
}
