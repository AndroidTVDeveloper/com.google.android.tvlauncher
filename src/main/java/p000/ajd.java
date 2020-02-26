package p000;

/* renamed from: ajd */
/* compiled from: PG */
public final class ajd implements akk {

    /* renamed from: a */
    public final bhz f433a;

    /* renamed from: b */
    public final long f434b = aja.m633b(15000);

    /* renamed from: c */
    public final long f435c = aja.m633b(50000);

    /* renamed from: d */
    public final long f436d = aja.m633b(50000);

    /* renamed from: e */
    public final long f437e = aja.m633b(2500);

    /* renamed from: f */
    public final long f438f = aja.m633b(5000);

    /* renamed from: g */
    public final long f439g = aja.m633b(0);

    /* renamed from: h */
    public int f440h;

    /* renamed from: i */
    public boolean f441i;

    /* renamed from: j */
    public boolean f442j;

    public ajd() {
        bhz bhz = new bhz();
        m636a(2500, 0, "bufferForPlaybackMs", "0");
        m636a(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        m636a(15000, 2500, "minBufferAudioMs", "bufferForPlaybackMs");
        m636a(50000, 2500, "minBufferVideoMs", "bufferForPlaybackMs");
        m636a(15000, 5000, "minBufferAudioMs", "bufferForPlaybackAfterRebufferMs");
        m636a(50000, 5000, "minBufferVideoMs", "bufferForPlaybackAfterRebufferMs");
        m636a(50000, 15000, "maxBufferMs", "minBufferAudioMs");
        m636a(50000, 50000, "maxBufferMs", "minBufferVideoMs");
        m636a(0, 0, "backBufferDurationMs", "0");
        this.f433a = bhz;
    }

    /* renamed from: a */
    private static void m636a(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        StringBuilder sb = new StringBuilder(str.length() + 21 + str2.length());
        sb.append(str);
        sb.append(" cannot be less than ");
        sb.append(str2);
        bks.m3511a(z, sb.toString());
    }

    /* renamed from: a */
    public final void mo375a(boolean z) {
        this.f440h = 0;
        this.f441i = false;
        if (z) {
            this.f433a.mo1960c();
        }
    }
}
