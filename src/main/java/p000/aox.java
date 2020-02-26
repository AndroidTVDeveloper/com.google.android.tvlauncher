package p000;

import android.util.Pair;
import java.util.Collections;
import java.util.List;

/* renamed from: aox */
/* compiled from: PG */
final class aox extends apb {

    /* renamed from: a */
    private static final int[] f1543a = {5512, 11025, 22050, 44100};

    /* renamed from: c */
    private boolean f1544c;

    /* renamed from: d */
    private boolean f1545d;

    /* renamed from: e */
    private int f1546e;

    public aox(aov aov) {
        super(aov);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo1224a(bky bky) {
        String str;
        if (!this.f1544c) {
            int d = bky.mo2074d();
            int i = (d >> 4) & 15;
            this.f1546e = i;
            if (i == 2) {
                this.f1566b.mo1204a(akh.m731a((String) null, "audio/mpeg", -1, -1, 1, f1543a[(d >> 2) & 3], (List) null, (anq) null, (String) null));
                this.f1545d = true;
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
                this.f1566b.mo1204a(akh.m730a(null, str, -1, -1, 1, 8000, (d & 1) == 0 ? 3 : 2, null, null, 0, null));
                this.f1545d = true;
            }
            this.f1544c = true;
        } else {
            bky.mo2075d(1);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo1225a(bky bky, long j) {
        if (this.f1546e == 2) {
            int b = bky.mo2070b();
            this.f1566b.mo1205a(bky, b);
            this.f1566b.mo1203a(j, 1, b, 0, null);
            return true;
        }
        int d = bky.mo2074d();
        if (d == 0 && !this.f1545d) {
            int b2 = bky.mo2070b();
            byte[] bArr = new byte[b2];
            bky.mo2069a(bArr, 0, b2);
            Pair a = bkg.m3480a(bArr);
            this.f1566b.mo1204a(akh.m731a((String) null, "audio/mp4a-latm", -1, -1, ((Integer) a.second).intValue(), ((Integer) a.first).intValue(), Collections.singletonList(bArr), (anq) null, (String) null));
            this.f1545d = true;
            return false;
        } else if (this.f1546e == 10 && d != 1) {
            return false;
        } else {
            int b3 = bky.mo2070b();
            this.f1566b.mo1205a(bky, b3);
            this.f1566b.mo1203a(j, 1, b3, 0, null);
            return true;
        }
    }
}
