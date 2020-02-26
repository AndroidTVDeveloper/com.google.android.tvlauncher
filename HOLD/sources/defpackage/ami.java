package defpackage;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* renamed from: ami  reason: default package */
/* compiled from: PG */
final class ami {
    public final AudioTrack a;
    public final AudioTimestamp b = new AudioTimestamp();
    public long c;
    public long d;
    public long e;

    public ami(AudioTrack audioTrack) {
        this.a = audioTrack;
    }

    public final long a() {
        return this.b.nanoTime / 1000;
    }
}
