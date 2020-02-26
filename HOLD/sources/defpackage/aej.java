package defpackage;

import android.graphics.Bitmap;

/* renamed from: aej  reason: default package */
/* compiled from: PG */
public final class aej extends ady implements wr {
    public aej(aeh aeh) {
        super(aeh);
    }

    public final Class a() {
        return aeh.class;
    }

    public final int c() {
        aeo aeo = ((aeh) this.a).a.a;
        tn tnVar = (tn) aeo.a;
        return tnVar.b.limit() + tnVar.d.length + (tnVar.e.length << 2) + aeo.j;
    }

    public final void e() {
        ((aeh) this.a).a().prepareToDraw();
    }

    public final void d() {
        xe xeVar;
        ((aeh) this.a).stop();
        aeh aeh = (aeh) this.a;
        aeh.b = true;
        aeo aeo = aeh.a.a;
        aeo.b.clear();
        aeo.d();
        aeo.b();
        ael ael = aeo.e;
        if (ael != null) {
            aeo.c.a((ahg) ael);
            aeo.e = null;
        }
        ael ael2 = aeo.g;
        if (ael2 != null) {
            aeo.c.a((ahg) ael2);
            aeo.g = null;
        }
        ael ael3 = aeo.i;
        if (ael3 != null) {
            aeo.c.a((ahg) ael3);
            aeo.i = null;
        }
        tn tnVar = (tn) aeo.a;
        tnVar.g = null;
        byte[] bArr = tnVar.d;
        if (bArr != null) {
            tnVar.a.a(bArr);
        }
        int[] iArr = tnVar.e;
        if (!(iArr == null || (xeVar = ((aef) tnVar.a).b) == null)) {
            xeVar.a(iArr);
        }
        Bitmap bitmap = tnVar.h;
        if (bitmap != null) {
            tnVar.a.a(bitmap);
        }
        tnVar.h = null;
        tnVar.b = null;
        tnVar.i = null;
        byte[] bArr2 = tnVar.c;
        if (bArr2 != null) {
            tnVar.a.a(bArr2);
        }
        aeo.f = true;
    }
}
