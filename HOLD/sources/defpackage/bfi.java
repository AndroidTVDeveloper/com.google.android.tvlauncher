package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* renamed from: bfi  reason: default package */
/* compiled from: PG */
public final class bfi extends anm {
    private final bky d = new bky();
    private final bfl e = new bfl();

    /* access modifiers changed from: protected */
    public final bdl a(byte[] bArr, int i, boolean z) {
        this.d.a(bArr, i);
        ArrayList arrayList = new ArrayList();
        while (this.d.b() > 0) {
            if (this.d.b() >= 8) {
                int j = this.d.j();
                if (this.d.j() != 1987343459) {
                    this.d.d(j - 8);
                } else {
                    bky bky = this.d;
                    bfl bfl = this.e;
                    int i2 = j - 8;
                    bfl.a();
                    while (i2 > 0) {
                        if (i2 >= 8) {
                            int j2 = bky.j();
                            int j3 = bky.j();
                            int i3 = j2 - 8;
                            String a = blm.a(bky.a, bky.b, i3);
                            bky.d(i3);
                            i2 = (i2 - 8) - i3;
                            if (j3 == 1937011815) {
                                bfp.a(a, bfl);
                            } else if (j3 == 1885436268) {
                                bfp.a(null, a.trim(), bfl, Collections.emptyList());
                            }
                        } else {
                            throw new bdn("Incomplete vtt cue box header found.");
                        }
                    }
                    arrayList.add(bfl.b());
                }
            } else {
                throw new bdn("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new bfj(arrayList);
    }
}
