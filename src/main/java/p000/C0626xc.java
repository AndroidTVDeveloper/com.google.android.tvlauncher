package p000;

import java.util.Collections;
import java.util.List;

/* renamed from: xc */
/* compiled from: PG */
final class C0626xc implements C0581vl, C0580vk {

    /* renamed from: a */
    public final C0582vm f10760a;

    /* renamed from: b */
    public final C0580vk f10761b;

    /* renamed from: c */
    public Object f10762c;

    /* renamed from: d */
    public C0578vi f10763d;

    /* renamed from: e */
    private int f10764e;

    /* renamed from: f */
    private C0577vh f10765f;

    /* renamed from: g */
    private volatile aai f10766g;

    public C0626xc(C0582vm vmVar, C0580vk vkVar) {
        this.f10760a = vmVar;
        this.f10761b = vkVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo6093a(aai aai) {
        aai aai2 = this.f10766g;
        return aai2 != null && aai2 == aai;
    }

    /* renamed from: c */
    public final void mo6027c() {
        throw null;
    }

    /* renamed from: b */
    public final void mo6023b() {
        aai aai = this.f10766g;
        if (aai != null) {
            aai.f14c.mo9c();
        }
    }

    /* renamed from: a */
    public final void mo6025a(C0534ts tsVar, Exception exc, C0549ug ugVar, int i) {
        this.f10761b.mo6025a(tsVar, exc, ugVar, this.f10766g.f14c.mo10d());
    }

    /* renamed from: a */
    public final void mo6026a(C0534ts tsVar, Object obj, C0549ug ugVar, int i, C0534ts tsVar2) {
        this.f10761b.mo6026a(tsVar, obj, ugVar, this.f10766g.f14c.mo10d(), tsVar);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final boolean mo6022a() {
        Object obj = this.f10762c;
        if (obj != null) {
            this.f10762c = null;
            ahy.m529a();
            try {
                C0531tp a = this.f10760a.f10591c.f10384c.f10396b.mo180a(obj.getClass());
                if (a != null) {
                    C0579vj vjVar = new C0579vj(a, obj, this.f10760a.f10597i);
                    this.f10763d = new C0578vi(this.f10766g.f12a, this.f10760a.f10602n);
                    this.f10760a.mo6029a().mo6129a(this.f10763d, vjVar);
                    this.f10766g.f14c.mo8b();
                    this.f10765f = new C0577vh(Collections.singletonList(this.f10766g.f12a), this.f10760a, this);
                } else {
                    throw new C0506sr(obj.getClass());
                }
            } catch (Throwable th) {
                this.f10766g.f14c.mo8b();
                throw th;
            }
        }
        C0577vh vhVar = this.f10765f;
        if (vhVar != null && vhVar.mo6022a()) {
            return true;
        }
        this.f10765f = null;
        this.f10766g = null;
        boolean z = false;
        while (!z && this.f10764e < this.f10760a.mo6033c().size()) {
            List c = this.f10760a.mo6033c();
            int i = this.f10764e;
            this.f10764e = i + 1;
            this.f10766g = (aai) c.get(i);
            if (this.f10766g != null && (this.f10760a.f10604p.mo6050a(this.f10766g.f14c.mo10d()) || this.f10760a.mo6030a(this.f10766g.f14c.mo6a()))) {
                this.f10766g.f14c.mo7a(this.f10760a.f10603o, new C0625xb(this, this.f10766g));
                z = true;
            }
        }
        return z;
    }
}
