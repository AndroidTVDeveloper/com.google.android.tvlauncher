package p000;

import android.graphics.Bitmap;

/* renamed from: aej */
/* compiled from: PG */
public final class aej extends ady implements C0614wr {
    public aej(aeh aeh) {
        super(aeh);
    }

    /* renamed from: a */
    public final Class mo32a() {
        return aeh.class;
    }

    /* renamed from: c */
    public final int mo34c() {
        aeo aeo = ((aeh) this.f164a).f175a.f174a;
        C0529tn tnVar = (C0529tn) aeo.f191a;
        return tnVar.f10498b.limit() + tnVar.f10500d.length + (tnVar.f10501e.length << 2) + aeo.f200j;
    }

    /* renamed from: e */
    public final void mo41e() {
        ((aeh) this.f164a).mo98a().prepareToDraw();
    }

    /* renamed from: d */
    public final void mo35d() {
        C0628xe xeVar;
        ((aeh) this.f164a).stop();
        aeh aeh = (aeh) this.f164a;
        aeh.f176b = true;
        aeo aeo = aeh.f175a.f174a;
        aeo.f192b.clear();
        aeo.mo121d();
        aeo.mo119b();
        ael ael = aeo.f195e;
        if (ael != null) {
            aeo.f193c.mo5947a((ahg) ael);
            aeo.f195e = null;
        }
        ael ael2 = aeo.f197g;
        if (ael2 != null) {
            aeo.f193c.mo5947a((ahg) ael2);
            aeo.f197g = null;
        }
        ael ael3 = aeo.f199i;
        if (ael3 != null) {
            aeo.f193c.mo5947a((ahg) ael3);
            aeo.f199i = null;
        }
        C0529tn tnVar = (C0529tn) aeo.f191a;
        tnVar.f10503g = null;
        byte[] bArr = tnVar.f10500d;
        if (bArr != null) {
            tnVar.f10497a.mo93a(bArr);
        }
        int[] iArr = tnVar.f10501e;
        if (!(iArr == null || (xeVar = ((aef) tnVar.f10497a).f173b) == null)) {
            xeVar.mo6102a(iArr);
        }
        Bitmap bitmap = tnVar.f10504h;
        if (bitmap != null) {
            tnVar.f10497a.mo92a(bitmap);
        }
        tnVar.f10504h = null;
        tnVar.f10498b = null;
        tnVar.f10505i = null;
        byte[] bArr2 = tnVar.f10499c;
        if (bArr2 != null) {
            tnVar.f10497a.mo93a(bArr2);
        }
        aeo.f196f = true;
    }
}
