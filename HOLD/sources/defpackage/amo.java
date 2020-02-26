package defpackage;

import android.media.AudioTrack;

/* renamed from: amo  reason: default package */
/* compiled from: PG */
final class amo extends Thread {
    private final /* synthetic */ AudioTrack a;
    private final /* synthetic */ amu b;

    public amo(amu amu, AudioTrack audioTrack) {
        this.b = amu;
        this.a = audioTrack;
    }

    public final void run() {
        try {
            this.a.flush();
            this.a.release();
        } finally {
            this.b.e.open();
        }
    }
}
