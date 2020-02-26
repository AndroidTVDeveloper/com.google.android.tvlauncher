package p000;

import android.util.Log;

/* renamed from: bql */
/* compiled from: PG */
final class bql extends bqv {

    /* renamed from: b */
    private final /* synthetic */ bqp f4588b;

    /* renamed from: c */
    private final /* synthetic */ bwt f4589c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bql(bqu bqu, bqp bqp, bwt bwt) {
        super(bqu);
        this.f4588b = bqp;
        this.f4589c = bwt;
    }

    /* renamed from: a */
    public final void mo2304a() {
        bqp bqp = this.f4588b;
        bwt bwt = this.f4589c;
        if (bqp.mo2321b(0)) {
            bno bno = bwt.f4959a;
            if (bno.mo2195b()) {
                buc buc = bwt.f4960b;
                bno bno2 = buc.f4840a;
                if (!bno2.mo2195b()) {
                    String valueOf = String.valueOf(bno2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                    sb.append("Sign-in succeeded with resolve account failure: ");
                    sb.append(valueOf);
                    Log.wtf("GACConnecting", sb.toString(), new Exception());
                    bqp.mo2319b(bno2);
                    return;
                }
                bqp.f4599g = true;
                bqp.f4600h = buc.mo2445a();
                bqp.f4601i = buc.f4841b;
                bqp.f4602j = buc.f4842c;
                bqp.mo2323e();
            } else if (bqp.mo2318a(bno)) {
                bqp.mo2324f();
                bqp.mo2323e();
            } else {
                bqp.mo2319b(bno);
            }
        }
    }
}
