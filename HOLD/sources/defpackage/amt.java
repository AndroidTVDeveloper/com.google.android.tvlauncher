package defpackage;

import android.os.SystemClock;
import android.util.Log;

/* renamed from: amt  reason: default package */
/* compiled from: PG */
final class amt implements amk {
    private final /* synthetic */ amu a;

    public /* synthetic */ amt(amu amu) {
        this.a = amu;
    }

    public final void a(long j) {
        StringBuilder sb = new StringBuilder(61);
        sb.append("Ignoring impossibly large audio latency: ");
        sb.append(j);
        Log.w("AudioTrack", sb.toString());
    }

    public final void a(long j, long j2, long j3, long j4) {
        long j5 = this.a.j();
        long k = this.a.k();
        StringBuilder sb = new StringBuilder(182);
        sb.append("Spurious audio timestamp (frame position mismatch): ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(", ");
        sb.append(j4);
        sb.append(", ");
        sb.append(j5);
        sb.append(", ");
        sb.append(k);
        Log.w("AudioTrack", sb.toString());
    }

    public final void b(long j, long j2, long j3, long j4) {
        long j5 = this.a.j();
        long k = this.a.k();
        StringBuilder sb = new StringBuilder(180);
        sb.append("Spurious audio timestamp (system clock mismatch): ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(", ");
        sb.append(j4);
        sb.append(", ");
        sb.append(j5);
        sb.append(", ");
        sb.append(k);
        Log.w("AudioTrack", sb.toString());
    }

    public final void a(int i, long j) {
        if (this.a.h != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            amu amu = this.a;
            long j2 = elapsedRealtime - amu.B;
            amb amb = ((amx) amu.h).a.f;
            if (amb.b != null) {
                amb.a.post(new aly(amb, i, j, j2));
            }
        }
    }
}
