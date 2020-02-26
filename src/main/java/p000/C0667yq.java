package p000;

/* renamed from: yq */
/* compiled from: PG */
public final class C0667yq {

    /* renamed from: a */
    private final ahz f10827a = new ahz(1000);

    /* renamed from: b */
    private final C0082cz f10828b = aim.m576a(10, new C0665yo());

    /* renamed from: a */
    public final String mo6134a(C0534ts tsVar) {
        String str;
        synchronized (this.f10827a) {
            str = (String) this.f10827a.mo296b(tsVar);
        }
        if (str == null) {
            C0666yp ypVar = (C0666yp) aic.m542a((C0666yp) this.f10828b.mo317a());
            try {
                tsVar.mo37a(ypVar.f10825a);
                byte[] digest = ypVar.f10825a.digest();
                synchronized (aie.f399b) {
                    char[] cArr = aie.f399b;
                    for (int i = 0; i < digest.length; i++) {
                        byte b = digest[i] & 255;
                        int i2 = i + i;
                        cArr[i2] = aie.f398a[b >>> 4];
                        cArr[i2 + 1] = aie.f398a[b & 15];
                    }
                    str = new String(cArr);
                }
                this.f10828b.mo318a(ypVar);
            } catch (Throwable th) {
                this.f10828b.mo318a(ypVar);
                throw th;
            }
        }
        synchronized (this.f10827a) {
            this.f10827a.mo297b(tsVar, str);
        }
        return str;
    }
}
