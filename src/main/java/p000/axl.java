package p000;

import java.io.EOFException;

/* renamed from: axl */
/* compiled from: PG */
final class axl {

    /* renamed from: a */
    public aoi f2628a;

    /* renamed from: b */
    private final aoi[] f2629b;

    public axl(aoi[] aoiArr) {
        this.f2629b = aoiArr;
    }

    /* renamed from: a */
    public final aoi mo1541a(aoj aoj, aok aok) {
        aoi aoi = this.f2628a;
        if (aoi != null) {
            return aoi;
        }
        aoi[] aoiArr = this.f2629b;
        int length = aoiArr.length;
        int i = 0;
        if (length != 1) {
            while (true) {
                if (i >= length) {
                    break;
                }
                aoi aoi2 = aoiArr[i];
                try {
                    if (aoi2.mo1209a(aoj)) {
                        this.f2628a = aoi2;
                        aoj.mo1191a();
                        break;
                    }
                    aoj.mo1191a();
                    i++;
                } catch (EOFException e) {
                } catch (Throwable th) {
                    aoj.mo1191a();
                    throw th;
                }
            }
            if (this.f2628a == null) {
                String b = blm.m3666b(this.f2629b);
                StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 58);
                sb.append("None of the available extractors (");
                sb.append(b);
                sb.append(") could read the stream.");
                throw new ayf(sb.toString());
            }
        } else {
            this.f2628a = aoiArr[0];
        }
        this.f2628a.mo1208a(aok);
        return this.f2628a;
    }
}
