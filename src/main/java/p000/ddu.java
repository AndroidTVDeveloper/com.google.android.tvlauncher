package p000;

import android.content.Context;
import android.os.AsyncTask;

/* renamed from: ddu */
/* compiled from: PG */
public final class ddu extends AsyncTask {

    /* renamed from: a */
    private final /* synthetic */ Context f8346a;

    /* renamed from: b */
    private final /* synthetic */ ddv f8347b;

    public ddu(ddv ddv, Context context) {
        this.f8347b = ddv;
        this.f8346a = context;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        this.f8347b.mo4166a(this.f8346a);
        return null;
    }

    /* access modifiers changed from: protected */
    public final void onCancelled() {
        super.onCancelled();
        this.f8347b.f8349b = false;
    }
}
