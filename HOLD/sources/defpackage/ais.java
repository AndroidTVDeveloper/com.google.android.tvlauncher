package defpackage;

import android.util.Log;

/* renamed from: ais  reason: default package */
/* compiled from: PG */
final /* synthetic */ class ais implements Runnable {
    private final ait a;
    private final int b;

    public ais(ait ait, int i) {
        this.a = ait;
        this.b = i;
    }

    public final void run() {
        char c;
        float f;
        ait ait = this.a;
        int i = this.b;
        aiv aiv = ait.a;
        if (i == -3) {
            aiv.b = 3;
            c = 3;
        } else if (i == -2) {
            aiv.b = 2;
            c = 2;
        } else if (i == -1) {
            aiv.b = -1;
            c = 65535;
        } else if (i != 1) {
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown focus change type: ");
            sb.append(i);
            Log.w("AudioFocusManager", sb.toString());
            return;
        } else {
            aiv.b = 1;
            c = 1;
        }
        if (c == 65535) {
            aiv.a.a(-1);
            aiv.b();
        } else if (c == 1) {
            aiv.a.a(1);
        } else if (c == 2) {
            aiv.a.a(0);
        }
        if (aiv.b == 3) {
            f = 0.2f;
        } else {
            f = 1.0f;
        }
        if (aiv.c != f) {
            aiv.c = f;
            ((alc) aiv.a).a.t();
        }
    }
}
