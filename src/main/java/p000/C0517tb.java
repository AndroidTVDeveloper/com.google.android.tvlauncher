package p000;

import java.io.IOException;

/* renamed from: tb */
/* compiled from: PG */
public final class C0517tb {

    /* renamed from: a */
    public final C0518tc f10436a;

    /* renamed from: b */
    public final boolean[] f10437b;

    /* renamed from: c */
    public boolean f10438c;

    /* renamed from: d */
    public final /* synthetic */ C0520te f10439d;

    public /* synthetic */ C0517tb(C0520te teVar, C0518tc tcVar) {
        this.f10439d = teVar;
        this.f10436a = tcVar;
        this.f10437b = !tcVar.f10443d ? new boolean[teVar.f10451d] : null;
    }

    /* renamed from: a */
    public final void mo5960a() {
        this.f10439d.mo5967a(this, false);
    }

    /* renamed from: b */
    public final void mo5961b() {
        if (!this.f10438c) {
            try {
                mo5960a();
            } catch (IOException e) {
            }
        }
    }
}
