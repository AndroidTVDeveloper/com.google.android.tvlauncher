package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.Set;

/* renamed from: brz  reason: default package */
/* compiled from: PG */
public final class brz extends bwm implements boq, bor {
    private static final cel h = bwh.b;
    public final Context a;
    public final Handler b;
    public final Set c;
    public final bsv d;
    public bwi e;
    public bry f;
    public final cel g;

    public brz(Context context, Handler handler, bsv bsv) {
        cel cel = h;
        this.a = context;
        this.b = handler;
        this.d = (bsv) buh.a(bsv, "ClientSettings must not be null");
        this.c = bsv.a;
        this.g = cel;
    }

    public final void a(Bundle bundle) {
        this.e.a(this);
    }

    public final void a(bno bno) {
        this.f.b(bno);
    }

    public final void a(int i) {
        this.e.d();
    }

    public final void a(bwt bwt) {
        this.b.post(new brx(this, bwt));
    }
}
