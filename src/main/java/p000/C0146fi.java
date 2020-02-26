package p000;

import android.view.MenuItem;

/* renamed from: fi */
/* compiled from: PG */
public final class C0146fi implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C0148fk f9263a;

    /* renamed from: b */
    private final /* synthetic */ MenuItem f9264b;

    /* renamed from: c */
    private final /* synthetic */ C0152fo f9265c;

    /* renamed from: d */
    private final /* synthetic */ C0147fj f9266d;

    public C0146fi(C0147fj fjVar, C0148fk fkVar, MenuItem menuItem, C0152fo foVar) {
        this.f9266d = fjVar;
        this.f9263a = fkVar;
        this.f9264b = menuItem;
        this.f9265c = foVar;
    }

    public final void run() {
        C0148fk fkVar = this.f9263a;
        if (fkVar != null) {
            this.f9266d.f9267a.f9276f = true;
            fkVar.f9269b.mo4863a(false);
            this.f9266d.f9267a.f9276f = false;
        }
        if (this.f9264b.isEnabled() && this.f9264b.hasSubMenu()) {
            this.f9265c.mo4865a(this.f9264b, 4);
        }
    }
}
