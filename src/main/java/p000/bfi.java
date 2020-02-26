package p000;

import java.util.ArrayList;
import java.util.Collections;

/* renamed from: bfi */
/* compiled from: PG */
public final class bfi extends anm {

    /* renamed from: d */
    private final bky f3674d = new bky();

    /* renamed from: e */
    private final bfl f3675e = new bfl();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bdl mo1155a(byte[] bArr, int i, boolean z) {
        this.f3674d.mo2068a(bArr, i);
        ArrayList arrayList = new ArrayList();
        while (this.f3674d.mo2070b() > 0) {
            if (this.f3674d.mo2070b() >= 8) {
                int j = this.f3674d.mo2083j();
                if (this.f3674d.mo2083j() != 1987343459) {
                    this.f3674d.mo2075d(j - 8);
                } else {
                    bky bky = this.f3674d;
                    bfl bfl = this.f3675e;
                    int i2 = j - 8;
                    bfl.mo1820a();
                    while (i2 > 0) {
                        if (i2 >= 8) {
                            int j2 = bky.mo2083j();
                            int j3 = bky.mo2083j();
                            int i3 = j2 - 8;
                            String a = blm.m3641a(bky.f4258a, bky.f4259b, i3);
                            bky.mo2075d(i3);
                            i2 = (i2 - 8) - i3;
                            if (j3 == 1937011815) {
                                bfp.m3063a(a, bfl);
                            } else if (j3 == 1885436268) {
                                bfp.m3065a(null, a.trim(), bfl, Collections.emptyList());
                            }
                        } else {
                            throw new bdn("Incomplete vtt cue box header found.");
                        }
                    }
                    arrayList.add(bfl.mo1821b());
                }
            } else {
                throw new bdn("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new bfj(arrayList);
    }
}
