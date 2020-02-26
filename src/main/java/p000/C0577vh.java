package p000;

import java.io.File;
import java.util.List;

/* renamed from: vh */
/* compiled from: PG */
final class C0577vh implements C0581vl, C0548uf {

    /* renamed from: a */
    private final List f10575a;

    /* renamed from: b */
    private final C0582vm f10576b;

    /* renamed from: c */
    private final C0580vk f10577c;

    /* renamed from: d */
    private int f10578d;

    /* renamed from: e */
    private C0534ts f10579e;

    /* renamed from: f */
    private List f10580f;

    /* renamed from: g */
    private int f10581g;

    /* renamed from: h */
    private volatile aai f10582h;

    /* renamed from: i */
    private File f10583i;

    public C0577vh(C0582vm vmVar, C0580vk vkVar) {
        this(vmVar.mo6035d(), vmVar, vkVar);
    }

    public C0577vh(List list, C0582vm vmVar, C0580vk vkVar) {
        this.f10578d = -1;
        this.f10575a = list;
        this.f10576b = vmVar;
        this.f10577c = vkVar;
    }

    /* renamed from: b */
    public final void mo6023b() {
        aai aai = this.f10582h;
        if (aai != null) {
            aai.f14c.mo9c();
        }
    }

    /* renamed from: c */
    private final boolean m8472c() {
        return this.f10581g < this.f10580f.size();
    }

    /* renamed from: a */
    public final void mo22a(Object obj) {
        this.f10577c.mo6026a(this.f10579e, obj, this.f10582h.f14c, 3, this.f10579e);
    }

    /* renamed from: a */
    public final void mo21a(Exception exc) {
        this.f10577c.mo6025a(this.f10579e, exc, this.f10582h.f14c, 3);
    }

    /* renamed from: a */
    public final boolean mo6022a() {
        while (true) {
            boolean z = false;
            if (this.f10580f == null || !m8472c()) {
                int i = this.f10578d + 1;
                this.f10578d = i;
                if (i >= this.f10575a.size()) {
                    return false;
                }
                C0534ts tsVar = (C0534ts) this.f10575a.get(this.f10578d);
                File a = this.f10576b.mo6029a().mo6128a(new C0578vi(tsVar, this.f10576b.f10602n));
                this.f10583i = a;
                if (a != null) {
                    this.f10579e = tsVar;
                    this.f10580f = this.f10576b.mo6028a(a);
                    this.f10581g = 0;
                }
            } else {
                this.f10582h = null;
                while (!z && m8472c()) {
                    List list = this.f10580f;
                    int i2 = this.f10581g;
                    this.f10581g = i2 + 1;
                    File file = this.f10583i;
                    C0582vm vmVar = this.f10576b;
                    this.f10582h = ((aaj) list.get(i2)).mo11a(file, vmVar.f10593e, vmVar.f10594f, vmVar.f10597i);
                    if (this.f10582h != null && this.f10576b.mo6030a(this.f10582h.f14c.mo6a())) {
                        this.f10582h.f14c.mo7a(this.f10576b.f10603o, this);
                        z = true;
                    }
                }
                return z;
            }
        }
    }
}
