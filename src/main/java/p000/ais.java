package p000;

import android.util.Log;

/* renamed from: ais */
/* compiled from: PG */
final /* synthetic */ class ais implements Runnable {

    /* renamed from: a */
    private final ait f408a;

    /* renamed from: b */
    private final int f409b;

    public ais(ait ait, int i) {
        this.f408a = ait;
        this.f409b = i;
    }

    public final void run() {
        char c;
        float f;
        ait ait = this.f408a;
        int i = this.f409b;
        aiv aiv = ait.f410a;
        if (i == -3) {
            aiv.f413b = 3;
            c = 3;
        } else if (i == -2) {
            aiv.f413b = 2;
            c = 2;
        } else if (i == -1) {
            aiv.f413b = -1;
            c = 65535;
        } else if (i != 1) {
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown focus change type: ");
            sb.append(i);
            Log.w("AudioFocusManager", sb.toString());
            return;
        } else {
            aiv.f413b = 1;
            c = 1;
        }
        if (c == 65535) {
            aiv.f412a.mo333a(-1);
            aiv.mo335b();
        } else if (c == 1) {
            aiv.f412a.mo333a(1);
        } else if (c == 2) {
            aiv.f412a.mo333a(0);
        }
        if (aiv.f413b == 3) {
            f = 0.2f;
        } else {
            f = 1.0f;
        }
        if (aiv.f414c != f) {
            aiv.f414c = f;
            ((alc) aiv.f412a).f643a.mo522t();
        }
    }
}
