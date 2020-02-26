package p000;

/* renamed from: ao */
/* compiled from: PG */
public final class C0014ao extends C0569v {

    /* renamed from: b */
    private static final C0596w f1466b = new C0013an();

    /* renamed from: a */
    public final C0088de f1467a = new C0088de();

    /* renamed from: a */
    static C0014ao m1606a(C0650y yVar) {
        C0623x xVar = new C0623x(yVar);
        Class<C0014ao> cls = C0014ao.class;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            String str = "android.arch.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName;
            Object obj = (C0569v) xVar.f10755a.f10804a.get(str);
            if (!cls.isInstance(obj)) {
                obj = new C0014ao();
                C0569v vVar = (C0569v) xVar.f10755a.f10804a.put(str, obj);
                if (vVar != null) {
                    vVar.mo1179a();
                }
            }
            return (C0014ao) obj;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1179a() {
        C0088de deVar = this.f1467a;
        int i = deVar.f8361e;
        if (i <= 0) {
            Object[] objArr = deVar.f8360d;
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = null;
            }
            deVar.f8361e = 0;
            deVar.f8358b = false;
            return;
        }
        C0012am amVar = (C0012am) deVar.mo4171b(0);
        throw null;
    }
}
