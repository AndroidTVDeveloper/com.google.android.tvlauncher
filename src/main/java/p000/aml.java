package p000;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* renamed from: aml */
/* compiled from: PG */
final class aml {

    /* renamed from: a */
    public final amk f754a;

    /* renamed from: b */
    public final long[] f755b;

    /* renamed from: c */
    public AudioTrack f756c;

    /* renamed from: d */
    public int f757d;

    /* renamed from: e */
    public int f758e;

    /* renamed from: f */
    public amj f759f;

    /* renamed from: g */
    public int f760g;

    /* renamed from: h */
    public boolean f761h;

    /* renamed from: i */
    public long f762i;

    /* renamed from: j */
    public long f763j;

    /* renamed from: k */
    public long f764k;

    /* renamed from: l */
    public Method f765l;

    /* renamed from: m */
    public long f766m;

    /* renamed from: n */
    public boolean f767n;

    /* renamed from: o */
    public boolean f768o;

    /* renamed from: p */
    public long f769p;

    /* renamed from: q */
    public long f770q;

    /* renamed from: r */
    public long f771r;

    /* renamed from: s */
    public long f772s;

    /* renamed from: t */
    public int f773t;

    /* renamed from: u */
    public int f774u;

    /* renamed from: v */
    public long f775v;

    /* renamed from: w */
    public long f776w;

    /* renamed from: x */
    public long f777x;

    /* renamed from: y */
    public long f778y;

    public aml(amk amk) {
        this.f754a = (amk) bks.m3507a(amk);
        if (blm.f4293a >= 18) {
            try {
                this.f765l = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException e) {
            }
        }
        this.f755b = new long[10];
    }

    /* renamed from: b */
    public final long mo651b(long j) {
        return (j * 1000000) / ((long) this.f760g);
    }

    /* renamed from: c */
    public final long mo652c() {
        AudioTrack audioTrack = (AudioTrack) bks.m3507a(this.f756c);
        if (this.f775v != -9223372036854775807L) {
            return Math.min(this.f778y, this.f777x + ((((SystemClock.elapsedRealtime() * 1000) - this.f775v) * ((long) this.f760g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f761h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f772s = this.f770q;
            }
            playbackHeadPosition += this.f772s;
        }
        if (blm.f4293a <= 29) {
            if (playbackHeadPosition == 0 && this.f770q > 0 && playState == 3) {
                if (this.f776w == -9223372036854775807L) {
                    this.f776w = SystemClock.elapsedRealtime();
                }
                return this.f770q;
            }
            this.f776w = -9223372036854775807L;
        }
        if (this.f770q > playbackHeadPosition) {
            this.f771r++;
        }
        this.f770q = playbackHeadPosition;
        return playbackHeadPosition + (this.f771r << 32);
    }

    /* renamed from: b */
    public final long mo650b() {
        return mo651b(mo652c());
    }

    /* renamed from: a */
    public final boolean mo649a(long j) {
        if (j <= mo652c()) {
            return this.f761h && ((AudioTrack) bks.m3507a(this.f756c)).getPlayState() == 2 && mo652c() == 0;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo648a() {
        this.f763j = 0;
        this.f774u = 0;
        this.f773t = 0;
        this.f764k = 0;
    }
}
