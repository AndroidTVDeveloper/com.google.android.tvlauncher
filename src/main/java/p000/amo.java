package p000;

import android.media.AudioTrack;

/* renamed from: amo */
/* compiled from: PG */
final class amo extends Thread {

    /* renamed from: a */
    private final /* synthetic */ AudioTrack f788a;

    /* renamed from: b */
    private final /* synthetic */ amu f789b;

    public amo(amu amu, AudioTrack audioTrack) {
        this.f789b = amu;
        this.f788a = audioTrack;
    }

    public final void run() {
        try {
            this.f788a.flush();
            this.f788a.release();
        } finally {
            this.f789b.f827e.open();
        }
    }
}
