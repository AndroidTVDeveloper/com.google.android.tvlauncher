package defpackage;

import android.view.MenuItem;

/* renamed from: fi  reason: default package */
/* compiled from: PG */
public final class fi implements Runnable {
    private final /* synthetic */ fk a;
    private final /* synthetic */ MenuItem b;
    private final /* synthetic */ fo c;
    private final /* synthetic */ fj d;

    public fi(fj fjVar, fk fkVar, MenuItem menuItem, fo foVar) {
        this.d = fjVar;
        this.a = fkVar;
        this.b = menuItem;
        this.c = foVar;
    }

    public final void run() {
        fk fkVar = this.a;
        if (fkVar != null) {
            this.d.a.f = true;
            fkVar.b.a(false);
            this.d.a.f = false;
        }
        if (this.b.isEnabled() && this.b.hasSubMenu()) {
            this.c.a(this.b, 4);
        }
    }
}
