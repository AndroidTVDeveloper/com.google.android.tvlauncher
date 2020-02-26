package p000;

import android.os.SystemClock;
import android.util.Log;

/* renamed from: amt */
/* compiled from: PG */
final class amt implements amk {

    /* renamed from: a */
    private final /* synthetic */ amu f807a;

    public /* synthetic */ amt(amu amu) {
        this.f807a = amu;
    }

    /* renamed from: a */
    public final void mo645a(long j) {
        StringBuilder sb = new StringBuilder(61);
        sb.append("Ignoring impossibly large audio latency: ");
        sb.append(j);
        Log.w("AudioTrack", sb.toString());
    }

    /* renamed from: a */
    public final void mo646a(long j, long j2, long j3, long j4) {
        long j5 = this.f807a.mo670j();
        long k = this.f807a.mo671k();
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

    /* renamed from: b */
    public final void mo647b(long j, long j2, long j3, long j4) {
        long j5 = this.f807a.mo670j();
        long k = this.f807a.mo671k();
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

    /* renamed from: a */
    public final void mo644a(int i, long j) {
        if (this.f807a.f830h != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            amu amu = this.f807a;
            long j2 = elapsedRealtime - amu.f809B;
            amb amb = ((amx) amu.f830h).f853a.f855f;
            if (amb.f742b != null) {
                amb.f741a.post(new aly(amb, i, j, j2));
            }
        }
    }
}
