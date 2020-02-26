package defpackage;

/* renamed from: ajd  reason: default package */
/* compiled from: PG */
public final class ajd implements akk {
    public final bhz a;
    public final long b = aja.b(15000);
    public final long c = aja.b(50000);
    public final long d = aja.b(50000);
    public final long e = aja.b(2500);
    public final long f = aja.b(5000);
    public final long g = aja.b(0);
    public int h;
    public boolean i;
    public boolean j;

    public ajd() {
        bhz bhz = new bhz();
        a(2500, 0, "bufferForPlaybackMs", "0");
        a(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(15000, 2500, "minBufferAudioMs", "bufferForPlaybackMs");
        a(50000, 2500, "minBufferVideoMs", "bufferForPlaybackMs");
        a(15000, 5000, "minBufferAudioMs", "bufferForPlaybackAfterRebufferMs");
        a(50000, 5000, "minBufferVideoMs", "bufferForPlaybackAfterRebufferMs");
        a(50000, 15000, "maxBufferMs", "minBufferAudioMs");
        a(50000, 50000, "maxBufferMs", "minBufferVideoMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.a = bhz;
    }

    private static void a(int i2, int i3, String str, String str2) {
        boolean z = i2 >= i3;
        StringBuilder sb = new StringBuilder(str.length() + 21 + str2.length());
        sb.append(str);
        sb.append(" cannot be less than ");
        sb.append(str2);
        bks.a(z, sb.toString());
    }

    public final void a(boolean z) {
        this.h = 0;
        this.i = false;
        if (z) {
            this.a.c();
        }
    }
}
