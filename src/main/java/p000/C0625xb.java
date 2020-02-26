package p000;

/* renamed from: xb */
/* compiled from: PG */
final class C0625xb implements C0548uf {

    /* renamed from: a */
    private final /* synthetic */ aai f10758a;

    /* renamed from: b */
    private final /* synthetic */ C0626xc f10759b;

    public C0625xb(C0626xc xcVar, aai aai) {
        this.f10759b = xcVar;
        this.f10758a = aai;
    }

    /* renamed from: a */
    public final void mo22a(Object obj) {
        if (this.f10759b.mo6093a(this.f10758a)) {
            C0626xc xcVar = this.f10759b;
            aai aai = this.f10758a;
            C0594vy vyVar = xcVar.f10760a.f10604p;
            if (obj != null && vyVar.mo6050a(aai.f14c.mo10d())) {
                xcVar.f10762c = obj;
                xcVar.f10761b.mo6027c();
                return;
            }
            C0580vk vkVar = xcVar.f10761b;
            C0534ts tsVar = aai.f12a;
            C0549ug ugVar = aai.f14c;
            vkVar.mo6026a(tsVar, obj, ugVar, ugVar.mo10d(), xcVar.f10763d);
        }
    }

    /* renamed from: a */
    public final void mo21a(Exception exc) {
        if (this.f10759b.mo6093a(this.f10758a)) {
            C0626xc xcVar = this.f10759b;
            aai aai = this.f10758a;
            C0580vk vkVar = xcVar.f10761b;
            C0578vi viVar = xcVar.f10763d;
            C0549ug ugVar = aai.f14c;
            vkVar.mo6025a(viVar, exc, ugVar, ugVar.mo10d());
        }
    }
}
