package defpackage;

import android.util.Log;

/* renamed from: bql  reason: default package */
/* compiled from: PG */
final class bql extends bqv {
    private final /* synthetic */ bqp b;
    private final /* synthetic */ bwt c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bql(bqu bqu, bqp bqp, bwt bwt) {
        super(bqu);
        this.b = bqp;
        this.c = bwt;
    }

    public final void a() {
        bqp bqp = this.b;
        bwt bwt = this.c;
        if (bqp.b(0)) {
            bno bno = bwt.a;
            if (bno.b()) {
                buc buc = bwt.b;
                bno bno2 = buc.a;
                if (!bno2.b()) {
                    String valueOf = String.valueOf(bno2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                    sb.append("Sign-in succeeded with resolve account failure: ");
                    sb.append(valueOf);
                    Log.wtf("GACConnecting", sb.toString(), new Exception());
                    bqp.b(bno2);
                    return;
                }
                bqp.g = true;
                bqp.h = buc.a();
                bqp.i = buc.b;
                bqp.j = buc.c;
                bqp.e();
            } else if (bqp.a(bno)) {
                bqp.f();
                bqp.e();
            } else {
                bqp.b(bno);
            }
        }
    }
}
