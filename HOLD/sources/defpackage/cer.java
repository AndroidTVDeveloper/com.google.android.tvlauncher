package defpackage;

import android.content.Context;

/* renamed from: cer  reason: default package */
/* compiled from: PG */
public final class cer implements boy {
    private final /* synthetic */ Context a;
    private final /* synthetic */ bos b;
    private final /* synthetic */ ces c;

    public cer(ces ces, Context context, bos bos) {
        this.c = ces;
        this.a = context;
        this.b = bos;
    }

    public final /* bridge */ /* synthetic */ void a(box box) {
        bxs bxs = (bxs) box;
        if (bxs.a().b()) {
            this.c.a = bxs.b();
            this.a.getSharedPreferences("com.google.android.libraries.social.silentfeedback.usageReporting", 0).edit().putBoolean("optedIn", this.c.a).apply();
        }
        this.b.c();
    }
}
