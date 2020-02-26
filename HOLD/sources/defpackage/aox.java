package defpackage;

import android.util.Pair;
import java.util.Collections;
import java.util.List;

/* renamed from: aox  reason: default package */
/* compiled from: PG */
final class aox extends apb {
    private static final int[] a = {5512, 11025, 22050, 44100};
    private boolean c;
    private boolean d;
    private int e;

    public aox(aov aov) {
        super(aov);
    }

    /* access modifiers changed from: protected */
    public final boolean a(bky bky) {
        String str;
        if (!this.c) {
            int d2 = bky.d();
            int i = (d2 >> 4) & 15;
            this.e = i;
            if (i == 2) {
                this.b.a(akh.a((String) null, "audio/mpeg", -1, -1, 1, a[(d2 >> 2) & 3], (List) null, (anq) null, (String) null));
                this.d = true;
            } else {
                if (i == 7) {
                    str = "audio/g711-alaw";
                } else if (i == 8) {
                    str = "audio/g711-mlaw";
                } else if (i != 10) {
                    StringBuilder sb = new StringBuilder(39);
                    sb.append("Audio format not supported: ");
                    sb.append(i);
                    throw new apa(sb.toString());
                }
                this.b.a(akh.a(null, str, -1, -1, 1, 8000, (d2 & 1) == 0 ? 3 : 2, null, null, 0, null));
                this.d = true;
            }
            this.c = true;
        } else {
            bky.d(1);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean a(bky bky, long j) {
        if (this.e == 2) {
            int b = bky.b();
            this.b.a(bky, b);
            this.b.a(j, 1, b, 0, null);
            return true;
        }
        int d2 = bky.d();
        if (d2 == 0 && !this.d) {
            int b2 = bky.b();
            byte[] bArr = new byte[b2];
            bky.a(bArr, 0, b2);
            Pair a2 = bkg.a(bArr);
            this.b.a(akh.a((String) null, "audio/mp4a-latm", -1, -1, ((Integer) a2.second).intValue(), ((Integer) a2.first).intValue(), Collections.singletonList(bArr), (anq) null, (String) null));
            this.d = true;
            return false;
        } else if (this.e == 10 && d2 != 1) {
            return false;
        } else {
            int b3 = bky.b();
            this.b.a(bky, b3);
            this.b.a(j, 1, b3, 0, null);
            return true;
        }
    }
}
