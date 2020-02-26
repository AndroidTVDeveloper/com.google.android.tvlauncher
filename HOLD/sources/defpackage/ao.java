package defpackage;

/* renamed from: ao  reason: default package */
/* compiled from: PG */
public final class ao extends v {
    private static final w b = new an();
    public final de a = new de();

    static ao a(y yVar) {
        x xVar = new x(yVar);
        Class<ao> cls = ao.class;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            String str = "android.arch.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName;
            Object obj = (v) xVar.a.a.get(str);
            if (!cls.isInstance(obj)) {
                obj = new ao();
                v vVar = (v) xVar.a.a.put(str, obj);
                if (vVar != null) {
                    vVar.a();
                }
            }
            return (ao) obj;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* access modifiers changed from: protected */
    public final void a() {
        de deVar = this.a;
        int i = deVar.e;
        if (i <= 0) {
            Object[] objArr = deVar.d;
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = null;
            }
            deVar.e = 0;
            deVar.b = false;
            return;
        }
        am amVar = (am) deVar.b(0);
        throw null;
    }
}
