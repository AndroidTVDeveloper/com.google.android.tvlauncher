package defpackage;

import android.app.Activity;
import java.util.concurrent.TimeUnit;

/* renamed from: bzx  reason: default package */
/* compiled from: PG */
final class bzx implements bzb {
    public final /* synthetic */ bzz a;

    public bzx(bzz bzz) {
        this.a = bzz;
    }

    public final void a(Activity activity) {
        String simpleName = activity.getClass().getSimpleName();
        this.a.b.a(4, simpleName);
        this.a.a();
        bzz bzz = this.a;
        bzz.c = ((dhe) bzz.e.a()).a(new bzw(this, simpleName), 10, TimeUnit.SECONDS);
    }
}
