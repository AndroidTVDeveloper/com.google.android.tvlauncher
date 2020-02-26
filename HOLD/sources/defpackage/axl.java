package defpackage;

import java.io.EOFException;

/* renamed from: axl  reason: default package */
/* compiled from: PG */
final class axl {
    public aoi a;
    private final aoi[] b;

    public axl(aoi[] aoiArr) {
        this.b = aoiArr;
    }

    public final aoi a(aoj aoj, aok aok) {
        aoi aoi = this.a;
        if (aoi != null) {
            return aoi;
        }
        aoi[] aoiArr = this.b;
        int length = aoiArr.length;
        int i = 0;
        if (length != 1) {
            while (true) {
                if (i >= length) {
                    break;
                }
                aoi aoi2 = aoiArr[i];
                try {
                    if (aoi2.a(aoj)) {
                        this.a = aoi2;
                        aoj.a();
                        break;
                    }
                    aoj.a();
                    i++;
                } catch (EOFException e) {
                } catch (Throwable th) {
                    aoj.a();
                    throw th;
                }
            }
            if (this.a == null) {
                String b2 = blm.b(this.b);
                StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 58);
                sb.append("None of the available extractors (");
                sb.append(b2);
                sb.append(") could read the stream.");
                throw new ayf(sb.toString());
            }
        } else {
            this.a = aoiArr[0];
        }
        this.a.a(aok);
        return this.a;
    }
}
