package defpackage;

/* renamed from: xb  reason: default package */
/* compiled from: PG */
final class xb implements uf {
    private final /* synthetic */ aai a;
    private final /* synthetic */ xc b;

    public xb(xc xcVar, aai aai) {
        this.b = xcVar;
        this.a = aai;
    }

    public final void a(Object obj) {
        if (this.b.a(this.a)) {
            xc xcVar = this.b;
            aai aai = this.a;
            vy vyVar = xcVar.a.p;
            if (obj != null && vyVar.a(aai.c.d())) {
                xcVar.c = obj;
                xcVar.b.c();
                return;
            }
            vk vkVar = xcVar.b;
            ts tsVar = aai.a;
            ug ugVar = aai.c;
            vkVar.a(tsVar, obj, ugVar, ugVar.d(), xcVar.d);
        }
    }

    public final void a(Exception exc) {
        if (this.b.a(this.a)) {
            xc xcVar = this.b;
            aai aai = this.a;
            vk vkVar = xcVar.b;
            vi viVar = xcVar.d;
            ug ugVar = aai.c;
            vkVar.a(viVar, exc, ugVar, ugVar.d());
        }
    }
}
