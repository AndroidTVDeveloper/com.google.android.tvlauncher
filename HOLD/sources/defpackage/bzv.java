package defpackage;

import android.app.Activity;
import java.util.concurrent.TimeUnit;

/* renamed from: bzv  reason: default package */
/* compiled from: PG */
final class bzv implements bza {
    public final /* synthetic */ bzz a;

    public bzv(bzz bzz) {
        this.a = bzz;
    }

    public final void b(Activity activity) {
        String simpleName = activity.getClass().getSimpleName();
        this.a.b.a(3, simpleName);
        this.a.a();
        bzz bzz = this.a;
        bzz.d = ((dhe) bzz.e.a()).a(new bzu(this, simpleName), 10, TimeUnit.SECONDS);
    }
}
