package p000;

import android.content.Context;

/* renamed from: cer */
/* compiled from: PG */
public final class cer implements boy {

    /* renamed from: a */
    private final /* synthetic */ Context f5383a;

    /* renamed from: b */
    private final /* synthetic */ bos f5384b;

    /* renamed from: c */
    private final /* synthetic */ ces f5385c;

    public cer(ces ces, Context context, bos bos) {
        this.f5385c = ces;
        this.f5383a = context;
        this.f5384b = bos;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2254a(box box) {
        bxs bxs = (bxs) box;
        if (bxs.mo2253a().mo3189b()) {
            this.f5385c.f5386a = bxs.mo2530b();
            this.f5383a.getSharedPreferences("com.google.android.libraries.social.silentfeedback.usageReporting", 0).edit().putBoolean("optedIn", this.f5385c.f5386a).apply();
        }
        this.f5384b.mo2247c();
    }
}
