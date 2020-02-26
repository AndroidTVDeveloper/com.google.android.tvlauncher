package defpackage;

import android.content.Context;
import android.os.AsyncTask;

/* renamed from: ddu  reason: default package */
/* compiled from: PG */
public final class ddu extends AsyncTask {
    private final /* synthetic */ Context a;
    private final /* synthetic */ ddv b;

    public ddu(ddv ddv, Context context) {
        this.b = ddv;
        this.a = context;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        this.b.a(this.a);
        return null;
    }

    /* access modifiers changed from: protected */
    public final void onCancelled() {
        super.onCancelled();
        this.b.b = false;
    }
}
