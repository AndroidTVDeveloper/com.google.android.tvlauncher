package defpackage;

import android.view.View;

/* renamed from: gl  reason: default package */
/* compiled from: PG */
final class gl extends im {
    private final /* synthetic */ gm c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gl(gm gmVar, View view) {
        super(view);
        this.c = gmVar;
    }

    public final fy a() {
        gn gnVar = this.c.a.k;
        if (gnVar != null) {
            return gnVar.a();
        }
        return null;
    }

    public final boolean b() {
        this.c.a.e();
        return true;
    }

    public final boolean c() {
        gp gpVar = this.c.a;
        if (gpVar.m != null) {
            return false;
        }
        gpVar.f();
        return true;
    }
}
