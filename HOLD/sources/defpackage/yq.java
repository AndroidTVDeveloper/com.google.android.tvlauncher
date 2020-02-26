package defpackage;

/* renamed from: yq  reason: default package */
/* compiled from: PG */
public final class yq {
    private final ahz a = new ahz(1000);
    private final cz b = aim.a(10, new yo());

    public final String a(ts tsVar) {
        String str;
        synchronized (this.a) {
            str = (String) this.a.b(tsVar);
        }
        if (str == null) {
            yp ypVar = (yp) aic.a((yp) this.b.a());
            try {
                tsVar.a(ypVar.a);
                byte[] digest = ypVar.a.digest();
                synchronized (aie.b) {
                    char[] cArr = aie.b;
                    for (int i = 0; i < digest.length; i++) {
                        byte b2 = digest[i] & 255;
                        int i2 = i + i;
                        cArr[i2] = aie.a[b2 >>> 4];
                        cArr[i2 + 1] = aie.a[b2 & 15];
                    }
                    str = new String(cArr);
                }
                this.b.a(ypVar);
            } catch (Throwable th) {
                this.b.a(ypVar);
                throw th;
            }
        }
        synchronized (this.a) {
            this.a.b(tsVar, str);
        }
        return str;
    }
}
