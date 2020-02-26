package p000;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* renamed from: ami */
/* compiled from: PG */
final class ami {

    /* renamed from: a */
    public final AudioTrack f743a;

    /* renamed from: b */
    public final AudioTimestamp f744b = new AudioTimestamp();

    /* renamed from: c */
    public long f745c;

    /* renamed from: d */
    public long f746d;

    /* renamed from: e */
    public long f747e;

    public ami(AudioTrack audioTrack) {
        this.f743a = audioTrack;
    }

    /* renamed from: a */
    public final long mo638a() {
        return this.f744b.nanoTime / 1000;
    }
}
